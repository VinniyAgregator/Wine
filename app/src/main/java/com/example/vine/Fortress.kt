package com.example.vine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vine.databinding.ActivityFortressBinding

class Fortress : AppCompatActivity() {
    lateinit var bindingFil : ActivityFortressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFil = ActivityFortressBinding.inflate(layoutInflater)
        setContentView(bindingFil.root)
    }
    fun go11 (view : View) {
        val perekluchatel = Intent(this, For11::class.java)
        startActivity(perekluchatel)
    }
    fun go12 (view : View) {
        val perekluchatel = Intent(this, For12::class.java)
        startActivity(perekluchatel)
    }
    fun go13 (view : View) {
        val perekluchatel = Intent(this, For13::class.java)
        startActivity(perekluchatel)
    }
}