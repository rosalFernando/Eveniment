package com.ferrocu.eveniment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var segundo:Long=5
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      Handler().postDelayed({
          startActivity(Intent(this@MainActivity,listadoAcont::class.java))
          finish()
      },segundo * 1000)
    }
}
