package com.example.vp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vp2.databinding.FragmentContactosBinding
import com.killacorp.pokemon.AdapterContactos
import com.killacorp.pokemon.listaContactos

class Contactos : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val views= FragmentContactosBinding.inflate(inflater,container,false)

        val lista=views.lstContactos

        val items:ArrayList<listaContactos> = ArrayList()

        items.add(listaContactos("Nestor","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8Sc4sK63E80Wsdl_xGp0_-H6U0WE39KiGxA&usqp=CAU"))
        items.add(listaContactos("Gisela","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYD1POsIjF5lwoRB6VZF0FnHoW3i-J-Kr0ZA&usqp=CAU"))
        items.add(listaContactos("Giovanna","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmiY0C3Xz827Ky8xqVY05-rhHnRoKMKH4XxA&usqp=CAU"))


        lista.layoutManager=LinearLayoutManager(container?.context)
        lista.adapter=AdapterContactos(items)

        return views.root

    }

}