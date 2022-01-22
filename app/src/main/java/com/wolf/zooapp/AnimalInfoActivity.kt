package com.wolf.zooapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AnimalInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)

        val b: Bundle? = intent.extras
        val name = b!!.getBundle("name")
        val desc = b!!.getBundle("description")
        val img = b!!.getBundle("Image")

        var imageView:ImageView = findViewById(R.id.imageDesc)
        var textName:TextView = findViewById(R.id.textViewName)
        var textDesc:TextView = findViewById(R.id.textViewDescription)
        imageView.setImageResource(Integer.parseInt(img.toString()))
        textName.text = name.toString()
        textDesc.text = desc.toString()

    }
}