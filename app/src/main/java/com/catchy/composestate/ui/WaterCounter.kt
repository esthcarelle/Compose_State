package com.catchy.composestate.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }

    if (count > 0) {

        WellnessTaskItem(
                onClose = { },
                taskName = "Have you taken your 15 minute walk today?"
        )

        Text(
            text = "You've had $count glasses.",
            modifier = modifier.padding(16.dp)
        )
    }

    Button(onClick = { count++ },modifier = modifier.padding(8.dp),enabled = count < 10) {
        Text("Add one")
    }
}