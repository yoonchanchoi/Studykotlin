package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt = findViewById<Button>(R.id.btn)
        val bt2 = findViewById<Button>(R.id.btn2)
        val tv =findViewById<TextView>(R.id.tv)


        bt.setOnClickListener {
            var sum=0
            for(i in 1..500){
                Thread.sleep(1000)
                sum+=1
                tv.setText(sum.toString())
            }

        }
//        bt2.setOnClickListener {
//            var sum=0
//            for(i in 1..500){
//                Thread.sleep(1000)
//                sum+=1
//                tv.setText(sum.toString())
//            }
//        }
    }
}