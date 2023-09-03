package com.example.lab5_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5_compose.ui.theme.Lab5ComposeTheme

class DetailScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5ComposeTheme {
                detailScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun detailScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        detailContent()
    }
}

@Composable
fun detailContent(){
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ){
            Image(
                painterResource(id = R.drawable.tomorrowland),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Tomorrowland",
                modifier = Modifier
                    .padding(top = 205.dp)
                    .padding(horizontal = 10.dp)
                    .width(240.dp),
                color = Color.White,
                fontSize = 30.sp
            )
        }
        Text(
            text = "Timmy Trumpet",
            modifier = Modifier
                .padding(horizontal = 10.dp),
            color = Color.Black,
            fontSize = 20.sp
        )
    }
    Box(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
    ){
        Row {
            Image(
                painterResource(id = R.drawable.calendar),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(horizontal = 10.dp)
                    .size(30.dp),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "Date: ",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .padding(horizontal = 15.dp),
                fontSize = 15.sp
            )
            Text(
                text = "Saturday",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .padding(horizontal = 15.dp),
                fontSize = 15.sp
            )
        }
    }
    Box(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
    ){
        Row {
            Image(
                painterResource(id = R.drawable.clock),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(horizontal = 10.dp)
                    .size(30.dp),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "Time: ",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .padding(horizontal = 15.dp),
                fontSize = 15.sp
            )
            Text(
                text = "6:30",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .padding(horizontal = 15.dp),
                fontSize = 15.sp
            )
        }
    }
    Box(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
    ){
        Column {
            Text(
                text = "About",
                modifier = Modifier
                    .padding(horizontal = 15.dp),
                fontSize = 15.sp
            )
            Text(
                text = "Timmy Trumpet's set at Tomorrowland is sure to be a high-energy, " +
                        "party-starting affair. He is known for his signature blend of electro " +
                        "house, big room, and hardstyle, and his sets are always full of excitement " +
                        "and surprises",
                modifier = Modifier
                    .padding(top = 8.dp)
                    .padding(horizontal = 15.dp),
                fontSize = 8.sp
            )
        }
    }
}