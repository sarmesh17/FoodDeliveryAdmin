package com.example.fooddeliveryadmin.presentation.screensix

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
import com.example.fooddeliveryadmin.navigation.Routes

@Composable
fun AllMenuItem(navController: NavController) {
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
                onClick = { navController.navigate(Routes.AdminDashboard)}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_arrow_circle_left_24),
                    contentDescription = "left arrow",
                )
            }
            Spacer(modifier = Modifier.width(70.dp))
            Box (modifier = Modifier.padding(top = 18.dp)){
                Text(
                    text = "All Item",
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
                .fillMaxWidth().height(600.dp)
                .padding(start = 15.dp)
        ){
            LazyColumn (content = {
                items(inCategoryList()){ item ->
                    DlogCategory(
                        img = item.img,
                        title = item.title,
                        subtitle = item.subtitle,
                        price = item.price,
                        iconMinus = item.iconMinus,
                        iconPlus = item.iconPlus,
                        qnt =item.qnt ,
                        iconDel = item.iconDel
                    )
                }
            })
        }
    }
}
@Composable
fun DlogCategory(img: Int, title: String, subtitle: String, price: String, iconMinus : Int, iconPlus : Int, qnt : String, iconDel : Int){
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    Card(
        modifier = Modifier
            .padding(5.dp)
            .size(350.dp, 110.dp).padding(top = 16.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.wildSand))
    ) {
        Row (
            modifier = Modifier
                .padding(8.dp)
                .size(350.dp, 100.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(id = img),
                contentDescription ="n",
                modifier = Modifier
                    .size(60.dp)
                    .weight(2f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(4f)) {
                Text(
                    text = title,
                    fontSize = 15.sp,
                    fontFamily =popFontFamily,
                    fontWeight = FontWeight(400)
                )
                Text(
                    text = subtitle,
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.mineShaft),
                    fontWeight = FontWeight(400)
                )
                Text(
                    text = price,
                    color = Color.Red,
                    fontSize = 22.sp
                )
            }
            Column (
                modifier = Modifier.weight(3f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row (
                    modifier = Modifier.size(90.dp,25.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Icon(
                        painter = painterResource(id = iconMinus),
                        contentDescription = "minus icon",
                        modifier = Modifier.size(26.dp,26.dp),
                        tint = colorResource(id = R.color.curiousBlue)
                    )
                    Text(
                        text = qnt,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500)
                    )
                    Icon(
                        painter = painterResource(id = iconPlus),
                        contentDescription ="plus icon",
                        modifier = Modifier.size(26.dp,26.dp),
                        tint = Color.Red
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Icon(painter = painterResource(id = iconDel), contentDescription = "delete icon")
            }
        }
    }

}
data class Catego(val img: Int, val title: String, val subtitle: String, val price: String, val iconMinus: Int, val qnt: String, val iconPlus: Int, val iconDel: Int)

fun inCategoryList():MutableList<Catego>{
    val list = mutableListOf<Catego>()
    list.add(Catego(R.drawable.p1,"Spacy fresh crab","Waroenk kita","$35", R.drawable.icon_minus, "10", R.drawable.baseline_add_box_24, R.drawable.outline_delete_24))
    list.add(Catego(R.drawable.p2,"Spacy fresh crab","Waroenk kita","$35", R.drawable.icon_minus, "10", R.drawable.baseline_add_box_24, R.drawable.outline_delete_24))
    list.add(Catego(R.drawable.p3,"Spacy fresh crab","Waroenk kita","$35", R.drawable.icon_minus, "10", R.drawable.baseline_add_box_24, R.drawable.outline_delete_24))
    return list
}