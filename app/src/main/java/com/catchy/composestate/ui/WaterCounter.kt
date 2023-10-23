package com.catchy.composestate.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val count: MutableState<Int> = remember { mutableStateOf(0) }

    Text(
        text = "You've had $count glasses.",
        modifier = modifier.padding(16.dp)
    )

    Button(onClick = { count.value++ },modifier = modifier.padding(8.dp)) {
        Text("Add one")
    }
}