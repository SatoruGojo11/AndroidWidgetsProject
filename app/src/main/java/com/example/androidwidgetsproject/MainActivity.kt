package com.example.androidwidgetsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekbartext: TextView = findViewById(R.id.seekbartext)
        val seekbar: SeekBar = findViewById(R.id.seek_bar)

        seekbar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
                    seekbartext.text = "$progress"
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                    Toast.makeText(this@MainActivity, "Start Progress", Toast.LENGTH_SHORT).show()
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                    Toast.makeText(this@MainActivity, "End Progress", Toast.LENGTH_SHORT).show()
                }
            }
        )

    }
}

//aa nathi Seek bar nu button click thai tyare aa page khule
// atyare je page oepn chhe ?