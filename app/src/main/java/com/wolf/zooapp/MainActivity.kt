package com.wolf.zooapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var listOfAnimals = ArrayList<Animal>()
    var adaptor:AnimalAdaptor? = null
    var textvName:TextView = findViewById(R.id.textAnimalName)
    var textvDesc:TextView = findViewById(R.id.textAnimalDescription)
    var animalImage:ImageView = findViewById(R.id.imageAnimal)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Load Animals
        listOfAnimals.add(Animal("Elephant", "Biggest jungle Animal", R.drawable.elephant))
        listOfAnimals.add(Animal("Lion", "BMost Feared animal in the jungle", R.drawable.lion))
        listOfAnimals.add(Animal("Tiger", "Most Beautiful Jungle animal", R.drawable.tiger))
        listOfAnimals.add(Animal("Wolf", "Loves To Live In a Family", R.drawable.wolf))
        listOfAnimals.add(Animal("Zebra", "Have black and white strips", R.drawable.zebra))

        adaptor = AnimalAdaptor(this, listOfAnimals)
    }

    class AnimalAdaptor:BaseAdapter{
        var context:Context? = null

        var listOfAnimals = ArrayList<Animal>()
        constructor(conrtext:Context, listOfAnimal: ArrayList<Animal>):super(){
            this.listOfAnimals = listOfAnimals
        }
        override fun getCount(): Int {
            return listOfAnimals.size
        }

        override fun getItem(p0: Int): Any {
            return listOfAnimals[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var animal = listOfAnimals[p0]
            var myView:View = View.inflate(context, R.layout.animal_view, null)

            val imageV:ImageView = myView.findViewById(R.id.imageAnimal)
            val textName:TextView = myView.findViewById(R.id.textAnimalName)
            val textDesc:TextView = myView.findViewById(R.id.textAnimalDescription)

            imageV.setImageResource(animal.animal_image!!)
            textName.text = animal.name
            textDesc.text = animal.animal_description

            return myView
        }

    }
}