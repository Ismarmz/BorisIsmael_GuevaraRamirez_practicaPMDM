package com.example.borisismael_guevararamirez_practicapmdm.models

data class NewResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)