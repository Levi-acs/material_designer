package com.example.assinaturadigital.material_designer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assinaturadigital.material_designer.databinding.ActivityTopAppBarBinding

class TopAppBarActivity: AppCompatActivity() {

    private val binding by lazy { ActivityTopAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}
