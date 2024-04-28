package assignment2.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getstartedButton = findViewById<Button>(R.id.getstarted)
        getstartedButton.setOnClickListener {
            val intent = Intent(this, Dog::class.java)
            startActivity(intent)

        }
    }
}