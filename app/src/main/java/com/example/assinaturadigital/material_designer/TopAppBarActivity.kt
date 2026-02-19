package com.example.assinaturadigital.material_designer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assinaturadigital.material_designer.databinding.ActivityTopAppBarBinding

class TopAppBarActivity: AppCompatActivity() {

    private val binding by lazy { ActivityTopAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    companion object{
        fun createIntent(context: Context): Intent {
            return Intent(context, TopAppBarActivity::class.java)
        )
    }

}
