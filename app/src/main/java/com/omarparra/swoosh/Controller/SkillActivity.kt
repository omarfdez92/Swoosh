package com.omarparra.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.omarparra.swoosh.Utilities.EXTRA_LEAGUE
import com.omarparra.swoosh.R
import com.omarparra.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerClick(view: View){
        ballerBtn.isChecked = false

        skill = "beginner"
    }

    fun onBallerClick(view: View){
        beginnerBtn.isChecked = false
        skill = "baller"
    }

    fun onSkillFinishClick(view: View){

        if( !skill.isEmpty() ){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill level!", Toast.LENGTH_SHORT).show()
        }

    }

}
