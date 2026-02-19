package com.example.assinaturadigital.material_designer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assinaturadigital.material_designer.databinding.ActivityMainBinding
import kotlin.getValue

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener() {
        binding.cvButtons.setOnClickListener {
            startActivity(ButtonsActivity.createIntent(this))
        }
        binding.cvTextFields.setOnClickListener {
            startActivity(TextFieldsActivity.createIntent(this))
        }
        binding.cvBottomSheets.setOnClickListener {
            ModalBottomSheet.start(supportFragmentManager)
        }
        binding.cvTopAppBar.setOnClickListener {
            startActivity(TopAppBarActivity.createIntent(this))
        }

    }
}