package com.chamaapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.chamaapp.ui.theme.EndBlue



@Composable
fun ContributeScreen(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Text(text = "Contribute", color = EndBlue,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp

            )



    }

}
@Composable
@Preview(showBackground = true)
fun ContributionScreenPreview(){
    ContributeScreen()

}
