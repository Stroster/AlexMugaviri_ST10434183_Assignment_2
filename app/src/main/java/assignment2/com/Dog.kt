package assignment2.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Dog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog)

        ImageView = findViewById<ImageView>(R.id.imageView)
        feed = findViewById<Button>(R.id.Feed)
        clean = findViewById<Button>(R.id.Button2)
        play = findViewById<Button>(R.id.Play)

    }
}