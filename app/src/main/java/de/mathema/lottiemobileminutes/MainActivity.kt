package de.mathema.lottiemobileminutes

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.airbnb.lottie.LottieAnimationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var fab: FloatingActionButton
    lateinit var animationView: LottieAnimationView
    var wasClicked = false


    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab = findViewById(R.id.fab)
        animationView = findViewById(R.id.animationView)
        fab.setOnClickListener {
            wasClicked = if (wasClicked) {
                fab.setImageResource(R.drawable.ic_baseline_switch_left_24)
                animationView.setAnimation(R.raw.animationbike)
                animationView.playAnimation()
                false
            } else {
                fab.setImageResource(R.drawable.ic_baseline_switch_right_24)
                animationView.setAnimation(R.raw.animation)
                animationView.playAnimation()
                true
            }
        }
    }
}