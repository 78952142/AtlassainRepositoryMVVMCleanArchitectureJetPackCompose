package com.example.atlassainrepo.presentation.navigation

sealed class NavigationItem(val route:String){
    object BitbucketNavigationItem : NavigationItem("bitbucket_list")
    object BitbucketDetailsNavigationItem : NavigationItem(route= "bitbucket_details/{name}")
}
