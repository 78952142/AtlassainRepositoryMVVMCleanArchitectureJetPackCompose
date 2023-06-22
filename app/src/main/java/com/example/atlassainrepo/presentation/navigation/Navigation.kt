package com.example.atlassainrepo.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.atlassainrepo.presentation.bitbucket_repo_list.BitbucketListScreen
import com.example.atlassainrepo.presentation.user_details_screen.UserDetailsScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationItem.BitbucketNavigationItem.route
    ) {
        composable(NavigationItem.BitbucketDetailsNavigationItem.route) {
            val userName = it.arguments?.getString("name")
            UserDetailsScreen(userName = userName.toString())
        }
        composable(NavigationItem.BitbucketNavigationItem.route) {
            BitbucketListScreen(navController = navController)
        }

    }

}