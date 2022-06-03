package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    private var switchState:Boolean=true

    /**
     * @param firstOpen is a var to see if the switch was touched before or not
     * @param switch is a val which contain the switch
     * switchState is a class propriety to see which activity we want to go to
     * next
     *
     * if switchState==true then will open the client activity,
     * else will open the admin activity
     *
     *
     */

    private fun adminOrClient(firstOpen:Boolean,switch:Switch){
        switchState= switch.isChecked()
        val intent:Intent
        if (firstOpen){
            if(switchState) {
                intent = Intent (this,ActivityClient::class.java)
            }else {
                intent = Intent (this,ActivityAdm::class.java)
            }
            finish()
            startActivity(intent)
        }
    }

    /**
     * this is the "main" of the activity
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFirst: Button = findViewById(R.id.loginAdmin)
        var firstOpen=true
        val switch:Switch = findViewById(R.id.adminClient)

        /**
         * this is the action Listener of the button to make it open next
         * an activity or another
         */
        btnFirst.setOnClickListener{

            adminOrClient(firstOpen,switch)
            firstOpen=false
        }
    }
}