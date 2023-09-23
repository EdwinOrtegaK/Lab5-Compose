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
import androidx.navigation.NavController
import com.example.lab5_compose.Navigation.AppNavigation
import com.example.lab5_compose.ui.theme.Lab5ComposeTheme

class ProfileScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5ComposeTheme {
                AppNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun profileScreeen(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        profileContent(navController)
    }
}

@Composable
fun profileContent(navController: NavController){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color.White), contentAlignment = Alignment.Center
    ){
        Image(
            painterResource(id = R.drawable.fondoespacio),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(top = 25.dp)
                .height(200.dp)
                .width(105.dp)
        ){
            Image(
                painterResource(id = R.drawable.perfil),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Text(
            text = "Edwin Ortega",
            modifier = Modifier.padding(top=200.dp),
            color = Color.White,
            fontSize = 40.sp)
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
            Row{
                Image(
                    painterResource(id = R.drawable.marshmello),
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "Edit Profile",
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .padding(horizontal = 15.dp),
                    fontSize = 20.sp
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
            Row{
                Image(
                    painterResource(id = R.drawable.password),
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "Reset Password",
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .padding(horizontal = 15.dp),
                    fontSize = 20.sp
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
            Row{
                Image(
                    painterResource(id = R.drawable.notificaciones2),
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "Notifications",
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .padding(horizontal = 15.dp),
                    fontSize = 20.sp
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
                        painter = painterResource(id = R.drawable.click),
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
            Row{
                Image(
                    painterResource(id = R.drawable.favoritos),
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(15.dp),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "Favorites",
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .padding(horizontal = 15.dp),
                    fontSize = 20.sp
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
                        painter = painterResource(id = R.drawable.radio),
                        contentDescription = null
                    )
                }
            }
        }
    }
}
