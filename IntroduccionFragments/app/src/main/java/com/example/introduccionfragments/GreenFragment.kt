package com.example.introduccionfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.introduccionfragments.databinding.FragmentGreenBinding
import com.google.android.material.snackbar.Snackbar

class GreenFragment : Fragment() {

    private var _binding:FragmentGreenBinding?=null
    private val binding=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentGreenBinding.inflate(inflater, container, false)
        binding.buttonGreen.setOnClickListener{ Toast.makeText(activity,"Fragment verde",Toast.LENGTH_LONG).show()}
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}