package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
fun BusinessCard(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray),verticalArrangement = Arrangement.SpaceEvenly) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()

            ) {
            //Section 1
            val logo = painterResource(id = R.drawable.android_logo)
            Image(painter = logo, contentDescription = null, modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .height(100.dp))

            Text(
                text = "Full Name",
                fontSize = 30.sp,
                modifier = Modifier.padding(start = 16.dp,end = 16.dp),
                color = Color.White,
            )
            Text(
                text = "Title"
                    , color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp,end = 16.dp)
            )


        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
            ) {
            //Section2
            Row() {
                Icon(imageVector = Icons.Filled.Call, contentDescription = null,
                modifier = Modifier.padding(12.dp))
                Text(text = "Text",
                    modifier = Modifier.padding(12.dp)
                )
            }
            Row() {
                Icon(imageVector = Icons.Filled.Share,
                    contentDescription = null,
                modifier = Modifier.padding(12.dp))
                Text(text = "Text2",
                    modifier = Modifier.padding(12.dp)
                    )
            }
            Row() {
                Icon(imageVector = Icons.Filled.Email,
                    contentDescription = null,
                modifier = Modifier.padding(12.dp))
                Text(text = "text3",
                modifier = Modifier.padding(12.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
//        Greeting("Android")
        BusinessCard()
    }
}