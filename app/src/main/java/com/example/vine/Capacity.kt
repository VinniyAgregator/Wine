package com.example.vine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vine.databinding.ActivityCapacityBinding
import com.example.vine.databinding.ActivityFilterSelectBinding

class Capacity : AppCompatActivity() {
    lateinit var Cap :   ActivityCapacityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Cap = ActivityCapacityBinding.inflate(layoutInflater)
        setContentView(Cap.root)
    }
    fun go5 (view : View) {
        val perekluchatel = Intent(this, Sugar::class.java)
        startActivity(perekluchatel)
    }
    fun go7 (view : View) {
        val perekluchatel = Intent(this, Fortress::class.java)
        startActivity(perekluchatel)
    }
    fun go1 (view : View) {
        val perekluchatel = Intent(this, Country::class.java)
        startActivity(perekluchatel)
    }
}