package ru.org_sodeystvie.weatherforecast.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.org_sodeystvie.weatherforecast.R

@Preview(showBackground = true)
@Composable
fun MainPage(){
    Image(
        painter = painterResource(id = R.drawable.weather),
        contentDescription = "weather_bg",
        modifier = Modifier
            .fillMaxSize().alpha(0.5f),
        contentScale = ContentScale.FillBounds
    )
}

