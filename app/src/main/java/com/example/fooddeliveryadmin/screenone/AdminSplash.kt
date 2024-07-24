package com.example.fooddeliveryadmin.screenone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddeliveryadmin.R

@Preview(showSystemUi = true)
@Composable
fun AdminSplash() {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    Column (
        modifier = Modifier.fillMaxSize().padding(top = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.g10),
            contentDescription = "img",
            modifier = Modifier.size(190.dp,190.dp)
        )
        Spacer(modifier = Modifier.height(50 .dp))
        Row {
            Text(
                text = "Waves Of Food",
                fontWeight = FontWeight(400),
                fontSize = 40.sp,
                fontFamily = popFontFamily,
                style = TextStyle(brush = gradient)
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row {
            Text(
                text = "Admin Dashboard",
                fontWeight = FontWeight(700),
                fontSize = 14.sp,
                color = Color.Red
            )
        }
        Spacer(modifier = Modifier.height(200.dp))
        Text(
            text = "Design By \n" +
                    "NeatRoots",
            fontWeight = FontWeight(400),
            fontSize = 16.sp,
            fontFamily = popFontFamily,
            color = Color.Red,
        )
    }
}