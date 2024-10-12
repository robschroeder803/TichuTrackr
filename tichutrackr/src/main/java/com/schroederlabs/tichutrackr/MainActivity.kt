package com.schroederlabs.tichutrackr

import android.os.Bundle
import android.widget.FrameLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.ads.AdSize
import com.schroederlabs.tichutrackr.ui.theme.TichuTrackrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Banner ads
        val adsFrameLayout = findViewById<FrameLayout>(R.id.adsFrameLayout)
        //AdSize.BANNER
        //loadBannerAds(this, adsFrameLayout, AdSize.BANNER, R.string.banner_ads1)

        //AdSize.LARGER_BANNER
        //loadBannerAds(this, adsFrameLayout, AdSize.LARGE_BANNER, R.string.banner_ads1)

        //AdSize.FULL_BANNER
        loadBannerAds(this, adsFrameLayout, AdSize.FULL_BANNER, R.string.banner_ads1)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TichuTrackrTheme {
        Greeting("Android")
    }
}