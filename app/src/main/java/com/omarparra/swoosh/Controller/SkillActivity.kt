package com.omarparra.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.omarparra.swoosh.Model.Player
import com.omarparra.swoosh.R
import com.omarparra.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
//        println(league)
    }

    fun onBeginnerClick(view: View){
        ballerBtn.isChecked = false

        player.skill = "beginner"
    }

    fun onBallerClick(view: View){
        beginnerBtn.isChecked = false
        player.skill = "baller"
    }

    fun onSkillFinishClick(view: View){

        if( !player.skill.isEmpty() ){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill level!", Toast.LENGTH_SHORT).show()
        }

    }

}
