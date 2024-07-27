package com.example.fooddeliveryadmin.screenfour

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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun AdminDashboard(navController: NavController) {
    val gradient = Brush.linearGradient(
        colors = listOf(colorResource(id = R.color.mandy), colorResource(id = R.color.thunderBird))
    )
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )

    Column (
        modifier = Modifier.fillMaxSize().padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.g12),
                contentDescription = "img",
                modifier = Modifier.size(36.dp,36.dp)
            )
            Text(
                text = "Waves Of Food",
                fontWeight = FontWeight(400),
                fontSize = 40.sp,
                fontFamily = popFontFamily,
                style = TextStyle(brush = gradient)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier.size(380.dp,110.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand)),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Row (
                modifier = Modifier
                    .size(380.dp, 110.dp)
                    .padding(start = 12.dp, end = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column (
                    modifier = Modifier.size(115.dp,90.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.icon1),
                        contentDescription = "icon1",
                        modifier = Modifier.size(20.dp,20.dp),
                        tint = Color.Red
                    )
                    Text(
                        text = "Pending Order",
                        fontFamily = popFontFamily,
                        fontWeight = FontWeight(400),
                        fontSize = 20.sp,
                        style = TextStyle(brush = gradient)
                    )
                    Text(
                        text = "30",
                        fontFamily = popFontFamily,
                        fontWeight = FontWeight(400),
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
                Column (
                    modifier = Modifier.size(54.dp,91.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.icon2),
                        contentDescription = "icon2",
                        modifier = Modifier.size(20.dp,20.dp),
                        tint = colorResource(id = R.color.pastelGreen)
                    )
                    Text(
                        text = "Completed \n" +
                                "order",
                        fontFamily = popFontFamily,
                        fontWeight = FontWeight(400),
                        fontSize = 12.sp,
                        style = TextStyle(brush = gradient)
                    )
                    Text(
                        text = "10",
                        fontFamily = popFontFamily,
                        fontWeight = FontWeight(400),
                        fontSize = 20.sp,
                        color = colorResource(id = R.color.mySin)
                    )
                }
                Column (
                    modifier = Modifier.size(60.dp,90.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.icon3),
                        contentDescription = "icon3",
                        modifier = Modifier.size(20.dp,20.dp),
                        tint = Color.Black
                    )
                    Text(
                        text = "Whole Time \n" +
                                "Earning",
                        fontFamily = popFontFamily,
                        fontWeight = FontWeight(400),
                        fontSize = 12.sp,
                        style = TextStyle(brush = gradient)
                    )
                    Text(
                        text = "10",
                        fontFamily = popFontFamily,
                        fontWeight = FontWeight(400),
                        fontSize = 20.sp,
                        color = colorResource(id = R.color.pastelGreen)
                    )
                }
            }
        }
        // starts box
        Spacer(modifier = Modifier.height(32.dp))
        Row (
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .size(150.dp, 85.dp)
                    .background(color = colorResource(id = R.color.yPink))
                    .clickable {
                        navController.navigate(Routes.AddMenu)
                    }
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        modifier = Modifier.size(20.dp,20.dp),
                        painter = painterResource(id = R.drawable.plus1),
                        contentDescription = "plus",
                        tint = colorResource(id =R.color.shiraz)
                    )
                    Text(
                        text = "Add Menu",
                        fontWeight = FontWeight(400),
                        fontSize = 10.sp,
                        fontFamily = popFontFamily,
                        color = Color.Red,
                    )
                }
            }
            Box (
                modifier = Modifier
                    .size(150.dp, 85.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = colorResource(id = R.color.yPink))
                    .clickable {
                        navController.navigate(Routes.AllMenuItem)
                    }
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        modifier = Modifier.size(20.dp,20.dp),
                        painter = painterResource(id = R.drawable.eyeicon),
                        contentDescription = "plus",
                        tint = colorResource(id =R.color.shiraz)
                    )
                    Text(
                        text = "All Item Menu",
                        fontWeight = FontWeight(400),
                        fontSize = 10.sp,
                        fontFamily = popFontFamily,
                        color = Color.Red,
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
        Row (
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .size(150.dp, 85.dp)
                    .background(color = colorResource(id = R.color.yPink))
                    .clickable {
                        navController.navigate(Routes.OutForDelivery)
                    }
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        modifier = Modifier.size(20.dp,20.dp),
                        painter = painterResource(id = R.drawable.cicon),
                        contentDescription = "plus",
                        tint = colorResource(id =R.color.shiraz)
                    )
                    Text(
                        text = "Out For Delivery",
                        fontWeight = FontWeight(400),
                        fontSize = 10.sp,
                        fontFamily = popFontFamily,
                        color = Color.Red,
                    )
                }
            }
            Box (
                modifier = Modifier
                    .size(150.dp, 85.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = colorResource(id = R.color.yPink))
                    .clickable {
                        navController.navigate(Routes.AdminFeedback)
                    }
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        modifier = Modifier.size(20.dp,20.dp),
                        painter = painterResource(id = R.drawable.dicon),
                        contentDescription = "plus",
                        tint = colorResource(id =R.color.shiraz)
                    )
                    Text(
                        text = "Feedback",
                        fontWeight = FontWeight(400),
                        fontSize = 10.sp,
                        fontFamily = popFontFamily,
                        color = Color.Red,
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
        Row (
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .size(150.dp, 85.dp)
                    .background(color = colorResource(id = R.color.yPink))
                    .clickable {
                        navController.navigate(Routes.AdminProfile)
                    }
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        modifier = Modifier.size(20.dp,20.dp),
                        painter = painterResource(id = R.drawable.eicon),
                        contentDescription = "plus",
                        tint = colorResource(id =R.color.shiraz)
                    )
                    Text(
                        text = "Profile",
                        fontWeight = FontWeight(400),
                        fontSize = 10.sp,
                        fontFamily = popFontFamily,
                        color = Color.Red,
                    )
                }
            }
            Box (
                modifier = Modifier
                    .size(150.dp, 85.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = colorResource(id = R.color.yPink))
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        modifier = Modifier.size(20.dp,20.dp),
                        painter = painterResource(id = R.drawable.ficon),
                        contentDescription = "plus",
                        tint = colorResource(id =R.color.shiraz)
                    )
                    Text(
                        text = "Money On Holed ",
                        fontWeight = FontWeight(400),
                        fontSize = 10.sp,
                        fontFamily = popFontFamily,
                        color = Color.Red,
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
        Row (
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .size(150.dp, 85.dp)
                    .background(color = colorResource(id = R.color.yPink))
                    .clickable {
                        navController.navigate(Routes.CreateNewUserAdmin)
                    }
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        modifier = Modifier.size(20.dp,20.dp),
                        painter = painterResource(id = R.drawable.gicon),
                        contentDescription = "plus",
                        tint = colorResource(id =R.color.shiraz)
                    )
                    Text(
                        text = "Create New User",
                        fontWeight = FontWeight(400),
                        fontSize = 10.sp,
                        fontFamily = popFontFamily,
                        color = Color.Red,
                    )
                }
            }
            Box (
                modifier = Modifier
                    .size(150.dp, 85.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = colorResource(id = R.color.yPink))
                    .clickable {
                        navController.navigate(Routes.AdminLogin)
                    }
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        modifier = Modifier.size(20.dp,20.dp),
                        painter = painterResource(id = R.drawable.baseline_logout_24),
                        contentDescription = "plus",
                        tint = colorResource(id =R.color.shiraz)
                    )
                    Text(
                        text = "Log Out",
                        fontWeight = FontWeight(400),
                        fontSize = 10.sp,
                        fontFamily = popFontFamily,
                        color = Color.Red,
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
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