package com.example.arabica.screens.main



import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import com.example.arabica.screens.coffee.NewCoffeeAppBar


@Composable
fun MainScreen(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }
    Scaffold(
        content = {},
        floatingActionButton = {
            MainFAB()
        },
        bottomBar = {
            MainBottomBar()
        }
    )
}



@Composable
fun MainFAB(){
    var isClicked by remember {
        mutableStateOf(false)
    }
    FloatingActionButton(
        onClick = {
            isClicked=true
        },
        containerColor = MaterialTheme.colorScheme.primary,
        shape = MaterialTheme.shapes.extraSmall,
    ) {
        Icon(imageVector = Icons.Filled.Add,
            contentDescription = "Add Coffee")
        if(isClicked){
         NewCoffeeAppBar(isClicked)
        }
    }
}
