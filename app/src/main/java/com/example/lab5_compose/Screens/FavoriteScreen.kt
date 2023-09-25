package com.example.lab5_compose.Screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab5_compose.Navigation.AppNavigation
import com.example.lab5_compose.Navigation.TabScreen
import com.example.lab5_compose.R
import com.example.lab5_compose.ui.theme.Lab5ComposeTheme

class FavoriteScreen : ComponentActivity() {
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
fun favoriteScreeen(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        favoriteContent(navController)
    }
}

@Composable
fun favoriteContent(navController: NavController){
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .height(40.dp)
            .fillMaxWidth()
    ){
        Row{
            Button(onClick = { navController.navigate(route = TabScreen.MainScreen.route) }) {
                Text(text = "Atrás")
            }
        }
    }
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .height(100.dp)
            .fillMaxWidth()
    ) {
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
}