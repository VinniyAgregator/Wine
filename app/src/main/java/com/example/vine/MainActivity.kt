package com.example.vine


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import com.example.vine.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {


    lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
    }
        fun onClickGoTaboo (view : View) {
            val perekluchatel = Intent(this, Taboo::class.java)
            startActivity(perekluchatel)
        }
        fun onClickGoFilterSelect(view : View) {
            val perekluchatel = Intent(this, FilterSelect::class.java)
            startActivity(perekluchatel)



    }
}