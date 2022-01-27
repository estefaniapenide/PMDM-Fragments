package com.example.introduccionfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.introduccionfragments.databinding.FragmentYellowBinding


class YellowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_yellow, container, false)

    }

    companion object {
        @JvmStatic
        fun newInstance() = YellowFragment()

    }
}