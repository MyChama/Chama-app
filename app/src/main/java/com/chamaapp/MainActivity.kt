package com.chamaapp

import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.drawable.Icon
import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.view.MotionEvent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontSynthesis.Companion.Style
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chamaapp.ui.theme.*
import kotlin.math.E

class MainActivity : ComponentActivity() {
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


                    Box() {
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
                    LowerPart()
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String) {
        Row(

            modifier = Modifier
                .fillMaxWidth(1f)


        )

        {
            Column(

                modifier = Modifier
                    .background(color = EndBlue)
                    .padding(top = 20.dp)
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.35f),

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
                        fontSize = 25.sp,
                        textAlign = TextAlign.Justify,
                    )

                )

            }

        }



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.5f),
        horizontalArrangement = Arrangement.SpaceAround
        )
        {
            androidx.compose.material.Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 150.dp)
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
            androidx.compose.material.Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 150.dp)
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
            androidx.compose.material.Icon(painter =
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
            androidx.compose.material.Icon(painter =
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
            androidx.compose.material.Icon(painter =
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
            androidx.compose.material.Icon(painter =
            painterResource(id = R.drawable.group), contentDescription ="loans",
                tint = EndBlue,
                modifier = Modifier
                    .size(134.dp)
                    .padding(start = 115.dp, bottom = 110.dp),



            )

        }


    }
}
