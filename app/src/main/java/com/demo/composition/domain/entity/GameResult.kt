package com.demo.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult(
    val winner: Boolean,
    val countOfCorrectAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings // для получения minCountOfCorrectAnswers
) : Parcelable