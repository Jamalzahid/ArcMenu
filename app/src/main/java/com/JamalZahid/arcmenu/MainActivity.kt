package com.JamalZahid.arcmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.JamalZahid.arcmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val arcMenu = ArcMenu.Builder(this).build()
            binding.arcMenu.show(arcMenu,it, it.x.toInt(), it.y.toInt(),false,50,45.0)
        }

    }
}