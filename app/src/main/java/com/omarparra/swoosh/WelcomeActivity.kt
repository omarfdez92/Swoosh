package com.omarparra.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStarterBtn.setOnClickListener {
            //explicit intent ... explicit because we know where we going
             val leagueIntent =  Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
