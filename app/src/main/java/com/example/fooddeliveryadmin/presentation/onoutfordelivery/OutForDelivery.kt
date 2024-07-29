package com.example.fooddeliveryadmin.presentation.onoutfordelivery

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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

@Composable
fun OutForDelivery(navController: NavController) {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    Column (
        modifier = Modifier.fillMaxSize().padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)) {
            IconButton(
                onClick = { navController.navigateUp() }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_arrow_circle_left_24),
                    contentDescription = "left arrow",
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Box (modifier = Modifier.padding(top = 18.dp)){
                Text(
                    text = "Out For Delivery",
                    fontSize = 40.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                    style = TextStyle(brush = gradient)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .padding(start = 15.dp)
        ){
            LazyColumn (content = {
                items(inMenuList()){ item ->
                    BlogMenu(
                        customerName = item.customerName,
                        resultColor = item.resultColor,
                        result = item.result,
                        img = item.img
                    )
                }
            })
        }

    }
}
@Composable
fun BlogMenu(customerName : String,resultColor :Color , result : String, img : Int){
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )

    Card(
        modifier = Modifier
            .padding(5.dp)
            .size(350.dp, 110.dp)
            .padding(top = 16.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
    ) {
        Row (
            modifier = Modifier
                .size(330.dp, 110.dp)
                .padding(start = 18.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column {
                Text(
                    text = customerName,
                    fontWeight = FontWeight(400),
                    fontSize = 15.sp,
                    fontFamily = popFontFamily,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Payment",
                    fontWeight = FontWeight(400),
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.mineShaft)
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = result,
                    fontWeight = FontWeight(400),
                    fontSize = 19.sp,
                    color = resultColor
                )
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Delivered",
                    fontWeight = FontWeight(500),
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(6.dp))
                Image(
                    painter = painterResource(id = img),
                    contentDescription = "img",
                    modifier = Modifier.size(35.dp,35.dp)
                )
            }
        }
    }
}
data class Menu(val customerName: String,val result: String,val resultColor: Color,val img: Int)

fun inMenuList():MutableList<Menu>{
    val list = mutableListOf<Menu>()
    list.add(Menu("Customer Name","Not Received", Color.Red,R.drawable.c1))
    list.add(Menu("Customer Name","Received", Color.Green,R.drawable.c2))
    list.add(Menu("Customer Name","Not Received", Color.Red,R.drawable.c1))

    return list
}