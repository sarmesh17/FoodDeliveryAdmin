package com.example.fooddeliveryadmin.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fooddeliveryadmin.presentation.onadminfeedback.AdminFeedback
import com.example.fooddeliveryadmin.presentation.onaddmenu.AddMenu
import com.example.fooddeliveryadmin.presentation.onadmindashboard.AdminDashboard
import com.example.fooddeliveryadmin.presentation.onadminprofile.AdminProfile
import com.example.fooddeliveryadmin.presentation.onadminsplash.AdminSplash
import com.example.fooddeliveryadmin.presentation.onoutfordelivery.OutForDelivery
import com.example.fooddeliveryadmin.presentation.onallmenuitem.AllMenuItem
import com.example.fooddeliveryadmin.presentation.oncreatenewuseradmin.CreateNewUserAdmin
import com.example.fooddeliveryadmin.presentation.onadminsignup.AdminSignUp
import com.example.fooddeliveryadmin.presentation.onadminlogin.AdminLogin

@Preview(showSystemUi = true)
@Composable
fun FoodDeliveryAdminNavigator() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = Routes.AdminSplash
    ) {
        composable<Routes.AdminSplash> { 
            AdminSplash(navController)
        }

        composable<Routes.AdminLogin> {
            AdminLogin(navController)
        }

        composable<Routes.AdminSignUp> {
            AdminSignUp(navController)
        }

        composable<Routes.AdminDashboard> {
            AdminDashboard(navController)
        }

        composable<Routes.AddMenu> {
            AddMenu(navController)
        }

        composable<Routes.AllMenuItem> {
            AllMenuItem(navController)
        }

        composable<Routes.OutForDelivery> {
            OutForDelivery(navController)
        }

        composable<Routes.AdminFeedback> {
            AdminFeedback(navController)
        }

        composable<Routes.AdminProfile> {
            AdminProfile(navController)
        }

        composable<Routes.CreateNewUserAdmin> {
            CreateNewUserAdmin(navController)
        }


    }
}
