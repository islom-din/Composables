package com.example.composables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

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