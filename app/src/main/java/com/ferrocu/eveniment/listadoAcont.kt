package com.ferrocu.eveniment

import android.content.Context
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_acerca_de.*

import kotlinx.android.synthetic.main.activity_listado_acont.*
import kotlinx.android.synthetic.main.activity_listado_acont.fab

class listadoAcont : AppCompatActivity() {

    private var TAG:String="Listado"
    private lateinit var context:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        context=this
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_acont)

        val toolbar:Toolbar=findViewById(R.id.Apptoolbar)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onNavigateUp(): Boolean {
        return true
    }

    override fun onBackPressed() {
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
}
