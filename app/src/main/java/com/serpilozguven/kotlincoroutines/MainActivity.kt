package com.serpilozguven.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness
        /*      GlobalScope.launch {
            repeat(100000){
                launch{
                    println("android")
                }
            }
        }
*/
        /*
        //Scope
        //Global Scope, runBlocking,CoroutineScope
        println("run bloking start")
        runBlocking {
            launch {
                delay(2000)
                println("run blocking")
            }
        }
        println()"run bloking end"

        //Global Scope
        println("global scope start")
        GlobalScope.launch {
            delay(5000)
            println("global scope")
        }
        println("global scope end")


        //CoroutineScope
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")


    }*/

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
    }
}
