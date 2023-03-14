package com.example.touristguidecanada.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.touristguidecanada.R

private val messages:List<MyMessage1> = listOf(
    MyMessage1(R.drawable.aniagara1,"Niagara Falls", "With more than 6 million cu ft of water falling over its brink per minute, Niagara Falls is the most powerful waterfall in North America, attracting millions tourist each year. Located just over an hour's drive from Toronto, along the American border, these massive falls drop approximately 57 meters. You can see the falls at an astoundingly close distance from several key points."),
    MyMessage1(R.drawable.arock1,"Canadian Rockies", "Straddling the British Columbia/Alberta border, this mountain chain runs from the U.S. border to the northern end of British Columbia. Within the Canadian Rockies is some of the most beautiful, serene and, at the same time, breathtaking scenery on the earth’s surface. These mountain jewels are distinct from the American Rockies as they have been very heavily glaciated, resulting in sharply pointed mountains separated by wide, U-shaped valleys gouged by glaciers."),
    MyMessage1(R.drawable.atower1,"Toronto's CN Tower", "CN tower is the tallest free standing structure in the world and it is located in downtown Toronto. The tower stands an impressive 553 meters high and is one of Canada's most famous landmarks. The LookOut and the Glass Floor offer beautiful views out over the entire area. For an added thrill, consider stepping outside of the enclosed area onto the metal walkway."),
    MyMessage1(R.drawable.aquebec1,"Old Quebec (Vieux-Quebec)", "Old Quebec is a UNESCO World Heritage Site and one of Canada's historic gems. Spread across the Upper and Lower Town of Quebec, this area contains the city's most historic buildings. The Lower Town is the site of the original settlement and home to the outstanding Fairmont Le Château Frontenac. The Upper Town rests on 100-meter-high cliffs and is home to the Citadel, the Plains of Abraham, Place d'Armes, and the Parque Historique de l'Artillerie."),
    MyMessage1(R.drawable.afundy1,"Bay of Fundy", "The Bay of Fundy, located in Eastern Canada, is known for its amazing tides. The variation between high and low is the largest in the world, measuring up to a maximum of 19 meters.Some of the most popular locations and sights along the Bay of Fundy are the cliffs and rock formations."),
    MyMessage1(R.drawable.ahill1,"Ottawa's Parliament Hill", "Parliament Hill is a stunning group of buildings that house Canada's parliament. Free tours are offered throughout the year and the Hill is also the setting for national celebrations, like Canada Day - a holiday when Ottawa really comes to life."),
    MyMessage1(R.drawable.alights1,"Aurora Borealis watching, Northwest Territories", "The capital of Canada’s Northwest Territories, Yellowknife, is located directly under the ‘Aurora Oval’, a narrow band encircling the polar reaches of the globe in which the mysterious coloured lights of the aurora borealis are at their most brilliant. Coupled with its clear nights, this favorable geographic location makes Yellowknife consistently one of the best places in the world for aurora viewing."),

    )

data class MyMessage1(val photo:Int = 0, val title: String, val body: String)

@Composable
fun SecondScreen(navController: NavController){
    MyMessages1(messages = messages)
}

@Composable
fun MyMessages1(messages:List<MyMessage1>){
    LazyColumn {
        items(messages) {message ->
            MyComponent1(message) }
    }
}

@Composable
fun MyComponent1(message: MyMessage1){
    Row(modifier = Modifier
        .background(MaterialTheme.colors.background)
        .padding(8.dp)) {
        MyImage1(message)
        MyTexts1(message)
    }
}

@Composable
fun MyTexts1(message: MyMessage1){
    var expanded by remember { mutableStateOf(false) }
    Column(modifier = Modifier
        .padding(start = 8.dp)
        .clickable { expanded = !expanded }) {
        MyText1(message.title,
            MaterialTheme.colors.primary,
            MaterialTheme.typography.subtitle1)
        Spacer(modifier = Modifier.height(16.dp))
        MyText1(message.body,
            MaterialTheme.colors.onBackground,
            MaterialTheme.typography.subtitle2,
            if (expanded) Int.MAX_VALUE else 4)
    }

}

@Composable
fun MyImage1(message: MyMessage1){
    Image(painter = painterResource(message.photo),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(16.dp)))
}

@Composable
fun MyText1(text:String, color: Color, style: TextStyle, lines:Int = Int.MAX_VALUE){
    Text(text, color = color, style = style, maxLines = lines)
}





