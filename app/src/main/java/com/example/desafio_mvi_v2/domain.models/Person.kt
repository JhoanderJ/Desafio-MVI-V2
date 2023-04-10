package com.example.desafio_mvi_v2.domain.models

import com.google.gson.annotations.SerializedName

data class Person(
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("species") val species: String?,
    @SerializedName("status") val status: String?,
    @SerializedName("gender") val gender: String?,
    @SerializedName("image") val image: String?
)

fun Person.toModel() = Person(id, name, species, status, gender, image)
fun List<Person>.toModel() = map { it.toModel() }
