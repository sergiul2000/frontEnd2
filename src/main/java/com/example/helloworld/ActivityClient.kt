package com.example.helloworld

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityClient : AppCompatActivity() {

    /**
     * this function will open back the MainActivity,and will finish the current
     * activity
     */
    private fun back(){

        val intent1 = Intent (this,MainActivity::class.java)
        finish()
        startActivity(intent1)

    }

    /**
     * @param ora este un numar pe care dorim sa-l verificam daca
     * este o ora valida
     *
     * Verificam daca ora este un nr. intre 0 si 24
     */
    private fun verifyHour(ora:Int):Boolean{
        if(ora>-1 && ora<25)
            return true
        return false
    }

    /**
     * functia va afisa un pop up cu mesajul dorit
     */
    private fun showMsg(msg:String){
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(msg)
        alertDialogBuilder.show()
    }

    /**
     * @param textView este textView-ul de unde dorim sa extragem textul
     * daca acel camp e gol sau contine un nr negativ sau mai mare decat 24
     * functia va returna -1
     */
    private fun faRezervare(textView:TextView): Int{

        val oraString:String = textView.text.toString()
        if(oraString=="")
            return -1
        val ora=Integer.parseInt(oraString)
        if (verifyHour(ora)){
            showMsg("Rezervare facuta pentru ora".plus(ora))
            return ora
        }
        return -1
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client)

        val b: Button = findViewById(R.id.backClient)

        b.setOnClickListener{
            back()
        }

        val btnRezervare : Button = findViewById(R.id.rezervare)
        val oraText:TextView = findViewById(R.id.ora)

        btnRezervare.setOnClickListener{
            val oraRezervarii:Int = faRezervare(oraText)
            if(oraRezervarii==-1)
                showMsg("introduceti o ora din intervalul 0-24!")

        }


    }
}