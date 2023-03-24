package com.geektech.tradehouse.presentation.ui.create_ad

import android.net.Uri
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.tradehouse.R
import com.geektech.tradehouse.data.network.model.HouseModelCreateDTO
import com.geektech.tradehouse.databinding.FragmentCreateAdBinding
import com.geektech.tradehouse.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.ByteArrayOutputStream
import java.io.File

@AndroidEntryPoint
class CreateAdFragment : BaseFragment<
        FragmentCreateAdBinding,
        CreateAdViewModel>(R.layout.fragment_create_ad) {
    override val binding by viewBinding(FragmentCreateAdBinding::bind)
    override val viewModel by viewModels<CreateAdViewModel>()
    private var imageUri: Uri? = null

    override fun setupListeners() {
        var selectType : String
        with(binding){
            val type = resources.getStringArray(R.array.TypeAdCreate)
            if(spnType != null) {
                val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, type)
                spnType.adapter = adapter
                spnType.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        selectType = type[p2]
                        Log.e("TAG", selectType, )
                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {

                    }

                }
            }

            imgSelect.setOnClickListener {
            pickImage.launch("image/*")
                Log.e("uriimg", imageUri.toString(), )
            }

            btnPublish.setOnClickListener {
                viewModel.createNewAd(
                    HouseModelCreateDTO(
                        typeList = "Новостройка",
                        address = "ccsd",
                        floor = 3,
                        square ="123",
                        livingSpace = 123456,
                        ceilingHeight = 123456,
                        video = "1",
                        description = "asdasdsa",
                        id = 1,
                        type = 1,
                        area = 1,
                        rooms = 3,
//                        image = uriInFile(imageUri),
                        price = 14343435,
                        phoneNumber = "+9960555123123",
                        repair = "есть",
                        furniture = "есть",
                        bathroom = "совмещенный",
                        window = "на улицу",
                        warmFloor = "Да",
                        balcony = "Балкон"



                    )
                )
            }
        }
    }



    override fun setupSubscribers() {
        viewModel.createNewAdState.collectState(
            onLoading = {},
            onError = {
                Log.e("post", "error:$it ", )
            },
            onSuccess = {
                Log.e("ololo", "setupSubscribers: $it", )
            }
        )
    }

    private fun uriInFile(uri: Uri?): MultipartBody.Part{
        val file =File(uri!!.path)
        val requestFile = RequestBody.create("image/jpeg".toMediaTypeOrNull(), file)
        val image = MultipartBody.Part.createFormData("image", file.name, requestFile)
        return image
    }

    private val pickImage = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        binding.imgCreate.setImageURI(uri)
        imageUri = uri
//        uriInFile(uri)

//        Log.e("uri",uri.toString(), )
        Log.e("uri", uri?.let { getImageAsBase64(it) }.toString(), )
    }

    private fun returnUriImg(): Uri? {
        var imageUri: Uri? = null
        registerForActivityResult(
            ActivityResultContracts.GetContent()
        ) { uri: Uri? ->
            binding.imgCreate.setImageURI(uri)
            if (uri != null) {
                imageUri = uri
            }
        }
        return imageUri
    }



    private fun getImageAsBase64(uri: Uri): String {
        val inputStream = requireContext().contentResolver.openInputStream(uri)
        val bytes = ByteArrayOutputStream()
        val buffer = ByteArray(8192)
        var len: Int
        while (inputStream?.read(buffer).also { len = it!! } != -1) {
            bytes.write(buffer, 0, len)
        }
        val imageBytes = bytes.toByteArray()
        return Base64.encodeToString(imageBytes, Base64.DEFAULT)
    }


}


