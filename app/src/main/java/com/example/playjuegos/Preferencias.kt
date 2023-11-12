package com.example.playjuegos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Preferences(navController: NavController) {
    var selectionIcon by remember { mutableStateOf(false) }
    Column {
        Row(Modifier.fillMaxWidth()) {
            Text(text = "Elige un opción:",
                modifier = Modifier.padding(10.dp)
            )
        }

        Row {
            RadioButton(
                selected = selectionIcon,
                onClick = {selectionIcon = true },
                enabled = true
            )
            Text(text = "Angry Birds")
        }
        Row {
            RadioButton(
                selected = selectionIcon,
                onClick = { selectionIcon = true  },
                enabled = true
            )
            Text(text = "Dragon Fly",
            modifier = Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(
                selected = false,
                onClick = { /*TODO*/ },
                enabled = true
            )
            Text(text = "Hill Climbing Racing")
        }
        Row {
            RadioButton(
                selected = false,
                onClick = { /*TODO*/ },
                enabled = true
            )
            Text(text = "Pocket Soccer")
        }
        Row {
            RadioButton(
                selected = false,
                onClick = { /*TODO*/ },
                enabled = true
            )
            Text(text = "Rediant defense")
        }
    }
}