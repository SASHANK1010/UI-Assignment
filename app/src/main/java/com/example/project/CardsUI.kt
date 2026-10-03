package com.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project.ui.theme.ProjectTheme

class CardsUI : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectTheme {
                CardUI()
            }
        }
    }
}

@Composable
fun CardUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2DBE8D)) // green background
            .padding(16.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Column {
                Text(
                    modifier = Modifier.padding(top = 20.dp),
                    text = "Card",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.size(5.dp))
                Text(
                    text = "Simple and Easy to use app",
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Image(
                painter = painterResource(R.drawable.photo),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .size(50.dp)
                    .clip(CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        CardGrid()

        Spacer(modifier = Modifier.height(12.dp))

        SettingsCard()
    }
}

@Composable
fun SettingsCard() {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,

        ) {
            Image(
                painter = painterResource(R.drawable.settings),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column() {


                Text(
                    text = "Settings",
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp
                )
            }
        }
    }
}

@Composable
fun CardGrid() {
    val items = listOf(
        "Text", "Address",
        "Character", "Bank card",
        "Password", "Logistics"
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(items.size) { index ->
            GridItem(title = items[index])
        }
    }
}

@Composable
fun GridItem(title: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val items = listOf(
                Pair("Text", R.drawable.book),
                Pair("Address", R.drawable.home),
                Pair("Character", R.drawable.person),
                Pair("Bank card", R.drawable.bankcard),
                Pair("Password", R.drawable.key),
                Pair("Logistics", R.drawable.bok)
            )
            val iconRes = items.firstOrNull { it.first == title }?.second ?: R.drawable.book

            // 🔹 Icon placeholder
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = title,
                fontWeight = FontWeight.Medium
            )

            Text(
                text = "5 items saved",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview
@Composable
fun CardPreview() {
    ProjectTheme {
        CardUI()
    }
}

@Preview
@Composable
fun GridItemPreview() {
    ProjectTheme {
        GridItem(title = "Text")
    }
}


