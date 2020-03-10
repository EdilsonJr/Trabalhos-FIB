package br.com.edilson.aula2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_basico.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        botao1.setOnClickListener {
            Toast.makeText(this@MainActivity,
                "Apertei o botão", Toast.LENGTH_LONG).show();

        }

    }

}
