package com.example.assignment_5_week_4.problem_2.model

import java.io.Serializable

data class Product(
    val pName: String,
    val pLogo: Int,
    val pDescription: String,
    val pCost: Double,
    val pImage: Int
) :Serializable
