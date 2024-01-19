package com.example.arabica.screens.main


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun MainBottomBar() {
    BottomAppBar(containerColor = MaterialTheme.colorScheme.primary,
        content = {
            Icon(
                imageVector = Icons.Filled.Home,
                contentDescription = "Home",
                modifier = Modifier
                    .padding(20.dp)
                    .size(40.dp)
                    .weight(2f)
            )
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Favorites",
                modifier = Modifier
                    .padding(20.dp)
                    .size(40.dp)
                    .weight(2f)
            )
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "",
                modifier = Modifier
                    .padding(10.dp)
                    .size(40.dp)
                    .weight(2f),
            )

        })
}