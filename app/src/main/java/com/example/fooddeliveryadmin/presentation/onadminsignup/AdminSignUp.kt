package com.example.fooddeliveryadmin.presentation.onadminsignup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fooddeliveryadmin.R
import com.example.fooddeliveryadmin.navigation.Routes

@Composable
fun AdminSignUp(navController: NavController) {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    val nameOfOwner = remember {
        mutableStateOf("")
    }
    val nameOfRestaurant = remember {
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
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id =R.drawable.g10),
            contentDescription = "Logo",
            modifier = Modifier.size(91.dp,92.dp)
        )

        Text(
            text = "Waves Of Food" ,
            fontSize = 40.sp,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Sign Up Here For Your \n" +
                    "    Admin Dashboard",
            fontSize = 16.sp,
            fontWeight = FontWeight(400),
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(32.dp))
        Row(modifier = Modifier.size(355.dp,18.dp)) {
            Text(
                text = "Choose Your Location ",
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color.Red
            )
        }
        Box (
            modifier = Modifier.size(355.dp,60.dp)
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
        Column (modifier = Modifier.size(355.dp,270.dp)){
            OutlinedTextField(value = nameOfOwner.value, onValueChange = {
                nameOfOwner.value = it
            }, leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.outline_person_24),
                    contentDescription = "person"
                )
            },
                label = {
                    Text(text = "Name Of Owner")
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
            OutlinedTextField(value = nameOfRestaurant.value, onValueChange = {
                nameOfRestaurant.value = it
            }, leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.sharp_home_24),
                    contentDescription = "icon"
                )
            },
                label = {
                    Text(text = "Name of Restaurant")
                }, modifier = Modifier
                    .fillMaxWidth(),
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
                    contentDescription = "icon"
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
                    contentDescription = "icon"
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
                    val iconResource = if (passwordVisible){
                        R.drawable.outline_visibility_24
                    }else{
                        R.drawable.outline_visibility_off_24
                    }
                    IconButton(onClick = { passwordVisible =! passwordVisible }) {
                        Icon(
                            painter = painterResource(id = iconResource),
                            contentDescription = "visibility"
                        )
                    }
                }
            )
        }
        //button to create account
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ navController.navigate(Routes.AdminDashboard) },
            modifier = Modifier
                .size(165.dp, 60.dp)
                .background(brush = gradient, shape = RoundedCornerShape(15.dp)),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            )
        ) {
            Text(
                text = "Create Account",
                fontSize = 19.sp,
                fontFamily = popFontFamily,
                fontWeight = FontWeight(400)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Already Have An Account?",
            fontSize = 10.sp,
            fontWeight = FontWeight(700),
            color = Color.Red,
            modifier = Modifier.clickable {
                navController.navigate(Routes.AdminLogin)
            }
        )
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