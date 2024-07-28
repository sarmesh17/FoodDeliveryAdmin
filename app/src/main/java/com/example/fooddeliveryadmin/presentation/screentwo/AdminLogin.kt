package com.example.fooddeliveryadmin.presentation.screentwo

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fooddeliveryadmin.R
import com.example.fooddeliveryadmin.navigation.Routes

@Composable
fun AdminLogin(navController: NavController) {

    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
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
            text = "Login To Your \n" +
                    "Admin Dashboard",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(15.dp))

        Box (
            modifier = Modifier
                .height(195.dp)
                .padding(8.dp),
            contentAlignment = Alignment.Center,

            ){
            Column {


                OutlinedTextField(value = email.value, onValueChange = {
                    email.value = it
                },
                    label = {
                        Text(text = "Email")
                    }, modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = colorResource(id = R.color.wildSand),
                        unfocusedBorderColor = colorResource(id = R.color.wildSand),
                        focusedTrailingIconColor = colorResource(id = R.color.wildSand),
                        unfocusedTrailingIconColor = colorResource(id = R.color.wildSand)
                    )
                )
                Spacer(modifier = Modifier.height(11.dp))

                OutlinedTextField(value = password.value, onValueChange = {
                    password.value = it
                },
                    label = {
                        Text(text = "Password")
                    }, modifier = Modifier
                        .fillMaxWidth(),
                    // .padding(start = 27.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = colorResource(id = R.color.wildSand),
                        unfocusedBorderColor = colorResource(id = R.color.wildSand),
                        focusedTrailingIconColor = colorResource(id = R.color.wildSand),
                        unfocusedTrailingIconColor = colorResource(id = R.color.wildSand)
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        Text(
            text = "Or",
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            textAlign = TextAlign.Center,
            fontSize = 10.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Continue With",
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row{
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .height(57.dp)
                    .width(152.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Color.White),

                ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.facebook_31),
                        contentDescription ="Facebook",
                        modifier = Modifier.size(25.dp,25.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Facebook",
                        color = Color.Black
                    )
                }

            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .height(57.dp)
                    .width(152.dp),
                colors = ButtonDefaults.buttonColors(Color.White),

                ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.google_icon_1),
                        contentDescription ="Google",
                        modifier = Modifier.size(25.dp,25.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Google",
                        color = Color.Black
                    )
                }


            }
        }
        Button(
            onClick = { /*TODO*/ navController.navigate(Routes.AdminDashboard)},
            modifier = Modifier
                .size(160.dp, 60.dp)
                .background(brush = gradient, shape = RoundedCornerShape(15.dp)),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            )
        ) {
            Text(
                text = "Login",
                fontSize = 20.sp,
                fontFamily = popFontFamily,
                fontWeight = FontWeight(400)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Don’t Have Account?",
            fontSize = 10.sp,
            fontWeight = FontWeight(700),
            color = Color.Red,
            modifier = Modifier.clickable {
                navController.navigate(Routes.AdminSignUp)
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