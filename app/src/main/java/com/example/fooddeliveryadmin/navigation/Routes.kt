package com.example.fooddeliveryadmin.navigation

import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    data object AdminSplash:Routes()

    @Serializable
    data object AdminLogin:Routes()

    @Serializable
    data object AdminSignUp:Routes()

    @Serializable
    data object AdminDashboard:Routes()

    @Serializable
    data object AddMenu:Routes()

    @Serializable
    data object AllMenuItem:Routes()

    @Serializable
    data object OutForDelivery:Routes()

    @Serializable
    data object AdminFeedback:Routes()

    @Serializable
    data object AdminProfile:Routes()

    @Serializable
    data object CreateNewUserAdmin:Routes()

}
