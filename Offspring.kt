package com.example.start

class Offspring:Secondary(), Archery,Singer {
    override fun archery() {
        super.archery()
        println("Archery Skills enhanced")
    }

    override fun sing() {
        super.sing()
        println("Singing Skills Enhanced")
    }

}