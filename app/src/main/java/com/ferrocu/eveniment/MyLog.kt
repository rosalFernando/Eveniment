package com.ferrocu.eveniment

class MyLog {

    //cambiar false para deshabilitar log de la aplicacion
    val DEBUG: Boolean=true

    public fun i(tag:String,string: String){
    if(DEBUG) android.util.Log.i(tag,string)
    }
    public fun e(tag:String,string: String){
        if(DEBUG) android.util.Log.e(tag,string)
    }
    public fun d(tag:String,string: String){
        if(DEBUG) android.util.Log.d(tag,string)
    }
    public fun v(tag:String,string: String){
        if(DEBUG) android.util.Log.v(tag,string)
    }
    public fun w(tag:String,string: String){
        if(DEBUG) android.util.Log.w(tag,string)
    }
}