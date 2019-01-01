package com.omarparra.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.omarparra.swoosh.Model.Player
import com.omarparra.swoosh.R
import com.omarparra.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesTxt.text = "Looking for ${player.league} ${player.skill} league near you. . ."
    }
}
