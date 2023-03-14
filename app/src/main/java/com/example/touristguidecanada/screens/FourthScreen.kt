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

private val messages3:List<MyMessage1> = listOf(
    MyMessage1(R.drawable.a3bay,"The Inn at Fortune Bay", "A once-in-a-lifetime dining experience that starts with a tour of the farm, followed by an oyster and cocktail hour that culminates in a multi-course farm-to-table feast. The feast is a seasonal celebration, highlighting the freshest produce and local livestock and seafood in an evening that breathes new life into farm-to-table dining."),
    MyMessage1(R.drawable.a3alo,"Alo", "Alo, led by chef and owner Patrick Kriss, has topped nearly every best restaurant list. Two dining services allow guests to choose from a blind tasting menu or enjoy the famed cuisine a la carte. Expect an unforgettable and beautifully composed tasting menu that’s surprisingly generous in portions, all made with seasonal ingredients. "),
    MyMessage1(R.drawable.a3tojos,"Tojo’s", "In a city known for fresh seafood and incredible sushi, Tojo’s is hailed by many as Vancouver’s best. The restaurant’s namesake Master chef Tojo is an institution. He’s been serving up his famed, fresh omakase meals and à la carte sushi to patrons for 30 years."),
    MyMessage1(R.drawable.a3eight,"Eight", "As the name would suggest, this is a eight-seat, high-concept restaurant by chef Darren MacLean that’s only open three nights a week. If you’re lucky enough to get a reservation at this kitchen bar, expect a tasting menu that is a love letter to Canadian cuisine and ingredients. More than just a meal, dining at Eight is a conversational, interactive experience."),
    MyMessage1(R.drawable.a3ille,"Île Flottante", "The TimeOut pick for best Montreal restaurant in 2022, this Mile End restaurant has a surprisingly affordable tasting menu (swapped out quarterly) that is vegetable-forward. Presentation and flavour both shine with truly innovative dishes that will surprise and delight all your senses."),
    MyMessage1(R.drawable.a3ottawa,"The Green Door Restaurant and Bakery", "Ottawa’s oldest vegetarian restaurant that serves up menu items made from fresh farm produce. This Main Street establishment has an interesting rotation of seasonal vegetarian dishes (plus vegan and gluten-free options) that are dished up buffet-style and paid by weight. Rarely have we seen a buffet-style restaurant so fresh and health-forward."),
    MyMessage1(R.drawable.a3bar,"Bar Kismet", "This intimate and vibey family-run restaurant specializes in fresh seafood and house-made pasta. A refined menu and attentive service make every meal at Bar Kismet unforgettable. Plus, the bar is shaking up some truly inventive cocktails and a sizable wine list full of unique bottles that offer the perfect accompaniment to your meal."),

    )

@Composable
fun FourthScreen(navController: NavController){
    MyMessages3(messages3 = messages3)
}


@Composable
fun MyMessages3(messages3:List<MyMessage1>){
    LazyColumn {
        items(messages3) {message ->
            MyComponent1(message) }
    }
}


