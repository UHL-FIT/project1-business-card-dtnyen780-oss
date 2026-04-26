package com.example.ngocyen_bt2704

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ngocyen_bt2704.ui.theme.Ngocyen_bt2704Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ngocyen_bt2704Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE0F7FA))
            .padding(16.dp)
    ) {


        Column(
            modifier = Modifier.weight(1f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(R.drawable.android_logo_png_hd),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .padding(8.dp)
            )

            Text(
                text = "Ngoc Yen",
                fontSize = 30.sp
            )

            Text(
                text = "Android Developer",
                fontSize = 18.sp,
                color = Color.Green
            )
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            InfoRow("📞", "+84 0899 559 780")
            InfoRow("🌐", "@ngocyen")
            InfoRow("✉️", "ngocyen780@gmai.com")
        }
    }
}
@Composable
fun InfoRow(icon: String, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFB2EBF2))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = icon,
            fontSize = 18.sp,
            modifier = Modifier.padding(end = 8.dp)
        )

        Text(
            text = text,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Ngocyen_bt2704Theme {
        BusinessCard()
    }
}