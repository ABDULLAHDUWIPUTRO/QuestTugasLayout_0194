package com.example.questtugaslayout_0194

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
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