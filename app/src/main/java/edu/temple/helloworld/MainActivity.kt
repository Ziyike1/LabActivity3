package edu.temple.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties
    private lateinit var displayTextView: TextView
    private lateinit var button: Button
    private lateinit var editName: EditText

    @SuppressLint("SetTextI18n", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        displayTextView = findViewById(R.id.displayTextView)
        button = findViewById(R.id.clickMeButton)
        editName = findViewById(R.id.nameEditText)

        button.setOnClickListener {
            val name = editName.text.toString().trim()
            if (name.isNotEmpty()) {
                displayTextView.text = "Hello, $name"
            } else {
                displayTextView.text = "Please enter your name"
            }
        }
    }
}
