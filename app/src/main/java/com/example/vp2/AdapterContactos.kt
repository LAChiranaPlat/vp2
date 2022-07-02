package com.killacorp.pokemon

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.vp2.R
import com.example.vp2.databinding.TemplateContactosBinding
import com.example.vp2.databinding.TemplatePublicacionesBinding

class AdapterContactos(val listaContactos:ArrayList<listaContactos>):RecyclerView.Adapter<AdapterContactos.ViewHolder>() {

    lateinit var ctx:Context

    class ViewHolder(view : TemplateContactosBinding): RecyclerView.ViewHolder(view.root){

        val contacto : TextView
        val foto : ImageView

        init {
            contacto=view.txtContacto
            foto=view.imgFoto
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        ctx= parent.context
        val layout = TemplateContactosBinding.inflate(LayoutInflater.from(ctx),parent,false)
        return  ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaContactos.get(position)

        holder.apply {
            contacto.text=item.contacto

            Glide
                .with(ctx)
                .load(item.foto)
                //.centerCrop()
                .placeholder(R.drawable.contacts)
                .into(foto);

        }
    }

    override fun getItemCount() = listaContactos.size


}


data class listaContactos(val contacto:String, val foto:String)