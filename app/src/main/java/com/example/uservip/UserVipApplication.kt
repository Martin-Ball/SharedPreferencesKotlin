package com.example.uservip

import android.app.Application

class UserVipApplication : Application() {   //Application es una clase que se ejecuta antes del MainActivity

    companion object{
        lateinit var prefs:Prefs
    }

    override fun onCreate() {
        super.onCreate()
        val prefs = Prefs(applicationContext)

    }
}