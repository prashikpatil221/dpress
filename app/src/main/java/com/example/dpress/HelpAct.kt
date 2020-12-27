package com.example.dpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HelpAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }

    fun goBreath(view: View) {
        val intent = Intent(this,BreathAct::class.java)
        startActivity(intent)
    }
    fun goMusic(view: View) {
        val intent = Intent(this,MusicAct::class.java)
        startActivity(intent)
    }
    fun goGround(view: View) {
//        val intent = Intent(this,::class.java)
//        startActivity(intent)
    }
    fun goStop(view: View) {
        val intent = Intent(this,StopAct::class.java)
        startActivity(intent)
    }
}