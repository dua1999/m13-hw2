package com.example.m13hw2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.m13hw2.ui.theme.M13Hw2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            M13Hw2Theme {
                // A Column layout with the Image at the top
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black) // Set the background color to red
                        .padding(0.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally


                ) {
                    ImageShow()
                }
            }
        }
    }
}

@Composable
fun ImageShow() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.city),
            contentDescription = "City",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_location_on_24),
                contentDescription = "Location",
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = "Barcelona, Spain",
                color = Color.White,
                modifier = Modifier.padding(start = 8.dp)
            )
        }


    }

    Box(
        modifier = Modifier.fillMaxWidth()

    ) {
        Row(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
                .padding(start = 10.dp) // Adjust the start padding to position the profile image on the left
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile",
                modifier = Modifier.size(50.dp)
            )

            Text(
                text = "Marry Loo",
                color = Color.White,
                style = TextStyle.Default.copy(fontSize = 20.sp),
                modifier = Modifier.padding(start = 15.dp).padding(vertical = 10.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.baseline_download_24),
                contentDescription = "Download",
                modifier = Modifier
                    .size(40.dp)
                    .padding(horizontal = 2.dp)
                    .padding(vertical = 5.dp)
                )

            Image(
                painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                contentDescription = "Heart",
                modifier = Modifier
                    .size(40.dp)
                    .padding(horizontal = 2.dp)
                    .padding(vertical = 5.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.baseline_bookmark_border_24),
                contentDescription = "Bookmark",
                modifier = Modifier
                    .size(40.dp)
                    .padding(horizontal = 2.dp)
                    .padding(vertical = 5.dp)
            )
        }
        Divider(
            color = Color.DarkGray,
            thickness = .3.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .align(Alignment.BottomCenter)
                .padding(horizontal = 16.dp)
        )
    }

    Box(
        modifier = Modifier.fillMaxWidth()
    ) {

    Row() {

    Column(
        modifier = Modifier

            .padding(16.dp)
    ) {
        Text(
            text = "Camera",
            color = Color.White,
            style = TextStyle.Default.copy(fontSize = 20.sp),
            modifier = Modifier
                .padding(1.dp)
        )

        Text(
            text = "NIKON D3200",
            color = Color.Gray,
            style = TextStyle.Default.copy(fontSize = 15.sp),
            modifier = Modifier.padding(1.dp)

        )
    }

    Column(
        modifier = Modifier
            .padding(start = 83.dp)
            .padding(16.dp),
    ) {
        Text(
            text = "Aperture",
            color = Color.White,
            style = TextStyle.Default.copy(fontSize = 20.sp),
            modifier = Modifier
                .padding(1.dp)
        )

        Text(
            text = "1/5.0",
            color = Color.Gray,
            style = TextStyle.Default.copy(fontSize = 15.sp),
            modifier = Modifier.padding(1.dp)

        )
    }
    }
    }

    Box(
        modifier = Modifier.fillMaxWidth()
    ) {

        Row() {

            Column(
                modifier = Modifier

                    .padding(16.dp)
            ) {
                Text(
                    text = "Focal Length",
                    color = Color.White,
                    style = TextStyle.Default.copy(fontSize = 20.sp),
                    modifier = Modifier
                        .padding(1.dp)
                )

                Text(
                    text = "18.0mm",
                    color = Color.Gray,
                    style = TextStyle.Default.copy(fontSize = 15.sp),
                    modifier = Modifier.padding(1.dp)

                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 60.dp)
                    .padding(16.dp),
            ) {
                Text(
                    text = "Shutter Speed",
                    color = Color.White,
                    style = TextStyle.Default.copy(fontSize = 20.sp),
                    modifier = Modifier
                        .padding(1.dp)
                )

                Text(
                    text = "1/125s",
                    color = Color.Gray,
                    style = TextStyle.Default.copy(fontSize = 15.sp),
                    modifier = Modifier.padding(1.dp)

                )
            }
        }
    }

    Box(
        modifier = Modifier.fillMaxWidth()
    ) {

        Row() {

            Column(
                modifier = Modifier

                    .padding(16.dp)
            ) {
                Text(
                    text = "ISO",
                    color = Color.White,
                    style = TextStyle.Default.copy(fontSize = 20.sp),
                    modifier = Modifier
                        .padding(1.dp)
                )

                Text(
                    text = "100",
                    color = Color.Gray,
                    style = TextStyle.Default.copy(fontSize = 15.sp),
                    modifier = Modifier.padding(1.dp)

                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 145.dp)
                    .padding(16.dp),
            ) {
                Text(
                    text = "Dimensions",
                    color = Color.White,
                    style = TextStyle.Default.copy(fontSize = 20.sp),
                    modifier = Modifier
                        .padding(1.dp)
                )

                Text(
                    text = "3906 x 4882",
                    color = Color.Gray,
                    style = TextStyle.Default.copy(fontSize = 15.sp),
                    modifier = Modifier.padding(1.dp)

                )
            }
        }
        Divider(
            color = Color.DarkGray,
            thickness = .3.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .align(Alignment.BottomCenter)
                .padding(horizontal = 16.dp)
        )
    }



    Box(
        modifier = Modifier.fillMaxWidth()

    ) {
        Row (
            modifier  = Modifier.padding(10.dp)
                ){
            Column(
                modifier = Modifier.padding(start = 60.dp),
            ) {
                Text(
                    text = "Views",
                    color = Color.White,
                    style = TextStyle.Default.copy(fontSize = 20.sp),
                    modifier = Modifier.padding(1.dp)

                )

                Text(
                    text = "8.8M",
                    color = Color.Gray,
                    style = TextStyle.Default.copy(fontSize = 15.sp, textAlign = TextAlign.Center),
                    modifier = Modifier.padding(1.dp)

                )
            }

            Column(
                modifier = Modifier.padding(start = 20.dp),
            ) {
                Text(
                    text = "Downloads",
                    color = Color.White,
                    style = TextStyle.Default.copy(fontSize = 20.sp),
                    modifier = Modifier.padding(1.dp)

                )

                Text(
                    text = "99.1K",
                    color = Color.Gray,
                    style = TextStyle.Default.copy(fontSize = 15.sp,textAlign = TextAlign.Center),
                    modifier = Modifier.padding(1.dp)

                )
            }

            Column(
                modifier = Modifier.padding(start = 20.dp),
            ) {
                Text(
                    text = "Likes",
                    color = Color.White,
                    style = TextStyle.Default.copy(fontSize = 20.sp),
                    modifier = Modifier.padding(1.dp)

                )

                Text(
                    text = "1.8K",
                    color = Color.Gray,
                    style = TextStyle.Default.copy(fontSize = 15.sp, textAlign = TextAlign.Center),
                    modifier = Modifier
                        .padding(1.dp)


                    )
            }
        }
        Divider(
            color = Color.DarkGray,
            thickness = .3.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .align(Alignment.BottomCenter)
                .padding(horizontal = 16.dp)
        )

        Divider(
            color = Color.DarkGray,
            thickness = .3.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .align(Alignment.BottomCenter)
                .padding(horizontal = 16.dp)
        )
    }


    Box(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.align(Alignment.BottomStart)

                .padding(15.dp)
        ) {
            Text(
                text = "Barcelona",
                color = Color.White,
                modifier = Modifier
                    .background(Color.DarkGray, RoundedCornerShape(50.dp))
                    .padding(10.dp)
            )
            
            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "Spain",
                color = Color.White,
                modifier = Modifier
                    .background(Color.DarkGray, RoundedCornerShape(50.dp))
                    .padding(10.dp)



            )


        }

    }
}


@Composable
fun Profile(){

}

@Preview(showBackground = true, widthDp = 190, heightDp = 800, )
@Composable
fun GreetingPreview() {
    M13Hw2Theme {
        ImageShow()
    }
}
