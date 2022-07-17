package com.example.myapplication.ui


import android.util.Log
import android.view.LayoutInflater
import com.example.myapplication.data.DataManger
import com.example.myapplication.data.domain.Match
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {

  override val LOG_TAG: String="MAIN_ACTIVITY"
    override val bindgInFlater: (LayoutInflater) -> ActivityMainBinding=ActivityMainBinding::inflate

    override fun setup() {
      parseFil()
    }

    override fun addCallbaks() {
binding?.apply {
    iconNext.setOnClickListener {
      bindMatch(DataManger.getNextMatch())
    }
    iconbake.setOnClickListener {
        bindMatch(DataManger.getBakeMatch())
    }
}
    }
    private fun parseFil() {
        val inputStream= assets.open("worldcup.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
    val parse= CsvParser()
        buffer.forEachLine {
           val currentMatch=parse.parse(it)
          DataManger.addMatch(currentMatch)
        }
       bindMatch(DataManger.getCurrenMatch())
    }
    private fun bindMatch(match:Match){
        binding.apply {
            bouttenYear.text= match.year.toString()
            buttunStadiumname.text=match.stadium
            Brazil.text=match.homeTeamName
            Germany.text=match.awayTeamName
            buttun0.text=match.homeTeamGoals.toString()
            buttun7.text=match.awayTeamGoals.toString()
        }
    }
}