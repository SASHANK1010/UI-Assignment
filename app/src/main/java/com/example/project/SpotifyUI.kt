package com.example.project

import android.health.connect.datatypes.HeightRecord
import android.media.SubtitleData
import android.os.Bundle
import android.provider.ContactsContract
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
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project.ui.theme.ProjectTheme

class SpotifyUI : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeScreen()

        }

    }
}

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Black)
            .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Recently Played",style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White))
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {


                Icon(
                    painter = painterResource(R.drawable.outline_notifications_24),
                    contentDescription = null,
                    tint = Color.White

                    )
                Icon(
                    painter = painterResource(R.drawable.outline_history_24),
                    contentDescription = null,
                    tint = Color.White
                )

                Icon(
                    painter = painterResource(R.drawable.baseline_settings_24),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
        Row(modifier = Modifier.fillMaxWidth().padding(vertical = 25.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp) ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(R.drawable.sajanraj),
                    contentDescription = null,
                    modifier = Modifier.clip(shape = CircleShape)
                        .height(100.dp).width(100.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Sajan Raj Vaidya", color = Color.White,
                    style = TextStyle(fontSize = 18.sp))
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround) {
                Image(painter = painterResource(R.drawable.elements),
                    contentDescription = null,
                    modifier = Modifier.clip(shape = CircleShape)
                        .height(100.dp).width(100.dp),
                    contentScale = ContentScale.Crop
                )
                Text("The elements", color = Color.White,
                    style = TextStyle(fontSize = 18.sp))

            }

        }
        Row(verticalAlignment = Alignment.CenterVertically) {

            Box(
                modifier = Modifier
                    .size(75.dp)
                    .background(Color(0xFFE8A87C)),
                contentAlignment = Alignment.Center){
                Text("2025", color = Color.Blue, fontWeight = FontWeight.ExtraBold, fontSize = 14.sp)

            }
            Spacer(Modifier.width(10.dp))
            Column() {
                Text("#SPOTIFYWRAPPED", color = Color.Gray, fontSize = 15.sp)
                Text("Your 2025 in review",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(modifier = Modifier.fillMaxWidth().padding(vertical = 15.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(R.drawable.spotify),
                    contentDescription = null,modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Your Top Songs 2025" , color = Color.White,
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(

                     painter = painterResource(R.drawable.artist),
                    contentDescription = null,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text("Your Artist Revealed", color = Color.White,
                    style = TextStyle
                (fontWeight = FontWeight.Bold),
                    fontSize = 15.sp)

            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Text("Editor's picks", color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 30.sp)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(14.dp)) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.editors),
                    contentDescription = null,
                    modifier = Modifier
                        .size(140.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Ed Shreeran,Big Sean \nJuice WRLD,Post Malone", color = Color.White,
                    fontSize = 15.sp,
                    lineHeight = 18.sp
                    )
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(R.drawable.qwerty),
                    contentDescription = null,
                    modifier = Modifier
                        .size(140.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Mitski,Tame Impala \nGlass Animals,Charlie XCX", color = Color.White,
                    fontSize = 15.sp,
                    lineHeight = 18.sp
                )
            }
        }




    }

}

@Preview
@Composable
fun HomePreview(){
    HomeScreen()
}
