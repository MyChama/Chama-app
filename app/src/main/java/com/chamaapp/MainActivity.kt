package com.chamaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chamaapp.ui.theme.*

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChamaAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    LowerPart()
                    Greeting("Rachel")


                    Box {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription ="menu",
                        tint = Color.White, modifier = Modifier
                                .padding(20.dp))

                     Image(painterResource(id = R.drawable.qrcode), contentDescription ="bar",
                         modifier = Modifier
                             .padding(start = 320.dp, top = 20.dp)
                             .size(30.dp),
                         colorFilter = androidx.compose.ui.graphics.ColorFilter
                             .tint(color = Color.White)

                     )

                    }
                    MiddleText()
                    BottomNav()
                }
            }
        }
    }


    @Composable
    fun Greeting(name: String) {

        Row( modifier = Modifier
                .fillMaxWidth(1f) )

        {
            Column(

                modifier = Modifier
                    .background(color = EndBlue)
                    .padding(top = 20.dp)
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.31f),

                ) {

                Text(
                    modifier = Modifier.padding(start = 150.dp),
                    text = "Hi $name!",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                    )

                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 15.dp),
                    text = "Your balance (Ksh)",
                    style = TextStyle(
                        color = Color.White,
                    )

                )
                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp),
                    text = "Ksh 53,950",
                    style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        textAlign = TextAlign.Justify,
                    )

                )

            }

        }
Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.5f),
        horizontalArrangement = Arrangement.SpaceAround
        )
        {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 175.dp)
                    .size(width = 160.dp, height = 50.dp)

            )
            {
                Text(
                    text = "Transfer Money",
                    style = TextStyle(
                        color = EndBlue,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontSize = (18.sp)
                    )
                )
            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 175.dp)
                    .size(width = 160.dp, height = 50.dp)

            )

            {
                Text(
                    text = "Contribute",
                    style = TextStyle(
                        color = EndBlue,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontSize = (18.sp)
                    )
                )
            }

        }
    }

    }


@Composable
fun MiddleText(){
    Row(modifier = Modifier.padding(vertical = 260.dp, horizontal = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    )
    {
        Text(text = "Activities")
        Text(text = "+  Add New")
    }
}

@Composable
fun LowerPart() {
Column (
    modifier = Modifier.fillMaxSize()
    ,
    verticalArrangement = Arrangement.Bottom,
    horizontalAlignment = Alignment.End

        ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(bottom = 30.dp, end = 16.dp)
                .width(160.dp)
                .height(140.dp)
                .background(color = Nude300, shape = RoundedCornerShape(10.dp))
                .size(50.dp)


        )
        {
            Text(
                text = "Loans",
                style = (TextStyle(
                    color = EndBlue,
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,

                    ))
            )
            Icon(painter =
            painterResource(id = R.drawable.loans), contentDescription ="loans",
                tint = EndBlue,
                modifier = Modifier

                    .size(170.dp)
                    .padding(start = 118.dp, bottom = 115.dp))


        }
      //  Spacer(modifier = Modifier.height(30.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(bottom = 150.dp, end = 16.dp)
                .width(160.dp)
                .height(140.dp)
                .background(color = Nude300, shape = RoundedCornerShape(10.dp))
                .size(50.dp)
        ) {
            Text(
                text = "Fines",
                style = (TextStyle(
                    color = EndBlue,
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,

                    ))
            )
            Icon(painter =
            painterResource(id = R.drawable.money), contentDescription ="fines",
                tint = EndBlue,

                modifier = Modifier

                    .size(148.dp)
                    .padding(start = 130.dp, bottom = 110.dp))



        }
    }
    Column (
        modifier = Modifier.fillMaxSize()
        ,
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start

    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(bottom = 30.dp, start = 16.dp)
                .width(160.dp)
                .height(140.dp)
                .background(color = Nude300, shape = RoundedCornerShape(10.dp))
                .size(50.dp)
        )
        {
            Text(
                text = "Projects",
                style = (TextStyle(
                    color = EndBlue,
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,

                    ))
            )
            Icon(painter =
            painterResource(id = R.drawable.kazi), contentDescription ="Projects",
                tint = EndBlue,

                modifier = Modifier
                    .size(136.dp)
                    .padding(start = 120.dp, bottom = 108.dp))

        }
     //   Spacer(modifier = Modifier.height(20.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(bottom = 150.dp, start = 16.dp)
                .width(160.dp)
                .height(140.dp)
                .background(color = Nude300, shape = RoundedCornerShape(10.dp))
                .size(50.dp)
        ) {
            Text(

                text = "Members",
                style = (TextStyle(
                    color = EndBlue,
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,


                    ))
            )
            Icon(painter =
            painterResource(id = R.drawable.group), contentDescription ="loans",
                tint = EndBlue,
                modifier = Modifier
                    .size(134.dp)
                    .padding(start = 115.dp, bottom = 110.dp),

            )

        }

    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomNav(
     drawerState: BottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed)
){

    BottomDrawer(
        drawerState = drawerState,
    drawerContent = {
        Text(text ="Transaction History" )
    }
    )
    {}

}