package com.example.vine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vine.databinding.ActivityFilterSelectBinding
import com.example.vine.databinding.ActivityMainBinding

class FilterSelect : AppCompatActivity() {
    lateinit var bindingFil : ActivityFilterSelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFil = ActivityFilterSelectBinding.inflate(layoutInflater)
        setContentView(bindingFil.root)
    }
    fun goSugar (view : View) {
        val perekluchatel = Intent(this, Sugar::class.java)
        startActivity(perekluchatel)
    }
    fun goFortress (view : View) {
        val perekluchatel = Intent(this, Fortress::class.java)
        startActivity(perekluchatel)
    }
    fun goCountry (view : View) {
        val perekluchatel = Intent(this, Country::class.java)
        startActivity(perekluchatel)
    }
    fun goBrand (view : View) {
        val perekluchatel = Intent(this, Brand::class.java)
        startActivity(perekluchatel)
    }
    fun goCapacity (view : View) {
        val perekluchatel = Intent(this, Capacity::class.java)
        startActivity(perekluchatel)
    }


}