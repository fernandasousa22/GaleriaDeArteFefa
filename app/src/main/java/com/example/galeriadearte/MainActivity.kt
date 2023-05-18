package com.example.galeriadearte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galeriadearte.ui.theme.GaleriaDeArteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaDeArteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppGaleriaDeArte()
                }
            }
        }
    }

    @Composable
    fun AppGaleriaDeArte() {
        var result = 1

        val imageResource = when (result) {

            1 -> R.drawable.vangogh1
            2 -> R.drawable.cachorro
            3 -> R.drawable.vangogh
            4 -> R.drawable.download
            5 -> R.drawable.vangog3
            else -> R.drawable.vangog3
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .size(30.dp)
        ) {
            
            
            Image(
                painter = painterResource(id = R.drawable.vangogh1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(450.dp)
            )

            Text(
                text = "Vicent Van Gogh",
                modifier = Modifier,
                fontSize = 30.sp,
                fontWeight = FontWeight.Black
            )

            Text(
                text = "Obras",
                modifier = Modifier,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
            Row() {
                Button(onClick = {},
                    modifier = Modifier
                        .padding(60.dp)
                ) {
                    Text(
                        text = "Previous")
                }
            Button(onClick = {},
                modifier = Modifier
                    .padding(60.dp)
            ) {
                Text(
                    text = "Next")
            }

            }
        }
    }
}
@Composable
fun MudarImagem (recursoTextoId : Int, recursoImagemId : Int, onImagemClick : ()->Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    )
    {
    }
}



