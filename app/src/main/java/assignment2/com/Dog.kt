package assignment2.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Dog : AppCompatActivity() {
    // Declaring variables for pet statuses
    private var hunger = 0
    private var cleanliness = 100
    private var play = 100

    // Declaring Views
    private lateinit var imageView : ImageView
    private lateinit var feedButton : Button
    private lateinit var cleanButton : Button
    private lateinit var playButton : Button
    private lateinit var textHunger : TextView
    private lateinit var textClean : TextView
    private lateinit var textHappy : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog)


        // Initializing views
        imageView = findViewById(R.id.imageView)
        feedButton = findViewById(R.id.Feed)
        cleanButton = findViewById(R.id.Button2)
        playButton = findViewById(R.id.Play)
        textHunger = findViewById(R.id.rhungerTextView)
        textClean = findViewById(R.id.rcleanTextView)
        textHappy = findViewById(R.id.rhappyTextView)

        // Initializing initial status values
        play = 0
        hunger = 100
        cleanliness = 0


        // Update status windows
        updateStatus()


        // Button click Listeners
        feedButton.setOnClickListener {
            // Update hunger status
            imageView.setImageResource(R.drawable.dogfeeding)
            hunger -= 20
            if (hunger < 0) hunger = 0
            updateStatus()
            // Show toast message
            showToast("Hunger decreased by 20%")
        }

        cleanButton.setOnClickListener {
            // Update cleanliness status
            imageView.setImageResource(R.drawable.dogcleaning)
            cleanliness = 100
            updateStatus()
            // Show roast message
            showToast("Cleanliness is now 100%")
        }

        playButton.setOnClickListener {
            // Update play status
            imageView.setImageResource(R.drawable.dogplaying)
            play += 10
            if (play > 100) play = 100
            updateStatus()
            // Show toast message
            showToast("Happiness increased by 10%")
        }
    }


    // Update status views
    private fun updateStatus() {
        textHunger.text = "$hunger%"
        textClean.text = "$cleanliness%"
        textHappy.text = "$play%"
    }


    // Show toast message
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}