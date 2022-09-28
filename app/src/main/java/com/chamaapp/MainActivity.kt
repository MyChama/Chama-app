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
import com.chamaapp.ui.theme.ChamaAppTheme
import com.chamaapp.ui.theme.LightRed
import com.chamaapp.ui.theme.RockPink

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
                    Greeting("Rachel")

                    Space()
                    Box() {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription ="menu",
                        tint = Color.White, modifier = Modifier
                                .padding(20.dp))

                     Image(painterResource(id = R.drawable.qrcode), contentDescription ="bar",
                         modifier = Modifier
                             .padding(start = 340.dp, top = 20.dp)
                             .size(30.dp),
                         colorFilter = androidx.compose.ui.graphics.ColorFilter
                             .tint(color = Color.White)

                     )
                         androidx.compose.material.Button(onClick = { /*TODO*/ },
                             modifier = Modifier
                                 .padding(start = 200.dp, top = 150.dp, end = 15.dp)
                                 .size(width = 160.dp, height = 60.dp)



                         ) {
                             Text(text = "Group Account",
                             style = TextStyle(
                                 fontWeight = FontWeight.Bold
                             )
                                 )



                         }
                        Box(contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .padding(start = 200.dp, top = 290.dp)
                                .width(160.dp)
                                .height(140.dp)
                                .background(color = RockPink)
                                .size(50.dp))
                        {
                            Text(
                                text = "Loans",
                                style = (TextStyle(
                                    fontWeight = FontWeight.Bold, fontSize = 20.sp,

                                    )))

                        }
                        Box(contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .padding(start = 200.dp, top = 450.dp)
                                .width(160.dp)
                                .height(140.dp)
                                .background(color = RockPink)
                                .size(50.dp)) {
                            Text(
                                text = "Fines",
                                style = (TextStyle(
                                    fontWeight = FontWeight.Bold, fontSize = 20.sp,

                                    )))


                        }

                    }
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
                    .background(Color.Black)
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
                        fontStyle = FontStyle.Italic,)


                        )
                    Text(
                        modifier = Modifier
                            .padding(vertical = 10.dp, horizontal = 15.dp),
                        text="Your balance (Ksh)",
                        style = TextStyle(
                            color = Color.White,
                            )


                        )
                                Text(
                                modifier = Modifier
                                    .padding(horizontal = 15.dp),
                        text="Ksh 53,950",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight =FontWeight.Bold,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Justify,)

                    )
                androidx.compose.material.Button(onClick = { /*TODO*/ }, modifier = Modifier
                    .padding(vertical = 30.dp, horizontal = 15.dp)
                    .size(width = 160.dp, height = 60.dp)


                    )
                {
                    Text(text="Transfer Money",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    )
                        )


                        }




                }

            }




        }


    }
@Composable
fun Space(color:Color= RockPink
){
    Column(
        verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(horizontal = 15.dp, vertical = 5.dp)
            .fillMaxWidth(1f)
            .clip(RoundedCornerShape(40.dp))

    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .padding(start = 10.dp, top = 122.dp)
                .width(160.dp)
                .height(140.dp)
                .background(color = RockPink)
                .size(50.dp)

        
        ) {
            Text(text = "Projects",
                style = (TextStyle(fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,

                        )))


            
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .padding(start = 10.dp, top = 20.dp)
                .width(160.dp)
                .height(140.dp)
                .background(color = RockPink)
                .size(50.dp)



        ) {
            Text(
                text = "Shares",
                style = (TextStyle(
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,


                    ))
            )

        }


        }
}