package com.janayalsalem.triviaapp.ui.components

import android.util.Log
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import com.janayalsalem.triviaapp.ui.screen.QuestionsViewModel

@Composable
fun Question(questionsViewModel : QuestionsViewModel) {

    val question = questionsViewModel.data.value.data?.toMutableList()
    var isLoading = questionsViewModel.data.value.loading

    if(isLoading == true){

        // show a loading icon
        CircularProgressIndicator()

    }
    else {
        Log.e("On main","Stop Loading")
        question?.forEach{ questionItem ->
            Log.e("On main","questions  = ${questionItem.question}")

        }
    }
}