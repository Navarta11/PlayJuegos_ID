package com.example.playjuegos

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun coverMain(navController: NavController) {
    val myCustomFontFamily = FontFamily(Font(R.font.courgetteregular))
    val newConfig = LocalConfiguration.current

    //PRIMERO PONEMOS LA ORIENTACIÓN HORIZONTAL
    if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.avion),
                contentDescription = null,
                Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.padding(10.dp))

            Text(
                text = "Play Juegos",
                fontSize = 50.sp,
                fontFamily = myCustomFontFamily
            )

            Spacer(modifier = Modifier.padding(20.dp))

            Column {
                Row {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(250.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue)
                    ) {
                        Text(text = "Play")

                    }
                    Button(
                        onClick = {navController.navigate("MenuNewPlayer")},
                        modifier = Modifier
                            .width(250.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue)
                    ) {
                        Text(text = "New Player")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Preferences")  },
                        modifier = Modifier
                            .width(250.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue)
                    ) {
                        Text(text = "Preferences")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(250.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue)
                    ) {
                        Text(text = "About")
                    }
                }
            }
        }
        //AQUÍ IRÁ LA VERTICAL
    } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.avion),
                contentDescription = null,
            )

            Spacer(modifier = Modifier.padding(25.dp))

            Text(
                text = "Play Juegos",
                fontSize = 50.sp,
                fontFamily = myCustomFontFamily
            )

            Spacer(modifier = Modifier.padding(20.dp))

            Column {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(250.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "Play")

                }
                Button(
                    onClick = { navController.navigate("MenuNewPlayer")},
                    modifier = Modifier
                        .width(250.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "New Player")
                }
                Button(
                    onClick = { navController.navigate("Preferences") },
                    modifier = Modifier
                        .width(250.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "Preferences")
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(250.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "About")
                }
            }
        }
    } //CIERRE DE LA VERTICAL
}

