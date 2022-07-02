package com.example.vp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.vp2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var views:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        views=ActivityMainBinding.inflate(layoutInflater)

        setContentView(views.root)

        val vp=views.vp
        val tabs=views.tabs

        val texts= arrayOf("TextA","textB","textC","aaaaa","bB","xxxxxxxxx","yyyyyyyyy","zzzzzzzzzzz")
        vp.adapter=adapterVP(this, texts.size)


        val manager=TabLayoutMediator(tabs,vp,TabLayoutMediator.TabConfigurationStrategy({tabs:TabLayout.Tab,position:Int->

            tabs.text=texts.get(position).toString()

/*            when(position)
            {
                0->tabs.setIcon(getDrawable(R.drawable.home))
                1->tabs.setIcon(getDrawable(R.drawable.publicaciones))
                2->tabs.setIcon(getDrawable(R.drawable.contacts))
                3->tabs.setIcon(getDrawable(R.drawable.post))
                4->tabs.setIcon(getDrawable(R.drawable.setting))
            }*/

        }))

        manager.attach()

    }


}