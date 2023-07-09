package com.demo.composition.presentation

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.demo.composition.R

var countOfCorrectAnswers = 0

@BindingAdapter("requiredAnswers")
fun bindRequiredAnswers(textView: TextView, count: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.required_score),
        count
    )
}

@BindingAdapter("scoreAnswers")
fun bindScoreAnswers(textView: TextView, count: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.score_answers),
        count
    )
    countOfCorrectAnswers = count
}

@BindingAdapter("requiredPercentage")
fun bindRequiredPercentage(textView: TextView, count: Int): Int {
    textView.text = String.format(
        textView.context.getString(R.string.required_percentage),
        count
    )
    return count
}

@BindingAdapter("scorePercentage")
fun bindScorePercentage(textView: TextView, countOfQuestions: Int) {
    val count = if (countOfQuestions == 0) {
        0
    } else
        ((countOfCorrectAnswers / countOfQuestions.toDouble()) * 100).toInt()
    textView.text = String.format(
        textView.context.getString(R.string.score_percentage),
        count
    )
}