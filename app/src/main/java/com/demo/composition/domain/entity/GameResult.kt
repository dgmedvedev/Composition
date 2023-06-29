package com.demo.composition.domain.entity

data class GameResult(
    val winner: Boolean,
    val countOfCorrectAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings // для получения minCountOfCorrectAnswers
)