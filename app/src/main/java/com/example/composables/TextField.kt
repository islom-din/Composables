package com.example.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EditText() {
    val nameState = remember {
        mutableStateOf("")
    }
    /**
     * also we can use --> by remember {}, so in that case
     * nameState will not be a state, it'll be a string
     * */

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp)
    ) {
        TextField(
            value = nameState.value,
            onValueChange = {
                nameState.value = it
            },
            label = {
                Text("Enter your name")
            },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {}) {
            Text("Click me")
        }

    }

    /**
     * to show a snackbar there's a composable SnackBar nad
     * we can use it with Scafold
     * */
}