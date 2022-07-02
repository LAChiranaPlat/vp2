package com.killacorp.pokemon

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vp2.databinding.TemplatePublicacionesBinding

class AdapterAutor(val listaautores:ArrayList<listaAutor>):RecyclerView.Adapter<AdapterAutor.ViewHolder>() {

    lateinit var ctx:Context

    class ViewHolder(view : TemplatePublicacionesBinding): RecyclerView.ViewHolder(view.root){

        val autorTv : TextView
        val fecha : TextView
        val publicacion : TextView

        init {
            autorTv=view.txtAutor
            fecha=view.txtFecha
            publicacion=view.txtPublicacion
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        ctx= parent.context
        val layout = TemplatePublicacionesBinding.inflate(LayoutInflater.from(ctx),parent,false)
        return  ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val autor = listaautores.get(position)

        holder.apply {
            autorTv.text=autor.autor
            publicacion.text=autor.pub
            fecha.text=autor.fecha
        }
    }

    override fun getItemCount() = listaautores.size


}


data class listaAutor(val fecha: String, val autor:String, val pub:String)