package com.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

   companion object{
       val log: Logger = Logger.getLogger(MainActivity::class.java.name)
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log.info("onCreate")
    }

    override fun onStart() {
        super.onStart()
        log.info("onStart")
    }

    override fun onResume() {
        super.onResume()
        log.info("onResume")

        btnAnimation.setOnClickListener{
            var intent = Intent(this,AnimatedVectorDrawble::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        log.info("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        log.info("onRestart")
    }

    override fun onStop() {
        super.onStop()
        log.info("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        log.info("onDestroy")
    }
}
