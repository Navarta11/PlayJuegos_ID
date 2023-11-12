package com.example.playjuegos

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun MenuNewPlayer(navController: NavHostController) {

    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var nickname by remember { mutableStateOf("") }
    var teléfono by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    val newConfig = LocalConfiguration.current


    if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.account),
                    contentDescription = null,
                    Modifier.weight(1f)
                )

                OutlinedTextField(
                    label = { Text(text = "Nombre") },
                    value = nombre,
                    onValueChange = { nombre = it },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text),
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    label = { Text(text = "Apellidos") },
                    value = apellidos,
                    onValueChange = { apellidos = it },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text),
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }
            Spacer(modifier = Modifier.height(25.dp))

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    label = { Text(text = "Nickname") },
                    value = nickname,
                    onValueChange = { nickname = it },
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Spacer(modifier = Modifier.weight(1f))

                Image(
                    painter = painterResource(id = R.drawable.android),
                    contentDescription = null,
                    Modifier.weight(1f)
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                ) {
                    Text(text = "Change")
                }
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.camera),
                    contentDescription = null,
                    Modifier.weight(1f)
                )

                TextField(
                    label = { Text(text = "Teléfono") },
                    value = teléfono,
                    onValueChange = { teléfono = it },
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = null,
                    Modifier.weight(1f)
                )

                OutlinedTextField(
                    label = { Text(text = "Email") },
                    value = email,
                    onValueChange = { email = it },
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.width(150.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(text = "Add new player")
            }
        }
    } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.account),
                    contentDescription = null,
                    Modifier.weight(1f)
                )

                OutlinedTextField(
                    label = { Text(text = "Nombre") },
                    value = nombre,
                    onValueChange = { nombre = it },
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )

            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    label = { Text(text = "Apellidos") },
                    value = apellidos,
                    onValueChange = { apellidos = it },
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }
            Spacer(modifier = Modifier.height(25.dp))

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    label = { Text(text = "Nickname") },
                    value = nickname,
                    onValueChange = { nickname = it },
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Spacer(modifier = Modifier.weight(1f))

                Image(
                    painter = painterResource(id = R.drawable.android),
                    contentDescription = null,
                    Modifier.weight(1f)
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                ) {
                    Text(text = "Change")
                }
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.camera),
                    contentDescription = null,
                    Modifier.weight(1f)
                )

                TextField(
                    label = { Text(text = "Teléfono") },
                    value = teléfono,
                    onValueChange = { teléfono = it },
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = null,
                    Modifier.weight(1f)
                )

                OutlinedTextField(
                    label = { Text(text = "Email") },
                    value = email,
                    onValueChange = { email = it },
                    modifier = Modifier
                        .weight(2f)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "Add new player")
                }
            }
        }
    }
}
