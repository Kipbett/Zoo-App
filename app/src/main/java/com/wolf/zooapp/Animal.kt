package com.wolf.zooapp

class Animal {
    var name:String? = null
    var animal_description:String? = null
    var animal_image:Int? = null
    constructor(name:String, animal_description:String, animal_image:Int){
        this.name = name
        this.animal_description = animal_description
        this.animal_image = animal_image
    }
}