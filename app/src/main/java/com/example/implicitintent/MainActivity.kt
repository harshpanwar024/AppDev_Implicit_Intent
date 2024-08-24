package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.cardview.widget.CardView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.implicitintent.ui.theme.ImplicitIntentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webButton=findViewById<CardView>(R.id.cardweb)
        val camButton=findViewById<CardView>(R.id.cardcam)

        webButton.setOnClickListener()
        {
          val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://leetcode.com/u/harshpanwar024/")
            startActivity(intent)
        }

        camButton.setOnClickListener()
        {
          val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

    }
}
