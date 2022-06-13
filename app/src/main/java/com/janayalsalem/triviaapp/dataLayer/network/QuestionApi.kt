package com.janayalsalem.triviaapp.dataLayer.network

import com.janayalsalem.triviaapp.dataLayer.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
}