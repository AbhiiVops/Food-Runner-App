package com.internshala.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class ResetPassword : AppCompatActivity() {

    lateinit var btnSendInstructions : Button
    lateinit var txtResetPassword : TextView
    lateinit var txtInstructions : TextView
    lateinit var txtEmailAddress : TextView
    lateinit var etEnterEmail : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)


        btnSendInstructions = findViewById(R.id.btnSendInstructions)
        txtResetPassword = findViewById(R.id.txtResetPassword)
        txtInstructions = findViewById(R.id.txtInstructions)
        txtEmailAddress = findViewById(R.id.txtEmailAddress)
        etEnterEmail = findViewById(R.id.etEnterEmail)

        btnSendInstructions.setOnClickListener {

            val email = etEnterEmail.text.toString()
            val intent = Intent(this@ResetPassword , MessageActivity::class.java)
            intent.putExtra("Email",email)
            startActivity(intent)
        }

        title = "Instructions"
    }
}