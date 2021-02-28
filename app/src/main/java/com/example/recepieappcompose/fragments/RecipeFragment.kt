package com.example.recepieappcompose.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment

class RecipeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply { 
            setContent {
                Column(
                    modifier = Modifier
                        .background(
                            color = Color(0xFFF2F2F2)
                        )
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(
                        text = "RECIPE",
                        style = TextStyle(
                            fontSize = 21.sp,
                        ),
                    )
                    /*val myImg = ImageBitmap.imageResource(resources, id = R.drawable.hamburger)
                    Image(
                        bitmap = myImg,
                        contentDescription = "Burger image",
                        modifier = Modifier
                            .height(240.dp)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Crop
                    )*/
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Row (
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            SetText(text = "Happy Meal", 26f, false)
                            SetText(text = "$5.99", 26f, true)
                        }
                        Spacer10dip()
                        SetText(text = "800 Calories", 17f, false)
                        Spacer10dip()
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Button(
                                onClick = { /*TODO*/ },
                            ) {
                                Text(
                                    text = "ORDER NOW"
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun SetText(text: String, textSize: Float, isPrice: Boolean) {
        return if (isPrice) {
            Text(
                text = text,
                style = TextStyle(
                    fontSize = textSize.sp,
                    color = Color(0xFF85bb65),
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier
                    .wrapContentHeight(
                        align = Alignment.CenterVertically
                    )
            )
        } else {
            Text(
                text = text,
                style = TextStyle(
                    fontSize = textSize.sp,
                    textAlign = TextAlign.Start
                )
            )
        }
    }

    @Composable
    fun Spacer10dip() {
        return Spacer(
            modifier = Modifier
                .padding(top = 10.dp)
        )
    }
}