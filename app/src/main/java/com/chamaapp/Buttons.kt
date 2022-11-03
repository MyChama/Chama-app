package com.chamaapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.chamaapp.ui.theme.Taqo

data class Buttons (
    val chama: String

    )
val myChamaList = listOf(
            Buttons("UMOJA QUEENS"),
            Buttons("KERICHO NDUMES"),
            Buttons("JOYFUL WOMEN"),
            Buttons("HAPPY JEZEBELS"),
            Buttons("BUSIA VAIDAS"),
            Buttons("STAMFORD RIDERS"),
            Buttons("KIAMBU CABRONS"),
            Buttons("KILIMANI MUMS"),
            Buttons("KILIFI JOMBAS"),
            Buttons("NYERI VIPERS")


)

@Composable
fun ButtonsList(
    chamaList:Buttons
){
    Button(modifier = Modifier
        .padding(15.dp),

        onClick = { /*TODO*/ }) {
        Text(text = chamaList.chama, color = Color.White)

    }
}

