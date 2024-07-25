package com.example.fooddeliveryadmin.screenten

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddeliveryadmin.R

@Preview(showSystemUi = true)
@Composable
fun CreateNewUserAdmin() {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    val name = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var passwordVisible by remember {
        mutableStateOf(false)
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 18.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)) {
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_arrow_circle_left_24),
                    contentDescription = "left arrow",
                )
            }
            Spacer(modifier = Modifier.width(100.dp))
            Box (modifier = Modifier.padding(top = 18.dp)){
                Image(
                    painter = painterResource(id = R.drawable.g10),
                    contentDescription = "img",
                    modifier = Modifier.size(90.dp,90.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Waves Of Food" ,
            fontSize = 40.sp,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Create New User Admin ",
            fontSize = 16.sp,
            fontWeight = FontWeight(400),
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(32.dp))
        Column (modifier = Modifier.size(355.dp,220.dp)){
            OutlinedTextField(value = name.value, onValueChange = {
                name.value = it
            }, leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.outline_person_24),
                    contentDescription = "person",
                    tint = Color.Black
                )
            },
                label = {
                    Text(text = "Name ")
                }, modifier = Modifier
                    .fillMaxWidth(),
                // .padding(start = 27.dp),
                shape = RoundedCornerShape(20.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(id = R.color.wildSand),
                    unfocusedBorderColor = colorResource(id = R.color.wildSand),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = email.value, onValueChange = {
                email.value = it
            }, leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.outline_email_24),
                    contentDescription = "icon",
                    tint = Color.Black
                )
            },
                label = {
                    Text(text = "Email or Phone Number")
                }, modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(id = R.color.wildSand),
                    unfocusedBorderColor = colorResource(id = R.color.wildSand),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = password, onValueChange = {
                password = it
            }, leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.outline_lock_24),
                    contentDescription = "icon",
                    tint = Color.Black
                )
            },
                label = {
                    Text(text = "Password")
                }, modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(id = R.color.wildSand),
                    unfocusedBorderColor = colorResource(id = R.color.wildSand),
                ), visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    val iconResource = if (passwordVisible) {
                        R.drawable.outline_visibility_24
                    } else {
                        R.drawable.outline_visibility_off_24
                    }
                    IconButton(onClick = { passwordVisible =! passwordVisible }) {
                        Icon(
                            painter = painterResource(id = iconResource),
                            contentDescription = "visibility",
                            tint = Color.Black
                        )
                    }
                }
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(185.dp, 65.dp)
                .background(brush = gradient, shape = RoundedCornerShape(15.dp)),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            )
        ) {
            Text(
                text = "Create New User",
                fontSize = 20.sp,
                fontFamily = popFontFamily,
                fontWeight = FontWeight(400)
            )
        }
        Spacer(modifier = Modifier.height(165.dp))
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