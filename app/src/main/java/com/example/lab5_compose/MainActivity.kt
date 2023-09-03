package com.example.lab5_compose

import android.os.Bundle
import android.provider.MediaStore.Audio.Artists
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5_compose.ui.theme.Lab5ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5ComposeTheme {
                mainScreen()
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun mainScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        menu()
    }
}

@Composable
fun menu(){
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .height(70.dp)
            .fillMaxWidth()
    ){
        Row{
            Text(
                modifier = Modifier
                    .padding(start = 12.dp, end = 130.dp, top = 15.dp),
                text = "Todo Eventos",
                fontSize = 30.sp
            )
            Spacer(
                modifier = Modifier.weight(1f)
            )
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(100.dp),
            ) {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.more),
                    contentDescription = null
                )
            }
        }
    }
    Box (
        modifier = Modifier
            .background(Color.White)
            .height(40.dp)
            .fillMaxWidth()
    ){
        Text(
            text = "Your Favorites",
            modifier = Modifier
                .padding(top = 5.dp)
                .padding(horizontal = 15.dp),
            fontSize = 20.sp
        )
    }
    Box(
        modifier = Modifier
            .background(Color.Black)
            .height(480.dp)
            .fillMaxWidth()
    ){
        Column {
            Row {
                Box(
                    modifier = Modifier
                ){
                    concertCard(
                        painter = painterResource(id = R.drawable.yellowclawnilsjim),
                        contentDescription = "",
                        eventTittle = "Yellow Claw",
                        eventDescription = "EDC Las Vegas"
                    )
                }
                Box(
                    modifier = Modifier
                ){
                    concertCard(
                        painter = painterResource(id = R.drawable.timmyttrumpetjpeg),
                        contentDescription = "",
                        eventTittle = "Timmy Trumpet",
                        eventDescription = "Tomorrowland"
                    )
                }
            }
            Row {
                Box(
                    modifier = Modifier
                ){
                    concertCard(
                        painter = painterResource(id = R.drawable.blackpink),
                        contentDescription = "",
                        eventTittle = "Black Pink",
                        eventDescription = "Born Pink"
                    )
                }
                Box(
                    modifier = Modifier
                ){
                    concertCard(
                        painter = painterResource(id = R.drawable.taylorswiftjpg),
                        contentDescription = "",
                        eventTittle = "Taylor Swift",
                        eventDescription = "The Eras Tour"
                    )
                }
            }
        }
    }
    Box (
        modifier = Modifier
            .background(Color.White)
            .height(40.dp)
            .fillMaxWidth()
    ){
        Text(
            text = "All Concerts",
            modifier = Modifier
                .padding(top = 5.dp)
                .padding(horizontal = 15.dp),
            fontSize = 20.sp
        )
    }
    Box(
        modifier = Modifier
            .background(Color.Black)
            .height(480.dp)
            .fillMaxWidth()
    ){
        Column {
            Row {
                Box(
                    modifier = Modifier
                ){
                    concertCard(
                        painter = painterResource(id = R.drawable.arianagrande),
                        contentDescription = "",
                        eventTittle = "Ariana Grande",
                        eventDescription = "thank u, next"
                    )
                }
                Box(
                    modifier = Modifier
                ){
                    concertCard(
                        painter = painterResource(id = R.drawable.kshmrjpg),
                        contentDescription = "",
                        eventTittle = "KSHMR",
                        eventDescription = "Parookaville"
                    )
                }
            }
            Row {
                Box(
                    modifier = Modifier
                ){
                    concertCard(
                        painter = painterResource(id = R.drawable.alok),
                        contentDescription = "",
                        eventTittle = "Alok",
                        eventDescription = "Untold Festival"
                    )
                }
                Box(
                    modifier = Modifier
                ){
                    concertCard(
                        painter = painterResource(id = R.drawable.khalid),
                        contentDescription = "",
                        eventTittle = "Khalid",
                        eventDescription = "American Teen"
                    )
                }
            }
        }
    }
}

@Composable
fun concertCard(
    painter: Painter,
    contentDescription: String,
    eventTittle: String,
    eventDescription: String
    ){
    Card(
        modifier = Modifier
            .width(185.dp)
            .height(240.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                modifier = Modifier.padding(top = 160.dp, start = 15.dp),
                text = eventTittle,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.padding(top = 180.dp, start = 15.dp),
                text = eventDescription,
                fontSize = 14.sp,
            )
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(15.dp),
            ){
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}