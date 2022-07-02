package com.example.vp2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlin.math.sign

class adapterVP(cA:FragmentActivity,var size:Int):FragmentStateAdapter(cA) {

    override fun getItemCount()= size

    override fun createFragment(position: Int): Fragment {

       return  when(position){

            0->{
                val frInicio=Start()
                return frInicio
            }

            1->{
                val frPublicaciones=Publicaciones()
                return frPublicaciones
            }

            2->{
                val frContactos=Contactos()
                return frContactos
            }

            3->{
                val frPublicar=Publicar()
                return frPublicar
            }

            4->{
                val frConfig=Config()
                return frConfig
            }

            else->Fragment()

        }



    }

}