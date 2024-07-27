package com.example.fooddeliveryadmin.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fooddeliveryadmin.screeneight.AdminFeedback
import com.example.fooddeliveryadmin.screenfive.AddMenu
import com.example.fooddeliveryadmin.screenfour.AdminDashboard
import com.example.fooddeliveryadmin.screennine.AdminProfile
import com.example.fooddeliveryadmin.screenone.AdminSplash
import com.example.fooddeliveryadmin.screenseven.OutForDelivery
import com.example.fooddeliveryadmin.screensix.AllMenuItem
import com.example.fooddeliveryadmin.screenten.CreateNewUserAdmin
import com.example.fooddeliveryadmin.screenthree.AdminSignUp
import com.example.fooddeliveryadmin.screentwo.AdminLogin

@Preview(showSystemUi = true)
@Composable
fun FoodDeliveryAdminNavigator() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = Routes.AdminSplash
    ) {
        composable(route = Routes.AdminSplash){
            AdminSplash(navController)
        }

        composable(route = Routes.AdminLogin){
            AdminLogin(navController)
        }

        composable(route = Routes.AdminSignUp){
            AdminSignUp(navController)
        }

        composable(route = Routes.AdminDashboard){
            AdminDashboard(navController)
        }

        composable(route = Routes.AddMenu) {
            AddMenu(navController)
        }

        composable(route = Routes.AllMenuItem) {
            AllMenuItem(navController)
        }

        composable(route = Routes.OutForDelivery) {
            OutForDelivery(navController)
        }

        composable(route = Routes.AdminFeedback) {
            AdminFeedback(navController)
        }

        composable(route = Routes.AdminProfile) {
            AdminProfile(navController)
        }

        composable(route = Routes.CreateNewUserAdmin) {
            CreateNewUserAdmin(navController)
        }
    }
}
