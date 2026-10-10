package com.example.questtugaslayout_0194

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import com.example.questtugaslayout_0194.ui.theme.QuestTugasLayout_0194Theme

data class Dosen(
    @StringRes val nama: Int,
    @StringRes val telepon: Int?,
    @StringRes val lokasi: Int,
    @ColorRes val warnaCard: Int,
    @ColorRes val warnaLokasi: Int,
    val namaCursive: Boolean = false
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestTugasLayout_0194Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HalamanUtama(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun HalamanUtama(modifier: Modifier = Modifier) {
    val daftar = listOf(
        Dosen(R.string.name_1, null, R.string.loc_1, R.color.card_gray, R.color.text_yellow, true),
        Dosen(R.string.name_2, R.string.phone_2, R.string.loc_2, R.color.card_purple, R.color.text_yellow),
        Dosen(R.string.name_3, R.string.phone_3, R.string.loc_3, R.color.card_blue, R.color.text_white),
        Dosen(R.string.name_4, R.string.phone_4, R.string.loc_4, R.color.card_green, R.color.text_white)
    )
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_bg))
            .padding(horizontal = dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    )
