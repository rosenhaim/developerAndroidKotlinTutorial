package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp


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
                    BirthdayGreetingWithImage(message = getString(R.string.happy_birthday_text),
                        getString(
                            R.string.signature_text
                        ))
                }
            }
        }
    }
}


@Composable
fun BirthdayGreetingWithText(message: String, from: String){
   Column(
       modifier = Modifier.fillMaxSize(),
       verticalArrangement = Arrangement.Top,
       horizontalAlignment = Alignment.CenterHorizontally
   ){
       Text(
           text = message,
           fontSize = 36.sp,
           modifier = Modifier
                   .padding(top = 16.dp)
       )
       Text(
           text = from,
           fontSize = 20.sp,
           textAlign = TextAlign.Right,
           modifier = Modifier.padding(top = 16.dp, end = 16.dp)
       .align(alignment = Alignment.End)
           )
   }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier= Modifier){
    val image = painterResource(R.drawable.androidparty)
Box {
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
    BirthdayGreetingWithText(message = "Happy Birthday Rosen", from = "Master Chief")
    }
}

@Preview(showBackground = true, name = "Kotlin programmming", showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Rosen!", "Jack")
    }
}