package com.example.vine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vine.databinding.ActivityBrandBinding

class Brand : AppCompatActivity() {
    lateinit var Brand : ActivityBrandBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Brand = ActivityBrandBinding.inflate(layoutInflater)
        setContentView(Brand.root)
    }
    fun goWhite (view : View) {
        val perekluchatel = Intent(this, White::class.java)
        startActivity(perekluchatel)
    }
    fun goRed (view : View) {
        val perekluchatel = Intent(this, Red::class.java)
        startActivity(perekluchatel)
    }
    fun goPink (view : View) {
        val perekluchatel = Intent(this, Pink::class.java)
        startActivity(perekluchatel)
    }

}