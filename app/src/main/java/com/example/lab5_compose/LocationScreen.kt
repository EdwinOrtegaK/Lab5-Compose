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

class LocationScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5ComposeTheme {
                locationScreeen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun locationScreeen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        locationContent()
    }
}

@Composable
fun locationContent(){
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .height(100.dp)
            .fillMaxWidth()
    ){
        Box(
            modifier = Modifier
                .padding(10.dp)
        ){
            Row {
                Image(
                    painterResource(id = R.drawable.yellowclaw),
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Box(
                    modifier = Modifier
                ){
                    Column {
                        Text(
                            text = "Yellow Claw",
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(horizontal = 15.dp),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "EDC Las Vegas",
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(horizontal = 15.dp),
                            fontSize = 12.sp
                        )
                    }
                }
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
                        painter = painterResource(id = R.drawable.radio),
                        contentDescription = null
                    )
                }
            }
        }
    }
    Box(
        modifier = Modifier
            .background(Color.White)
            .height(100.dp)
            .fillMaxWidth()
    ){
        Box(
            modifier = Modifier
                .padding(10.dp)
        ){
            Row {
                Image(
                    painterResource(id = R.drawable.timmytrummpet),
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Box(
                    modifier = Modifier
                ){
                    Column {
                        Text(
                            text = "Timmy Trumpet",
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(horizontal = 15.dp),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "Tomorrowland",
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(horizontal = 15.dp),
                            fontSize = 12.sp
                        )
                    }
                }
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
                        painter = painterResource(id = R.drawable.radio),
                        contentDescription = null
                    )
                }
            }
        }
    }
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .height(100.dp)
            .fillMaxWidth()
    ){
        Box(
            modifier = Modifier
                .padding(10.dp)
        ){
            Row {
                Image(
                    painterResource(id = R.drawable.tioaoki),
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Box(
                    modifier = Modifier
                ){
                    Column {
                        Text(
                            text = "Steve Aoki",
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(horizontal = 15.dp),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "Ultra Miami",
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(horizontal = 15.dp),
                            fontSize = 12.sp
                        )
                    }
                }
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
                        painter = painterResource(id = R.drawable.radio),
                        contentDescription = null
                    )
                }
            }
        }
    }
    Box(
        modifier = Modifier
            .background(Color.White)
            .height(100.dp)
            .fillMaxWidth()
    ){
        Box(
            modifier = Modifier
                .padding(10.dp)
        ){
            Row {
                Image(
                    painterResource(id = R.drawable.hozho),
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Box(
                    modifier = Modifier
                ){
                    Column {
                        Text(
                            text = "Hozho",
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(horizontal = 15.dp),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "Empire Music Festival",
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(horizontal = 15.dp),
                            fontSize = 12.sp
                        )
                    }
                }
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
                        painter = painterResource(id = R.drawable.radio),
                        contentDescription = null
                    )
                }
            }
        }
    }
}