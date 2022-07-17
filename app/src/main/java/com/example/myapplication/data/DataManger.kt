package com.example.myapplication.data

import com.example.myapplication.data.domain.Match

object DataManger {
    private val matchesList = mutableListOf<Match>()
    private var matchIndex = 0
    fun addMatch(match:Match){
        matchesList.add(match)
    }
    fun getCurrenMatch():Match= matchesList[matchIndex]
    fun getNextMatch():Match{
        matchIndex++
        return matchesList[matchIndex]
    }
    fun getBakeMatch():Match{
        matchIndex--
        return matchesList[matchIndex]
    }
}