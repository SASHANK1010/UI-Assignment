package com.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project.ui.theme.ProjectTheme
import java.nio.file.WatchEvent

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

        }
    }
}

@Composable
fun ProfileBody() {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_arrow_back_ios_24),
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
            Text("Sashank Shilpakar", style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                textDecoration = TextDecoration.Underline



            ))
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null
            )

        }
        Row(modifier = Modifier.fillMaxWidth(),
            Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                painter = painterResource(R.drawable.photo),
                contentDescription = null,
                modifier = Modifier.clip(shape = CircleShape)
                    .height(80.dp).width(80.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("123")
                Text("Posts")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("1M")
                Text("Followers")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("200")
                Text("Following")
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(20.dp)

        ) {
            Text("Sashank", style = TextStyle(
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                fontStyle = FontStyle.Italic



            ))
            Text(
                buildAnnotatedString {
                    append("Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ")
                    withStyle(style = SpanStyle(color = Color.Blue)) {
                        append("#hastag")
                    }

                }
            )
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Blue)) {
                        append("Link goes here")
                    }
                }
            )
            Text(
                buildAnnotatedString {
                    append("Followed by ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Aman Man Srestha ")

                    }
                    append("and ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Aadhar Rana with 2 others")
                    }
                }
            )
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(size = 0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                ),
                border= BorderStroke(
                    width = 2.dp,
                    color = Color.Black
                ),
                onClick = {}) {
                Text("Follow")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                ElevatedButton(
                    modifier = Modifier.weight(1f),

                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue
                    ),
                    onClick ={}) {
                    Text("Follow")
                }
                ElevatedButton(
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(size = 0.dp),
                    onClick = {}) {
                    Text("Message")
                }
                ElevatedButton(
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(size = 0.dp),
                    onClick = {}) {
                    Text("Email")
                }
                ElevatedButton(
                    modifier = Modifier.size(40.dp ),
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = PaddingValues(0.dp),
                    onClick = { }
                ) {
                    Icon(painter = painterResource(R.drawable.baseline_keyboard_arrow_down_24),
                        contentDescription = null,)

                }
            }

        }

        LazyRow(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
        ){
            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.image),
                        contentDescription = null,
                        modifier = Modifier.clip(shape = CircleShape)
                            .height(80.dp).width(80.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 1", style = TextStyle( fontSize = 15.sp))
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(R.drawable.image2),
                        contentDescription = null,
                        modifier = Modifier.clip(shape = CircleShape)
                            .height(80.dp).width(80.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 2", style = TextStyle(fontSize = 15.sp))
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter=painterResource(R.drawable.download),
                        contentDescription = null,
                        modifier = Modifier.clip(shape = CircleShape)
                            .height(80.dp).width(80.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 3", style = TextStyle(fontSize = 15.sp))

                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(R.drawable.image3),
                        contentDescription = null,
                        modifier = Modifier.clip(shape = CircleShape)
                            .height(80.dp).width(80.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 4", style = TextStyle(fontSize = 15.sp))

                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(R.drawable.image4),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 5", style = TextStyle(fontSize = 15.sp))
                }

            }

        }
    }

}

@Preview
@Composable
fun ProfilePreview(){
    ProfileBody()
}

