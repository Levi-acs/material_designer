package com.example.assinaturadigital.material_designer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assinaturadigital.material_designer.databinding.ActivityTextFieldsBinding

class TextFieldsActivity: AppCompatActivity() {

    private val binding by lazy { ActivityTextFieldsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root )

        binding.inputErro.error = "campo obrigatorio"
    }

    companion object{
        fun createIntent(context: Context): Intent {
            return Intent(context, TextFieldsActivity::class.java)
        }
    }
}
