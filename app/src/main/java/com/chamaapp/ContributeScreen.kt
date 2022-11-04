package com.chamaapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
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
            Text(text = "CONTRIBUTE", color = EndBlue,
            fontSize = 15.sp)
           SearchView()
            ChamaMpya()
        }
    }
    Column(
        modifier = Modifier
            .padding(top = 220.dp, start = 20.dp)
            .fillMaxHeight(0.3f)
            .fillMaxWidth())
    {
        Row{
            Box(modifier = Modifier
                .size(50.dp)
                .background(color = Taqo, shape = RoundedCornerShape(25.dp)),
            contentAlignment = Alignment.Center)
            {
                Icon(
                    painter = painterResource(id = R.drawable.phone), tint = EndBlue,
                    contentDescription = "ENTER CHAMA NUMBER", modifier = Modifier
                        .size(40.dp)
                        .padding(5.dp)
                )
            }
            Text(
                "ENTER CHAMA NUMBER",color = EndBlue,
                modifier = Modifier
                    .padding(start = 10.dp, top = 15.dp)
            )
        }
        Row (modifier=Modifier.padding(top=10.dp)){Box(modifier = Modifier
            .size(50.dp)
            .background(color = Taqo, shape = RoundedCornerShape(25.dp)),
            contentAlignment = Alignment.Center)
        {
            Icon(
                painter = painterResource(id = R.drawable.newcontribution), tint = EndBlue,
                contentDescription = "CONTRIBUTE HISTORY", modifier = Modifier
                    .size(45.dp)
                    .padding(5.dp)
                    .clip(CircleShape)
                    .background(Taqo)
            )
        }
            Text(
                "CONTRIBUTION HISTORY",color = EndBlue,
                modifier = Modifier
                    .padding(start = 10.dp, top = 15.dp)
            )
        }
        Row (modifier=Modifier.padding(top=10.dp)){
            Box(modifier = Modifier
                .size(50.dp)
                .background(color = Taqo, shape = RoundedCornerShape(25.dp)),
                contentAlignment = Alignment.Center)
            {
                Icon(
                    painter = painterResource(id = R.drawable.newkalendar), tint = EndBlue,
                    contentDescription = "Next Contribution",
                    modifier = Modifier
                        // .padding(top = 15.dp)
                        .size(45.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                        .background(Taqo)
                )
            }
            Text(
                "NEXT CONTRIBUTION",color = EndBlue,
                modifier = Modifier
                    .padding(start = 10.dp, top = 15.dp)
            )
        }
        Spacer(modifier = Modifier.padding(15.dp))


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
fun ChamaMpya() {
    Column(
        modifier = Modifier
            .padding(top = 180.dp, start = 30.dp)
            .fillMaxWidth()

    ) {

        Spacer(modifier = Modifier.padding(15.dp))
        Text(text = "JOIN A NEW CHAMA", color = EndBlue, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.padding(10.dp))



        LazyColumn {
            items(newChamasList)
            { newList ->
                NewChama(chamaScreen = newList)
            }
        }
    }

}











