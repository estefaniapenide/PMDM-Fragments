package com.example.introduccionfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.introduccionfragments.databinding.ActivityEj2FragmentsDinamicosBinding

class Ej2FragmentsDinamicosActivity : AppCompatActivity() {

    private lateinit var binding:ActivityEj2FragmentsDinamicosBinding

    lateinit var fragment:Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityEj2FragmentsDinamicosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentVerde = GreenFragment()
        val fragmentAmarillo = YellowFragment.newInstance()

        fragment= fragmentVerde

        binding.buttonCambioFragment.setOnClickListener{
            fragment = if (fragment == fragmentAmarillo) fragmentVerde else fragmentAmarillo

            supportFragmentManager.commit{
            replace(R.id.fragmentDinamico,fragment)
            }
        }
    }
}