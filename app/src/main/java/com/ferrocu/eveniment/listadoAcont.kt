package com.ferrocu.eveniment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
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

        if(toolbar != null){
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setDisplayShowHomeEnabled(true)
            supportActionBar?.setTitle("Listado")
            toolbar.setNavigationOnClickListener { onBackPressed() }
        }else{
            MyLog().d(TAG,"imposible cargar")

        }


        fab.setOnClickListener { view ->
            startActivity(Intent(this@listadoAcont,buscar_acont::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater=menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

       return when (item.itemId) {
            R.id.menuAcercaDe ->{
                startActivity(Intent(this@listadoAcont,AcercaDe::class.java))
                true
            }


            else -> {
                 super.onOptionsItemSelected(item)
            }
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
