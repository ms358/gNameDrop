package com.example.gnamedrop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gnamedrop.ui.theme.GNameDropTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GNameDropTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column {
                        MessageCard(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )
                        FilledButtonExample()
                    }

                }
            }
        }
    }
}

@Composable
fun MessageCard(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun FilledButtonExample(onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text("Share")
    }
}

@Preview(showBackground = true)
@Composable
fun MessageCard() {
    GNameDropTheme {
        MessageCard("Android")
    }
}
@Preview
@Composable
fun FilledButtonExample() {
    GNameDropTheme {
	FilledButtonExample(onClick = {})
    }
}
