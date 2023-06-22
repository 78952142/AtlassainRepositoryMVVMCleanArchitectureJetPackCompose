package com.example.atlassainrepo.presentation.user_details_screen

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.example.atlassainrepo.presentation.user_details_screen.components.UserDetailsScreenItem


@Composable
fun UserDetailsScreen(userName: String) {

    Scaffold(topBar = { TopAppBar(title = { Text(text = "User Details") }) }) {
       UserDetailsScreenItem(userName = userName)
    }




}