package com.ash.ashhub
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val tv = TextView(this).apply {
      text = "AshHub Offline Git Client"
      textSize = 22f
      setPadding(32, 64, 32, 32)
    }
    val ll = LinearLayout(this).apply {
      orientation = LinearLayout.VERTICAL
      addView(tv)
    }
    setContentView(ll)
  }
}
