package com.example.tp1_grupo6
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.tp1_grupo6.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configuración del binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val intent = Intent(this, Ejercicio1::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)
        }

    }

}