package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(

                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayGreetingWithText(message = "Happy Birthday Rosen!", "Jack")
                }
            }
        }
    }
}
@Composable
fun BirthdayGreetingWithText(message: String, from: String){
   Column{
       Text(text = message, fontSize = 36.sp)
       Text(text = from, fontSize = 20.sp, textAlign = TextAlign.Center)

   }







}



@Preview(showBackground = true)
@Composable
fun BirthdayGreetingTextPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithText(message = "Happy Birthday Rosen!", "Jack")
    }
}