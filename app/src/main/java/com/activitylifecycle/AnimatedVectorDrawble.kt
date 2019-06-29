package com.activitylifecycle

import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animated_vector_drawble.*

class AnimatedVectorDrawble : AppCompatActivity() {

    lateinit var animatable :Animatable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animated_vector_drawble)
        animatable = animatedImageView.drawable as Animatable
    }

    override fun onStart() {
        super.onStart()
        startButton.setOnClickListener{
            animatable.start()
        }
    }
}
