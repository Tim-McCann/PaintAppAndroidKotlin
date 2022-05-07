package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.currentBrush

class MainActivity : AppCompatActivity() {

    companion object {

        var path = Path()
        var paintBrush = Paint()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var redButton = findViewById<ImageButton>(R.id.redColor)
        var blueButton = findViewById<ImageButton>(R.id.blueColor)
        var blackButton = findViewById<ImageButton>(R.id.blackColor)
        var whiteButton = findViewById<ImageButton>(R.id.whiteColor)

        redButton.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        blueButton.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        blackButton.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }
        whiteButton.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.WHITE
            currentColor(paintBrush.color)
        }
    }
    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}