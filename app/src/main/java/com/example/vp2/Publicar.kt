package com.example.vp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vp2.databinding.FragmentPublicacionesBinding
import com.example.vp2.databinding.FragmentPublicarBinding

class Publicar : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val views= FragmentPublicarBinding.inflate(inflater,container,false)

        views.btnPublicar.setOnClickListener {
            views.etxtPost.text.clear()
            views.etxtPost.requestFocus()
        }

        return views.root
    }


}