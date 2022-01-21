package com.wolf.zooapp

class Animal {
    var name:String? = null
    var animal_description:String? = null
    var animal_image:Int? = null
    var isKiller:Boolean = false

    constructor(name:String, animal_description:String, animal_image:Int, isKiller:Boolean){
        this.name = name
        this.animal_description = animal_description
        this.animal_image = animal_image
        this.isKiller = isKiller
    }
}