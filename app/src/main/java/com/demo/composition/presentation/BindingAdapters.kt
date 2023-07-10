package com.demo.composition.presentation

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.demo.composition.R
import com.demo.composition.domain.entity.GameResult

@BindingAdapter("requiredAnswers")
fun bindRequiredAnswers(textView: TextView, count: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.required_score),
        count
    )
}

@BindingAdapter("scoreAnswers")
fun bindScoreAnswers(textView: TextView, score: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.score_answers),
        score
    )
}

@BindingAdapter("requiredPercentage")
fun bindRequiredPercentage(textView: TextView, percentage: Int): Int {
    textView.text = String.format(
        textView.context.getString(R.string.required_percentage),
        percentage
    )
    return percentage
}

@BindingAdapter("scorePercentage")
fun bindScorePercentage(textView: TextView, gameResult: GameResult) {
    textView.text = String.format(
        textView.context.getString(R.string.score_percentage),
        calculatePercentOfCorrectAnswers(gameResult)
    )
}

private fun calculatePercentOfCorrectAnswers(gameResult: GameResult) = with(gameResult) {
    if (countOfQuestions == 0) {
        0
    } else
        ((countOfCorrectAnswers / countOfQuestions.toDouble()) * 100).toInt()
}

@BindingAdapter("emojiResult")
fun bindEmojiResult(imageView: ImageView, winner: Boolean) {
    imageView.setImageResource(getSmileResId(winner))
}

private fun getSmileResId(winner: Boolean): Int {
    return if (winner) {
        R.drawable.ic_smile
    } else {
        R.drawable.ic_sad
    }
}