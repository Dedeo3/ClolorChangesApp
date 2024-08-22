package com.app.colorchanges

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            colorOption()

        }
    }
}

@Composable
fun colorOption(){
    Column {
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Color changes Option", fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 10.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(10.dp)) {
            Box(modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(color = Color.Red), contentAlignment = Alignment.Center
            ){
                Text(text = "Red", fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            }

            Box(modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(color = Color.Blue), contentAlignment = Alignment.Center
            ){
                Text(text = "Blue", fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            }
            Box(modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(color = Color.Yellow), contentAlignment = Alignment.Center
            ){
                Text(text = "Yellow", fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            }
            Box(modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(color = Color.Magenta), contentAlignment = Alignment.Center
            ){
                Text(text = "Magenta", fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            }


        }
    }

}

@Composable
fun colorBox(){

}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ColorChangesTheme {
//        Greeting("Android")
//    }
//}