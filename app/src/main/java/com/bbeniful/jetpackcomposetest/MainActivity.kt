package com.bbeniful.jetpackcomposetest

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.bbeniful.jetpackcomposetest.ui.theme.JetPackComposeTestTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    @ExperimentalComposeApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTestTheme {
                // A surface container using the 'background' color from the theme
                /* Surface(color = MaterialTheme.colors.background) {
                     Greeting("Android")
                 }*/
                //LayoutBasicCompose(text = "Benike")
                Row(modifier = Modifier.fillMaxSize()) {
                    val almafa = kotlin.arrayOf(
                        "a",
                        "b",
                        "c",
                        "d",
                        "e",
                        "f",
                        "a",
                        "b",
                        "c",
                        "d",
                        "e",
                        "f",
                        "a",
                        "b",
                        "c",
                        "d",
                        "e",
                        "f",
                        "a",
                        "b",
                        "c",
                        "d",
                        "e",
                        "f",
                        "a",
                        "b",
                        "c",
                        "d",
                        "e",
                        "f"
                    )
                    ListItems(ArrayList(almafa.toList()), showSimpleToast())
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Blue)
                    ) {
                        ClickableView()
                    }
                }

            }
        }
    }
}

@Composable
fun showSimpleToast(): () -> Unit {
    Toast.makeText(LocalContext.current.applicationContext, "test text", Toast.LENGTH_SHORT).show()
    return
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", color = Color(0xffffffff))
}

@ExperimentalComposeApi
@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeTestTheme {
        //Greeting("Android")
        //LayoutBasicCompose(text = "Benike")
        Row(modifier = Modifier.fillMaxSize()) {
            val almafa = kotlin.arrayOf(
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f"
            )
            ListItems(ArrayList(almafa.toList()))
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Blue)
            ) {
                ClickableView()
            }
        }
    }
}