package com.chamaapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import com.chamaapp.R

@Composable
fun TransferPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp),
        )
        {
            Button(modifier= Modifier.size(50.dp),shape = CircleShape,
                onClick = { /*TODO*/ })
            {
                Image(painterResource(id = R.drawable.backicon), contentDescription ="Back",
                    colorFilter = ColorFilter.tint(Color.White),modifier=Modifier.size(70.dp))
            }
            Spacer(modifier= Modifier.width(70.dp))
            Text(text = "Send Money", fontWeight = FontWeight.Bold)

        }
        Column(modifier= Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.17f)
            .padding(top = 20.dp, start = 20.dp, end = 20.dp)

            )
        {
            Text(text="Send To", fontWeight = FontWeight.Bold)
            Row(modifier= Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .background(Taqo))
            {
                Column(modifier=Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp,top=5.dp, bottom=5.dp)
                ) {
                    Text(text = "Noah Muhindi")
                    Text(text = "muhindinoah@exam.com")
                }
            }
        }
        Spacer(modifier = Modifier.height(170.dp))
        Column {

            MyNumPad(
                listOf("1", "2", "3"),
                listOf(0.33f, 0.33f, 0.33f)
            )
            MyNumPad(
                listOf("4", "5", "6"),
                listOf(0.33f, 0.33f, 0.33f)
            )
            MyNumPad(
                listOf("7", "8", "9"),
                listOf(0.33f, 0.33f, 0.33f, 0.33f)
            )
            MyNumPad(
                listOf("0", "<-"),
                listOf(0.5f,0.5f)
            )
        }

        Button(modifier= Modifier
            .padding(20.dp)
            .heightIn(min = 50.dp)
            .widthIn(min = 500.dp),
            onClick = { /*TODO*/ }) {
            Text(text= "Send Money")
        }
    }

}
@Composable
fun MyNumPad( texts: List<String>,  weights: List <Float> /*callback: (text: String) -> Any*/) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            )
            {
                for (i in texts.indices) {
                    MyButtons(
                        text = texts[i],
                        modifier = Modifier.weight(weights[i])
                        /*callback= callback*/
                    )
                }
            }
        }


@Composable
fun MyButtons( text : String, modifier: Modifier = Modifier, /*callback: (text: String) -> Any*/
)
{
 OutlinedButton(modifier= modifier
     .padding(5.dp)
     .heightIn(min = 60.dp), shape = RoundedCornerShape(20.dp),
     onClick = {})
 {
 Text(text)
 }
}

