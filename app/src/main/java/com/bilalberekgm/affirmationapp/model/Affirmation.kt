package com.bilalberekgm.affirmationapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes
    val affirmationString:Int,
    @DrawableRes
    val affirmationImage: Int
)
