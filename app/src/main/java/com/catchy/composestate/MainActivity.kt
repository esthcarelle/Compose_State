package com.catchy.composestate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.catchy.composestate.ui.WellnessScreen
import com.catchy.composestate.ui.WellnessViewModel
import com.catchy.composestate.ui.theme.ComposeStateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStateTheme {
                // A surface container using the 'background' color from the theme
                WellnessScreen(wellnessViewModel = WellnessViewModel())
            }
        }
    }
}
@Composable
fun HelloWorld(name: String, modifier: Modifier,numberOfKids: Int){
    Text(text = "Hi my name is $name and I have $numberOfKids kids!")
}

@Composable
fun TextButton(text: String) {
    Box(modifier = Modifier.clickable(onClick = {  })) {
        Text(text = text)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeStateTheme {
        Greeting("Android")
    }
}
