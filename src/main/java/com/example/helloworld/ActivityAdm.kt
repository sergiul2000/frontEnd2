package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityAdm : AppCompatActivity() {

    /**
     * this function will open back the MainActivity,and will finish the current
     * activity
     */
    private fun back(){
        val intent2 = Intent (this,MainActivity::class.java)
        finish()
        startActivity(intent2)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adm)

        val a: Button = findViewById(R.id.backAdm)

        a.setOnClickListener{
            back()
        }
    }
}