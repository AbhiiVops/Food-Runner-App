package com.internshala.foodrunner

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CheckMailActivity : AppCompatActivity() {

    lateinit var imgGmail : ImageView
    lateinit var txtCheckMail : TextView
    lateinit var txtPasswordResetInstructions :TextView
    lateinit var btnOpenEmailApp :TextView
    lateinit var txtSkip : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_mail)


        imgGmail = findViewById(R.id.imgGmail)
        txtCheckMail = findViewById(R.id.txtCheckMail)
        txtPasswordResetInstructions = findViewById(R.id.txtPasswordResetInstructions)
        btnOpenEmailApp = findViewById(R.id.btnOpenEmailApp)
        txtSkip = findViewById(R.id.txtSkip)



    }
}