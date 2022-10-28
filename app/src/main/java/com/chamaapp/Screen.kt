package com.chamaapp

sealed class Screen(val route:String ){
    object Greeting:Screen(route="greeting_screen")
    object Contribute:Screen(route="contribute_screen")
}
