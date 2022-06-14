package com.janayalsalem.triviaapp.ui.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.janayalsalem.triviaapp.ui.components.Question


@Composable
fun TriviaHome(questionsViewModel : QuestionsViewModel = hiltViewModel()) {

    Question(questionsViewModel)
}
