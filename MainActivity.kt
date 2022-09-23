package com.practicum.a3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.i

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main() {
    var arr : Array<Int> = arrayOf()
        for (i in IntRange(0,10))
            arr += i
    for (i in arr)
        println(i + 0)
}