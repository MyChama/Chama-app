package com.chamaapp

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chamaapp.ui.theme.EndBlue
import com.chamaapp.ui.theme.Taqo

@Composable
fun ContributeScreen() {
    Surface(color = Color.White) {
        Row() {
            Text(text = "Contribute", color = Taqo)

        }

    }
    Scaffold (
        topBar = {TopBar()},
        backgroundColor = Taqo
    ){

    }
}
@Composable
fun TopBar(){
    Icon(Icons.Default.Search , contentDescription ="search" )
    TopAppBar(title = {Text(text ="Contribute") },



        )}

@Composable
fun SearchView(){
    TextField(
        value = "Search",
        onValueChange = {""},
        modifier = Modifier.fillMaxWidth(),
        textStyle = TextStyle(Color.White, fontSize = 18.sp),
        leadingIcon = {


            Icon(Icons.Default.Search,
                contentDescription ="search",
                tint = Color.White,
                modifier = Modifier
                    .padding(15.dp)
                    .size(24.dp)

            )
        }
    )



}










@Composable
@Preview(showBackground = true)
fun ContributionScreenPreview(){
    ContributeScreen()


}
@Composable
@Preview(showBackground = true)
fun TopBarPreview(){
    TopBar()


}
@Composable
@Preview(showBackground = true)
fun SearchViewPreview() {
    SearchView()
}












