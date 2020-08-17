package com.example.timestamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show.setOnClickListener {
            tv_date.text = getCurrentDate()
        }
    }

    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("HH:mm  yyyy/MM/dd", Locale.getDefault())
        val date = Date()

        return dateFormat.format(date)
    }
}