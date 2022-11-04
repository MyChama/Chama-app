package com.chamaapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chamaapp.ui.theme.EndBlue
import com.chamaapp.ui.theme.Taqo

data class Chama(
    val letters: String,
    val names: String,
)
val newChamasList = listOf(
    Chama("MM","MURANGA MUMS"),
            Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","KISUMU BOYS"),
    Chama("MM","DND GROUP"),
    Chama("MM","PWANI SAILORS"),
    Chama("MM","EASTLEIGH SISTERS"),
    Chama("MM","DAUGHTERS OF NGARA"),
    Chama("MM","TURKANA WARRIORS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
    Chama("MM","MURANGA MUMS"),
)

@Composable
fun NewChama(
     chamaScreen: Chama
){
    Row(Modifier.padding(top=10.dp))
    {
        Box(modifier = Modifier
            .size(40.dp)
            .background(color = Taqo, shape = RoundedCornerShape(30.dp)),
            contentAlignment = Alignment.Center)
        {
            Text(text = chamaScreen.letters,color = EndBlue)
        }
        Text(
            text = chamaScreen.names,color = EndBlue,
            modifier = Modifier
                .padding(start = 10.dp, top = 10.dp)
        )
    }

}
