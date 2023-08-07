package com.serpilozguven.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
/*
fun main(){

    //Dispatchers
    //Dispatchers.Default -> CPU intensive
    //Dispatchers.IO -> Input/Output, Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited dispatcher

    runBlocking {
        launch(Dispatchers.Main) {
            println("main Thread : ${Thread.currentThread().name}")

        }
        launch(Dispatchers.IO) {
            println("IO Tread : ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Default) {
            println("main Thread : ${Thread.currentThread().name}")

        }
        launch(Dispatchers.Unconfined) {
            println("IO Tread : ${Thread.currentThread().name}")
        }
    }


}*/