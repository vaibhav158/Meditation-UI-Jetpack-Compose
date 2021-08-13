package com.mystikcoder.jetpackcompose.model

import androidx.annotation.DrawableRes

data class BottomMenuContent(
    val title: String,
    @DrawableRes val iconId: Int
)