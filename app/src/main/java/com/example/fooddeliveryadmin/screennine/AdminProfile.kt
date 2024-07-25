package com.example.fooddeliveryadmin.screennine

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddeliveryadmin.R

@Preview(showSystemUi = true)
@Composable
fun AdminProfile() {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    var textOne by remember {
        mutableStateOf("")
    }
    var textTwo by remember {
        mutableStateOf("")
    }
    var textThree by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize().padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)) {
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_arrow_circle_left_24),
                    contentDescription = "left arrow",
                )
            }
            Spacer(modifier = Modifier.width(45.dp))
            Box (modifier = Modifier.padding(top = 18.dp)){
                Text(
                    text = "Admin Profile",
                    fontSize = 40.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                    style = TextStyle(brush = gradient)
                )
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row(modifier = Modifier.size(355.dp,18.dp)) {
            Text(
                text = "Choose Your Location ",
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color.Red
            )
        }
        //card for location
        Card (
            modifier = Modifier.size(330.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = "Jaipur",
                    fontWeight = FontWeight(400),
                    fontSize = 14.sp,
                    modifier = Modifier.padding(10.dp)
                )
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painter = painterResource(id = R.drawable.baseline_arrow_circle_down_24), contentDescription = "icon")
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
        //card for name
        Card (
            modifier = Modifier.size(330.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row(
                modifier = Modifier.size(330.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    text = "Name",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box (modifier = Modifier.weight(3f)){
                    if (textOne.isEmpty()) {
                        Text(
                            text = "Lorem mm mmm",
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    BasicTextField(
                        value = textOne,
                        onValueChange = { textOne = it },
                    )
                }
                Icon(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.rounded_edit_square_24),
                    contentDescription = "edit icon"
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        // for address
        Card (
            modifier = Modifier.size(330.dp,100.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row(
                modifier = Modifier.size(330.dp,100.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        modifier = Modifier
                            .weight(1f)
                            .padding(5.dp)
                            .padding(top = 10.dp),
                        text = "Address",
                        fontSize = 20.sp,
                        fontWeight = FontWeight(400),
                        fontFamily = popFontFamily,
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box (modifier = Modifier.weight(3f)){
                    if (textTwo.isEmpty()) {
                        Text(
                            text = "Lorem ipsum is placeholder text \n" +
                                    "commonly used in the graphic, \n" +
                                    "print, and publishing industries \n" +
                                    "for previewing layouts and visual ",
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    BasicTextField(
                        value = textTwo,
                        onValueChange = { textTwo = it },
                    )
                }
                Column {
                    Icon(
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 5.dp, end = 5.dp, bottom = 50.dp),
                        painter = painterResource(id = R.drawable.rounded_edit_square_24),
                        contentDescription = "edit icon"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        //for email
        Card (
            modifier = Modifier.size(330.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row(
                modifier = Modifier.size(330.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    text = "Email",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box (modifier = Modifier.weight(3f)){
                    if (email.isEmpty()) {
                        Text(
                            text = "Loremq @gmail.com",
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    BasicTextField(
                        value = email,
                        onValueChange = { email = it },
                    )
                }
                Icon(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.rounded_edit_square_24),
                    contentDescription = "edit icon"
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        //for phone
        Card (
            modifier = Modifier.size(330.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row(
                modifier = Modifier.size(330.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    text = "Phone",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box (modifier = Modifier.weight(3f)) {
                    if (textThree.isEmpty()) {
                        Text(
                            text = "123456789",
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    BasicTextField(
                        value = textThree,
                        onValueChange = { textThree = it },
                    )
                }
                Icon(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.rounded_edit_square_24),
                    contentDescription = "edit icon"
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        //for password
        Card (
            modifier = Modifier.size(330.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row(
                modifier = Modifier.size(330.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1.5f)
                        .padding(5.dp),
                    text = "Password",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box (modifier = Modifier.weight(3f)){
                    if (password.isEmpty()) {
                        Text(
                            text = "************",
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    BasicTextField(
                        value = password,
                        onValueChange = { password = it },
                    )
                }
                Icon(
                    painter = painterResource(id = R.drawable.outline_visibility_off_24),
                    contentDescription = null,
                    tint = Color.Gray
                )
                Icon(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.rounded_edit_square_24),
                    contentDescription = "edit icon"
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        //for restaurant image
        Card (
            modifier = Modifier.size(330.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
        ){
            Row (
                modifier = Modifier.size(330.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Text(
                    text = "Restaurant Image",
                    fontWeight = FontWeight(400),
                    fontSize = 24.sp,
                    fontFamily = popFontFamily
                )
                Text(
                    text ="Select Image",
                    fontWeight = FontWeight(400),
                    fontSize = 14.sp,
                    fontFamily = popFontFamily
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        //for save button
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(325.dp,60.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)),
            elevation = ButtonDefaults.buttonElevation(5.dp)
        ) {
            Text(
                text = "Save Information",
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color.Red
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
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