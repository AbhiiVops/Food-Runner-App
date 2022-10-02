package com.internshala.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MessageActivity : AppCompatActivity() {


    var Message : String? = "Enter message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)


        Message = intent.getStringExtra("Email")
        val messageTextView : TextView = findViewById(R.id.txtNewEmail)
        messageTextView.text = Message

    }
}