package com.bbeniful.jetpackcomposetest

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bbeniful.jetpackcomposetest.ui.theme.Shapes

@ExperimentalComposeApi
@Composable
fun ListItems(list: ArrayList<String>,onLick: () -> Unit) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(all = 12.dp)
    ) {
        itemsIndexed(items = list) { index, item ->
            ItemView(data = item,onLick = onLick)
        }
    }
}


@Composable
fun ItemView(data: String, onLick: () -> Unit) {

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .fillMaxWidth()
            .background(Color.Red)
            .padding(all = 15.dp)
            .clickable(
                onClick = onLick
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Data->", color = Color.White)
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = data, fontSize = 35.sp, color = Color.Blue)
        }
    }


}

@ExperimentalMaterialApi
@Composable
fun ClickableView() {
    var expandedState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(targetValue = if (expandedState) 180f else 0f)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = Shapes.medium,
        onClick = {
            expandedState = !expandedState
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Title",
                    modifier = Modifier.weight(6f),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                IconButton(modifier = Modifier
                    .weight(1f)
                    .alpha(ContentAlpha.medium)
                    .rotate(rotationState), onClick = {
                    expandedState = !expandedState
                }
                ) {
                    Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "dropDown")
                }
            }
            if (expandedState) {
                Text(
                    text = "askdhajskfbhjksdafhbgjskdlghkljsdghjklfhsdgjklhfsdjlkghfjskdlghfjlskdghjklfdshgjklfshdgjklhfsdjlkghflskdjghfjskdhgjklfdshgjklfhsdgjklhfsdjklghfsdjklhgfskdlghfsd",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    maxLines = 5,
                    overflow = TextOverflow.Ellipsis
                )
            }


        }

    }
}


@ExperimentalMaterialApi
@ExperimentalComposeApi
@Preview(showBackground = true)
@Composable
fun ListViewPreview() {

    MaterialTheme {
        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
            val almafa = kotlin.arrayOf(
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f"
            )
            // ListItems(ArrayList(almafa.toList()))
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Blue)
            ) {
                ClickableView()
            }

        }

    }
}