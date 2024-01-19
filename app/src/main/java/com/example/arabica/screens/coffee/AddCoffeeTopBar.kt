package com.example.arabica.screens.coffee

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewCoffeeAppBar(isClicked:Boolean){
    TopAppBar(
        navigationIcon = {
            BackAction(onBackClicked = {
            })
        },
        title={
            Text(text="Add New Coffee",
                color=MaterialTheme.colorScheme.primary
            )},
        actions = {}
    )
}

@Composable
fun BackAction(
    onBackClicked: ()->Unit
){
    IconButton(onClick = {}) {
        Icon(imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back Arrow",
        )
    }
}
