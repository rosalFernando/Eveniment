package com.ferrocu.eveniment

class MyLog {

    //cambiar false para deshabilitar log de la aplicacion
    val DEBUG: Boolean=true

     fun i(tag:String,string: String){
    if(DEBUG) android.util.Log.i(tag,string)
    }
     fun e(tag:String,string: String){
        if(DEBUG) android.util.Log.e(tag,string)
    }
     fun d(tag:String,string: String){
        if(DEBUG) android.util.Log.d(tag,string)
    }
     fun v(tag:String,string: String){
        if(DEBUG) android.util.Log.v(tag,string)
    }
    fun w(tag:String,string: String){
        if(DEBUG) android.util.Log.w(tag,string)
    }
}