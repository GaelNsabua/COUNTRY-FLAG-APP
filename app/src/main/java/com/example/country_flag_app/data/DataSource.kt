package com.example.country_flag_app.data
import com.example.country_flag_app.R
import com.example.country_flag_app.model.Flag

class DataSource {
    fun loadFlag(): List<Flag>{
        return listOf<Flag>(
            Flag(R.string.country_france, R.drawable.country_france),
            Flag(R.string.country_usa, R.drawable.country_usa),
            Flag(R.string.country_china, R.drawable.country_china),
            Flag(R.string.country_australia, R.drawable.country_australia),
            Flag(R.string.country_brazil, R.drawable.country_brazil),
            Flag(R.string.country_canada, R.drawable.country_canada),
            Flag(R.string.country_japan, R.drawable.country_japan),
            Flag(R.string.country_india, R.drawable.country_india),
            Flag(R.string.country_germany, R.drawable.country_germany),
            Flag(R.string.country_south_africa, R.drawable.country_south_africa)
        )
    }
}