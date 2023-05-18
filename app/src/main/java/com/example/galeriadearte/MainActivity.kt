package com.example.galeriadearte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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


    Image(painter = painterResource(id = R.drawable.vangogh1 ),
        contentDescription = )

    Text(
        text = "Previous",
        modifier = Modifier,
        fontSize = 40.sp,
        fontWeight = FontWeight.Light
    )

    Text(
        text = "Next",
        modifier = Modifier,
        fontSize = 40.sp,
        fontWeight = FontWeight.Light

    )

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .size(30.dp)
            )


    }
