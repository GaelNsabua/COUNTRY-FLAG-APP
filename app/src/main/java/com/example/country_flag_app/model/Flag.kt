package com.example.country_flag_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Flag(
    @StringRes val stringResourceld:Int,
    @DrawableRes val imageResourceld:Int,
)
