package com.example.lemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.lemon.data.Datasource
import com.example.lemon.model.NatureAffirmation
import com.example.lemon.ui.theme.LemonTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonTheme {
            affirApp()
            }
        }
    }
}




@Composable
private fun affirApp(){

    val d = Datasource().load()
    NatureList(NatureAffirList = d)
}


@Composable
private fun NatureList(NatureAffirList: List<NatureAffirmation>, modifier: Modifier = Modifier) {

    LemonTheme() {
        LazyColumn() {
            items(NatureAffirList) {
                nature -> affirLoad(affirmation = nature)
            }
        }
    }

}


@Composable
fun affirLoad(affirmation: NatureAffirmation ,modifier: Modifier = Modifier) {

    val remove = Datasource().load()

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
            elevation = 3.dp
    ) {
        Column (){
            Image(painter = painterResource(affirmation.imageRes), contentDescription = null)
            Text(text = stringResource(id = affirmation.stringRes), modifier = modifier.padding(18.dp), textAlign = TextAlign.Center)
            Button(onClick = {}) {
                Text(text = "Delete")
            }
        }
    }

}

