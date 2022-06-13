package com.example.uservip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.uservip.UserVipApplication.Companion.prefs

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        initUI()
    }

    fun initUI(){
        val btnBack = findViewById<Button>(R.id.btnBack)
        val tvName = findViewById<TextView>(R.id.etName)

        btnBack.setOnClickListener{
            prefs.wipe()
            onBackPressed()
        }

        val userName = prefs.getName()
        tvName.text = "Bienvenido $userName"

        if(prefs.getVip()){
            setVipColourBackground()
        }
    }

    fun setVipColourBackground(){
        val container = findViewById<LinearLayout>(R.id.container)

        container.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_700))
    }
}