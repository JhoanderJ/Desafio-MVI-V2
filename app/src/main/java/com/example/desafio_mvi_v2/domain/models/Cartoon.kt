package com.example.desafio_mvi_v2.domain.models

import com.google.gson.annotations.SerializedName

data class Cartoon(
    @SerializedName("results") val results: List<Person>
)