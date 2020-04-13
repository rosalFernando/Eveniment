package com.ferrocu.eveniment

import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout

import kotlinx.android.synthetic.main.activity_buscar_acont.*

class buscar_acont : AppCompatActivity() {

    private var TAG: String = "Busca acontecimiento"
    private lateinit var context: Context
    var bBuscarAcont: Button?=null
    var textAcont: TextView?=null
    var clBuscar: ConstraintLayout?=null




    override fun onCreate(savedInstanceState: Bundle?) {


        context=this
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_acont)



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



        bBuscarAcont=findViewById(R.id.buttonBuscar)
        textAcont=findViewById(R.id.etBuscarcont)
        clBuscar=findViewById(R.id.CLacontBuscar)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        if (textAcont?.text.toString().length >= 3) {

            bBuscarAcont?.isEnabled=false


        }else{
            bBuscarAcont?.setOnClickListener(View.OnClickListener {
                Snackbar.make(findViewById(R.id.CLacontBuscar) ,"boton pulsado", Snackbar.LENGTH_LONG).show()

            })
        }




    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {

        when(requestCode){
            Constantes().CODE_WRITE_EXTERNAL_STORAGE_PERMISSION ->{
                if((grantResults.isNotEmpty() && grantResults[0]== PackageManager.PERMISSION_GRANTED)){
                    Snackbar.make(findViewById(R.id.CLacontBuscar) ,"Permiso aceptado", Snackbar.LENGTH_LONG).show()

                }else{

                }
            }

        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
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
