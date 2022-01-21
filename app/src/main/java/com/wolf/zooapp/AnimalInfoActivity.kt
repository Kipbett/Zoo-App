package com.wolf.zooapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AnimalInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)

        val b: Bundle? = intent.extras
        val name = b!!.getBundle("name")
        val desc = b!!.getBundle("description")
        val img = b!!.getBundle("Image")

    }
}