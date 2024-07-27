package com.example.fooddeliveryadmin.screeneight

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fooddeliveryadmin.R
import com.example.fooddeliveryadmin.navigation.Routes

@Composable
fun AdminFeedback(navController: NavController) {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 17.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)) {
            IconButton(
                onClick = { navController.navigate(Routes.AdminDashboard) }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_arrow_circle_left_24),
                    contentDescription = "left arrow",
                )
            }
            Spacer(modifier = Modifier.width(70.dp))
            Box (modifier = Modifier.padding(top = 18.dp)){
                Text(
                    text = "Feedback",
                    fontSize = 40.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                    style = TextStyle(brush = gradient)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card (
            modifier = Modifier.size(350.dp,105.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Column (
                modifier = Modifier.size(350.dp,105.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ){
                Text(
                    text = "Customer Name",
                    fontWeight = FontWeight(400),
                    fontSize = 15.sp,
                    fontFamily = popFontFamily,
                    color = Color.Red
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing \n" +
                            "elit, sed do eiusmod tempor incididunt ut labore et \n" +
                            "dolore magna aliqua. Ut enim ad minim veniam, ",
                    fontWeight = FontWeight(400),
                    fontSize = 15.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card (
            modifier = Modifier.size(350.dp,105.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Column (
                modifier = Modifier.size(350.dp,105.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ){
                Text(
                    text = "Customer Name",
                    fontWeight = FontWeight(400),
                    fontSize = 15.sp,
                    fontFamily = popFontFamily,
                    color = Color.Red
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing \n" +
                            "elit, sed do eiusmod tempor incididunt ut labore et \n" +
                            "dolore magna aliqua. Ut enim ad minim veniam, ",
                    fontWeight = FontWeight(400),
                    fontSize = 15.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card (
            modifier = Modifier.size(350.dp,105.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Column (
                modifier = Modifier.size(350.dp,105.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ){
                Text(
                    text = "Customer Name",
                    fontWeight = FontWeight(400),
                    fontSize = 15.sp,
                    fontFamily = popFontFamily,
                    color = Color.Red
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing \n" +
                            "elit, sed do eiusmod tempor incididunt ut labore et \n" +
                            "dolore magna aliqua. Ut enim ad minim veniam, ",
                    fontWeight = FontWeight(400),
                    fontSize = 15.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}