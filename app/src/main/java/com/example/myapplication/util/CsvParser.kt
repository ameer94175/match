package com.example.myapplication.util

import com.example.myapplication.data.domain.Match

class CsvParser {
    fun parse(line:String):Match{
        val tokens=line.split(",")
        return Match(
            year = tokens[Constants.columnIndex.YEAR].toInt(),
            stadium = tokens[Constants.columnIndex.STADIUM],
            city = tokens[Constants.columnIndex.CITY],
            homeTeamName = tokens[Constants.columnIndex.HOME_TEAM_NAME],
            awayTeamName = tokens[Constants.columnIndex.AWAY_TEAM_NAME],
            homeTeamGoals = tokens[Constants.columnIndex.HOME_TEAM_GOALS].toInt(),
            awayTeamGoals = tokens[Constants.columnIndex.AWAY_TEAM_GOALS].toInt(),
        )
    }
}