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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.navigation.NavController
import com.example.lab5_compose.Navigation.AppNavigation
import com.example.lab5_compose.ui.theme.Lab5ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5ComposeTheme {
                    AppNavigation()
                }
            }
        }
    }

@Composable
fun mainScreen(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        menu(navController)
    }
}

@Composable
fun menu(navController: NavController){
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
                text = "TodoEventos+",
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
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        item {
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
                            functionalCard(
                                painter = painterResource(id = R.drawable.yellowclawnilsjim),
                                description = "",
                                eventArtist = "Yellow Claw",
                                eventInformation = "EDC Las Vegas"
                            )
                        }
                        Box(
                            modifier = Modifier
                        ){
                            functionalCard(
                                painter = painterResource(id = R.drawable.timmyttrumpetjpeg),
                                description = "",
                                eventArtist = "Timmy Trumpet",
                                eventInformation = "Tomorrowland"
                            )
                        }
                    }
                    Row {
                        Box(
                            modifier = Modifier
                        ){
                            functionalCard(
                                painter = painterResource(id = R.drawable.blackpink),
                                description = "",
                                eventArtist = "Black Pink",
                                eventInformation = "Born Pink"
                            )
                        }
                        Box(
                            modifier = Modifier
                        ){
                            functionalCard(
                                painter = painterResource(id = R.drawable.taylorswiftjpg),
                                description = "",
                                eventArtist = "Taylor Swift",
                                eventInformation = "The Eras Tour"
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
                            functionalCard(
                                painter = painterResource(id = R.drawable.arianagrande),
                                description = "",
                                eventArtist = "Ariana Grande",
                                eventInformation = "thank u, next"
                            )
                        }
                        Box(
                            modifier = Modifier
                        ){
                            functionalCard(
                                painter = painterResource(id = R.drawable.kshmrjpg),
                                description = "",
                                eventArtist = "KSHMR",
                                eventInformation = "Parookaville"
                            )
                        }
                    }
                    Row {
                        Box(
                            modifier = Modifier
                        ){
                            functionalCard(
                                painter = painterResource(id = R.drawable.alok),
                                description = "",
                                eventArtist = "Alok",
                                eventInformation = "Untold Festival"
                            )
                        }
                        Box(
                            modifier = Modifier
                        ){
                            functionalCard(
                                painter = painterResource(id = R.drawable.khalid),
                                description = "",
                                eventArtist = "Khalid",
                                eventInformation = "American Teen"
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun functionalCard(
    painter: Painter,
    description: String,
    eventArtist: String,
    eventInformation: String
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
                text = eventArtist,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.padding(top = 180.dp, start = 15.dp),
                text = eventInformation,
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
                    contentDescription = description,
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}