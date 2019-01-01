package com.omarparra.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.omarparra.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

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
