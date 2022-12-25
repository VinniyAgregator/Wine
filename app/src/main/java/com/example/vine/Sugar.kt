package com.example.vine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vine.databinding.ActivityCapacityBinding
import com.example.vine.databinding.ActivitySugarBinding

class Sugar : AppCompatActivity() {
    lateinit var Sug : ActivitySugarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Sug = ActivitySugarBinding.inflate(layoutInflater)
        setContentView(Sug.root)
    }
    fun goslad (view : View) {
        val perekluchatel = Intent(this, Sladkoe::class.java)
        startActivity(perekluchatel)
    }
    fun gosyx (view : View) {
        val perekluchatel = Intent(this, Polysladkoe::class.java)
        startActivity(perekluchatel)
    }
    fun gopol (view : View) {
        val perekluchatel = Intent(this, Syxoe::class.java)
        startActivity(perekluchatel)
    }

}