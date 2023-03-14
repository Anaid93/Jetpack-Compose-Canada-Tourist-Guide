package com.example.touristguidecanada.screens


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.touristguidecanada.R


private val messages2:List<MyMessage1> = listOf(
    MyMessage1(R.drawable.a2four,"Four Seasons Hotel Montreal", "Montreal's Four Seasons is sensuous from the moment you enter this maze-like, 17 storeys of luxury. It's splendour reimagined: clearly designed for Instagram, yet with numerous hidden nooks containing rock stars, and exits into high-ends shops or the marble winter-proof entrance."),
    MyMessage1(R.drawable.a2ranch,"Echo Valley Ranch & Spa", "Unleash your inner cowboy or cowgirl, then relax in an ornate Thai spa at this unique wilderness ranch which blends rugged Canadiana with an authentic Thai flavour, set on 160 acres of land in the Cariboo Mountains."),
    MyMessage1(R.drawable.a2crystal,"Hotel Le Crystal", "In downtown, handy for shopping and the Museum of Fine Arts. If you want a contemporary look and on-site facilities, such as a pool, gym, spa, restaurant and parking, this is for you. All 131 suites have a kitchenette; the higher floors offer wide-ranging views."),
    MyMessage1(R.drawable.a2shangri,"Shangri-La Hotel Toronto", "Brimming with an elegant, international flavour, the warm and welcoming Shangri-La embodies total luxury. Its renowned lobby, luring both locals and travellers, is really an urban living room in the heart of the city, featuring live music every day of the week."),
    MyMessage1(R.drawable.a2fairmont,"Fairmont Royal York", "Dominating the skyline for decades after it was built in 1929, the Royal York is the Canadian grande dame of the Fairmont chain. Amping up the luxury factor has kept the hotel in step with the times, a storied icon with a modern outlook. Recent guests have included members of the British Royal Family."),
    MyMessage1(R.drawable.a2empress,"Fairmont Empress", "The city of Victoria – one of Canada’s National Historic Sites – grew up around the skirts of the grand old Empress. The thoroughly modernised Empress 2.0 retains all the old glamour, elegance – and trademark Fairmont impeccable service – blended with a sparkling fresh look."),
    MyMessage1(R.drawable.a2nit,"Nita Lake Lodge", "The only lakefront property in Whistler delivers quintessential Canadiana that doesn’t cost an arm and a leg, but feels like it does. Relax or rev up – the choice is yours when wellness offerings include a full-service spa and myriad outdoor adventures all year round."),

    )

@Composable
fun ThirdScreen(navController: NavController){
    MyMessages2(messages2 = messages2)
}


@Composable
fun MyMessages2(messages2:List<MyMessage1>){
    LazyColumn {
        items(messages2) {message ->
            MyComponent1(message) }
    }
}


