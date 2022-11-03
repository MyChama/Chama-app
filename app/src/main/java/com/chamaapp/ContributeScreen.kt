package com.chamaapp

import android.graphics.drawable.Icon
import android.util.Log
import android.widget.SearchView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
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
        Column(
            modifier = Modifier
                .fillMaxHeight(0.2f)
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "CONTRIBUTE", color = Color.Black,
            fontSize = 20.sp)
           SearchView()

        }
        Column(modifier = Modifier
            .padding(top = 400.dp, start = 30.dp)
            .fillMaxWidth()

        ) {
            Text(text = "JOIN A NEW CHAMA", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "MURANGA MUMS")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "TURKANA WARRIORS")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "MAKUENI TITANS")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "EASTLEIGH SISTERS")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "PWANI SIMBAS")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "UON COMRADES")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "DAUGHTERS OF NGARA")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "WALIMU SACCO")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "DND GROUP")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "RIZIKI FAMILY")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "SIAYA SAILORS")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "KISUMU BOYS")


        }
    }
    Column(
        modifier = Modifier
            .padding(top = 220.dp, start = 20.dp)
            .fillMaxHeight(0.3f)
            .fillMaxWidth())
    {
        Row {
            Icon(
                painter = painterResource(id = R.drawable.numpad),
                contentDescription = "ENTER CHAMA NUMBER", modifier = Modifier
                    .size(45.dp)
                    .padding(5.dp)
            )
            Text(
                "ENTER CHAMA NUMBER",
                modifier = Modifier
                    .padding(start = 1.dp, top = 10.dp)
            )
        }
        Row {
            Icon(
                painter = painterResource(id = R.drawable.addcircle),
                contentDescription = "CONTRIBUTE HISTORY", modifier = Modifier
                    .size(45.dp)
                    .padding(5.dp)

            )
            Text(
                "CONTRIBUTION HISTORY",
                modifier = Modifier
                    .padding(start = 1.dp, top = 15.dp)
            )
        }
        Row {
            Icon(
                painter = painterResource(id = R.drawable.kalendar),
                contentDescription = "ENTER CHAMA NUMBER",
                modifier = Modifier
                    // .padding(top = 15.dp)
                    .size(45.dp)
                    .padding(5.dp)

            )
            Text(
                "NEXT CONTRIBUTION",
                modifier = Modifier
                    .padding(start = 1.dp, top = 15.dp)
            )
        }

    }
}

@Composable
fun SearchView() {
    OutlinedTextField(


        value = "Search",
        onValueChange = { "" },
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .padding(start = 20.dp, top = 20.dp, end = 20.dp)
            .fillMaxWidth(),



        textStyle = TextStyle(Color.Black, fontSize = 18.sp),
        leadingIcon = {

            Icon(
                Icons.Default.Search,
                contentDescription = "search",
                tint = Color.Black,
                modifier = Modifier
                    .padding(15.dp)
                    .size(24.dp)

            )
        }

    )
    LazyRow {
        items(myChamaList)
        {
          list ->
            ButtonsList(chamaList = list)
        }


    }
}



@Composable
@Preview(showBackground = true)
fun ContributionScreenPreview(){
    ContributeScreen()
}













