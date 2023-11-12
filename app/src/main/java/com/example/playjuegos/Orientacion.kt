package com.example.playjuegos

import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun Orientacion() {
    val newConfig = LocalConfiguration.current

    if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Spacer(modifier = Modifier.padding(40.dp))
            
            Text(
                text = "Play Juegos",
                fontSize = 50.sp
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
        Spacer(modifier = Modifier.padding(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(250.dp)
                    ) {
                        Text(text = "Play")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(250.dp)
                    ) {
                        Text(text = "Preferences")
                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.width(250.dp)
                        ) {
                            Text(text = "New PLayer")
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.width(250.dp)
                        ) {
                            Text(text = "About")
                        }
                    }

            }
        }
    }
        else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Play Juegos",
                    fontSize = 50.sp
                )
                Spacer(modifier = Modifier.padding(20.dp))

                Column {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(250.dp)
                    ) {
                        Text(text = "Play")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(250.dp)
                    ) {
                        Text(text = "New Player")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(250.dp)
                    ) {
                        Text(text = "Preferences")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(250.dp)
                    ) {
                        Text(text = "About")
                }
            }
        }
    }
}