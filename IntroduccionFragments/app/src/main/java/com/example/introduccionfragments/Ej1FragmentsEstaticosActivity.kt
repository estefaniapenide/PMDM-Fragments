package com.example.introduccionfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.introduccionfragments.databinding.ActivityEj1FragmentsEstaticosBinding

class Ej1FragmentsEstaticosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj1FragmentsEstaticosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj1FragmentsEstaticosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}