package com.example.dpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()


    }

    fun goHelp(view: View) {
        val intent = Intent(this,HelpAct::class.java)
        startActivity(intent)
    }

    fun goJornal(view: View) {
        val intent = Intent(this,JornalAct::class.java)
        startActivity(intent)
    }
    fun goStrategy(view: View) {
        val intent = Intent(this,StrategyAct::class.java)
        startActivity(intent)
    }
    fun goMoti(view: View) {
        val intent = Intent(this,MotiAct::class.java)
        startActivity(intent)
    }
    fun goDoc(view: View) {
        val intent = Intent(this,DocAct::class.java)
        startActivity(intent)
    }
    fun goInfo(view: View) {
        val intent = Intent(this,InfoAct::class.java)
        startActivity(intent)
    }
}