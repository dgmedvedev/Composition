package com.demo.composition.domain.entity

import java.io.Serializable

data class GameResult(
    val winner: Boolean,
    val countOfCorrectAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings // для получения minCountOfCorrectAnswers
) : Serializable