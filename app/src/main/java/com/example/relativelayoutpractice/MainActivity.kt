package com.example.relativelayoutpractice

import android.content.Context
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boxFirst:TextView = findViewById(R.id.firstBox)

        val boxSecond:TextView = findViewById(R.id.secondBox)

        val boxThird:TextView = findViewById(R.id.thirdBox)
        val buttonChangeColor:Button = findViewById(R.id.changeColor)

        fun setBackgroundColor(context:Context, box1: TextView,box2: TextView,box3: TextView,){

            val colorArray =  arrayOf(
            R.color.colorRed, R.color.colorBlue, R.color.colorGreen,
            R.color.colorYellow, R.color.colorCyan, R.color.colorMagenta,
            R.color.colorOrange, R.color.colorPurple, R.color.colorPink,
            R.color.colorTeal, R.color.colorDarkRed, R.color.colorDarkBlue,
            R.color.colorDarkGreen, R.color.colorDarkYellow, R.color.colorDarkCyan,
            R.color.colorDarkMagenta, R.color.colorDarkOrange, R.color.colorDarkPurple,
            R.color.colorDarkPink, R.color.colorDarkTeal
            )

            val randomIndexNumberBox1 = (0 until colorArray.size ).random()
            val randomIndexNumberBox2 = (0 until colorArray.size ).random()
            val randomIndexNumberBox3 = (0 until colorArray.size ).random()

            val randomColorBox1 = ContextCompat.getColor(context,colorArray[randomIndexNumberBox1])
            val randomColorBox2 = ContextCompat.getColor(context,colorArray[randomIndexNumberBox2])
            val randomColorBox3 = ContextCompat.getColor(context,colorArray[randomIndexNumberBox3])


            box1.background = ColorDrawable(randomColorBox1)
            box2.background = ColorDrawable(randomColorBox2)
            box3.background = ColorDrawable(randomColorBox3)

        }
        buttonChangeColor.setOnClickListener{
            setBackgroundColor(this,boxFirst,boxSecond,boxThird)

        }
    }
}