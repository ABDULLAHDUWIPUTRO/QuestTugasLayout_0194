package com.example.questtugaslayout_0194

import androidx.annotation.ColorRes
import androidx.annotation.StringRes

data class Dosen(
    @StringRes val nama: Int,
    @StringRes val telepon: Int?,
    @StringRes val lokasi: Int,
    @ColorRes val warnaCard: Int,
    @ColorRes val warnaLokasi: Int,
    val namaCursive: Boolean = false
)