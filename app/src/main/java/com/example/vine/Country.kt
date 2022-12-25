package com.example.vine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vine.databinding.ActivityCountryBinding

class Country : AppCompatActivity() {
    lateinit var Coun : ActivityCountryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Coun = ActivityCountryBinding.inflate(layoutInflater)
        setContentView(Coun.root)
    }
    fun goRus (view : View) {
        val perekluchatel = Intent(this, Russia::class.java)
        startActivity(perekluchatel)
    }
    fun goItaly (view : View) {
        val perekluchatel = Intent(this, Italy::class.java)
        startActivity(perekluchatel)
    }
    fun goFrance (view : View) {
        val perekluchatel = Intent(this, France::class.java)
        startActivity(perekluchatel)
    }
    fun goGruz (view : View) {
        val perekluchatel = Intent(this, Gryzia::class.java)
        startActivity(perekluchatel)
    }

}