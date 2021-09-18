package com.example.composables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composables.ui.theme.ComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.aot)
            val description = "Coming this fall"
            val title = "Attack on Titan"

            // Example of using ImageCard composable
            Box(modifier = Modifier
                .width(300.dp)
                .padding(15.dp)
            ) {
                ImageCard(
                    painter = painter,
                    contentDescription = description,
                    title = title,
                )
            }
        }
    }
}



// Modifier
// modifier = Modifier.fillMaxSize(0.5f) --> 50% of screen
// modifier = Modifier.width(200.dp) --> 200 dp of width
// Modifier.fillMaxWidth()
// Modifier.fillMaxHeight()
// Modifier.padding(15.dp) | Modifier.padding(top = 15.dp)
// Modifier.width()
// Modifier.requiredWidth(600.dp)
// Modifier.offset(5.dp, 20.dp)
// Modifier.border(5.dp, Color.Green)

// .border(1.dp, Color.red)
// .padding(10.dp)
// .border(1.dp, Color.green)
// ...

// Modifier.clickable {
//    some code ...
// }

// Spacer(modifier = Modifier.height(50.dp))