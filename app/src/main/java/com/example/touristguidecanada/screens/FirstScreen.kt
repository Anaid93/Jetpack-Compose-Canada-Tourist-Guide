package com.example.touristguidecanada.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.touristguidecanada.R
import com.example.touristguidecanada.navigation.AppScreens



@Composable
fun FirstScreen(navController: NavController){
    Image(painter = painterResource(id = R.drawable.op8),
        contentDescription = "Image First Screen",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .border(BorderStroke(width = 3.dp, color = Color.White))
        )

    MyTitle()

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(450.dp))
        SelectionTG(navController)
    }

}

@Composable
fun Subtitle(text: String){
    Text(text = text,
        fontFamily = FontFamily.SansSerif,
        fontSize = 24.sp,
        color = Color.Black)
}

@Composable
fun MyTitle(){
    Column(modifier = Modifier.padding(start = 40.dp, top = 20.dp)) {
            Text(text = "Canada", color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontSize = 80.sp)
        Spacer(modifier = Modifier.height(18.dp))
        Subtitle("Known worldwide \n for its crystal clear lakes \n and towering mountains.")        
    }
}


@Composable
fun SelectionTG(navController: NavController){
    val scrollState = rememberScrollState()
    Row(modifier = Modifier.horizontalScroll(scrollState)) {
        Spacer(modifier = Modifier.padding(12.dp))
        Attractions(navController)
        Spacer(modifier = Modifier.padding(12.dp))
        Accommodation(navController)
        Spacer(modifier = Modifier.padding(12.dp))
        Restaurants(navController)
        Spacer(modifier = Modifier.padding(12.dp))
    }

}


@Composable
fun Attractions(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(color = Color.White))
    {
        Image(
            painter = painterResource(id = R.drawable.ta),
            contentDescription = "attractions icon",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .padding(start = 8.dp, end = 8.dp, top = 8.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Button(onClick = { navController.navigate(route = AppScreens.SecondScreen.route)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White))
        {
            MyText(text = "Attractions")}
    }
}



@Composable
fun Accommodation(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(color = Color.White))
    {
        Image(
            painter = painterResource(id = R.drawable.acc),
            contentDescription = "attractions icon", contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .padding(start = 8.dp, end = 8.dp, top = 8.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Button(onClick = {navController.navigate(route = AppScreens.ThirdScreen.route)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White))
        {
            MyText(text = "Accommodation")}
    }
}

@Composable
fun Restaurants(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(color = Color.White)) {
        Image(
            painter = painterResource(id = R.drawable.ea1),
            contentDescription = "attractions icon", contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .padding(start = 8.dp, end = 8.dp, top = 8.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Button(onClick = {navController.navigate(route = AppScreens.FourthScreen.route)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White))
        {
            MyText(text = "Restaurants")}
    }
}



@Composable
fun MyText(text:String){
    Text(text, color = Color.Black,
        style = TextStyle(
            fontSize = 24.sp), modifier = Modifier.padding(bottom = 8.dp))
}

