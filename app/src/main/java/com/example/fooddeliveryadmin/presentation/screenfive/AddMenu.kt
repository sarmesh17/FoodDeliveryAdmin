package com.example.fooddeliveryadmin.presentation.screenfive

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun AddMenu(navController: NavController) {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    var textOne by remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier.fillMaxSize().padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
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
            Spacer(modifier = Modifier.width(70.dp))
            Box (modifier = Modifier.padding(top = 18.dp)){
                Text(
                    text = "Add Item",
                    fontSize = 40.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                    style = TextStyle(brush = gradient)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card (
            modifier = Modifier.size(380.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row(
                modifier = Modifier.size(380.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .padding(5.dp),
                    text = "Item Name",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BasicTextField(
                    value = textOne,
                    onValueChange = { textOne = it },
                    modifier = Modifier.weight(3f)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card (
            modifier = Modifier.size(380.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row(
                modifier = Modifier.size(380.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .padding(5.dp),
                    text = "Item Price",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BasicTextField(
                    value = textOne,
                    onValueChange = { textOne = it },
                    modifier = Modifier.weight(3f)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card (
            modifier = Modifier.size(380.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row(
                modifier = Modifier.size(380.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    text = "Item Image",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )

                Icon(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.baseline_add_circle_outline_24),
                    contentDescription = "edit icon"
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "menuimg",
            modifier = Modifier.size(175.dp,117.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.size(380.dp,50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .padding(5.dp),
                text = "Short Description",
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                fontFamily = popFontFamily
            )
        }
        Box (modifier = Modifier.size(380.dp,70.dp)){
            Text(text = "Lorem ipsum dolor sit amet, \n" +
                    "consectetur adipiscing elit, \n" +
                    "sed do eiusmod tempor incididunt \n" +
                    "ut labore et dolore magna aliqua. Ut enim ad "
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.size(380.dp,150.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box (modifier = Modifier.padding(start = 8.dp)){
                Column (verticalArrangement = Arrangement.Center){
                    Text(
                        text = "Ingredients",
                        fontSize = 14.sp,
                        fontFamily = popFontFamily
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Text(text = "•", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Noddle", fontSize = 12.sp)
                    }
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Text(text = "•", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Salad",fontSize = 12.sp)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "•", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Burger",fontSize = 12.sp)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "•", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Herbal Pan Cake",fontSize = 12.sp)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "•", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Momos",fontSize = 12.sp)
                    }
                }
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(160.dp, 60.dp)
                .background(brush = gradient, shape = RoundedCornerShape(15.dp)),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            )
        ) {
            Text(
                text = "Add Item",
                fontSize = 20.sp,
                fontFamily = popFontFamily,
                fontWeight = FontWeight(400)
            )
        }
    }
}