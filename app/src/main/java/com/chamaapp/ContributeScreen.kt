package com.chamaapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chamaapp.ui.theme.EndBlue
import com.chamaapp.ui.theme.Taqo


@ExperimentalMaterialApi
@Composable
fun BottomDrawer() {
    val bottomSheet = rememberBottomSheetState(BottomSheetValue.Collapsed)

    BottomSheetScaffold(
        sheetContent = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,

                modifier = Modifier
                    .background(
                        Taqo,
                        shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
                    )
                    .fillMaxHeight(0.62f)
                    .fillMaxWidth()
            ) {
                Text(modifier = Modifier.padding( top = 10.dp),
                    text = "Choose Chama",
                    style = (TextStyle(
                        color = EndBlue,
                        fontSize = 17.sp,

                        )  ))

                Row(modifier = Modifier
                    .padding( horizontal = 15.dp)
                    .fillMaxWidth(0.8f),
                    horizontalArrangement = Arrangement.SpaceBetween,) {
                    Text(text = "MAMA CHAMA",
                        style = (TextStyle(
                            color = EndBlue,)))








                }
            }
        },
        sheetPeekHeight = 100.dp
    ){

    }

}

