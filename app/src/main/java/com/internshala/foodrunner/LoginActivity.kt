package com.internshala.foodrunner

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class LoginActivity : AppCompatActivity() {

     lateinit var txtSignUp : TextView
     lateinit var txtForgotPassword : TextView
     lateinit var etMobileNumber : EditText
     lateinit var imgLogoLogin : ImageView
     lateinit var etPassword : EditText
     lateinit var btnLogin : Button

     val validPassword = "Potal-2003"
     val validMobileNumber = "6260353880"

    lateinit var sharedPreferences: SharedPreferences  //1.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preferences_file_name), MODE_PRIVATE) //2.
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn",false)  // 4.


        setContentView(R.layout.activity_login)

        if(isLoggedIn) {     // 5.
            val intent = Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }


        txtSignUp = findViewById(R.id.txtSignUp)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        etMobileNumber = findViewById(R.id.etMobileNumber)
        imgLogoLogin = findViewById(R.id.imgLogoLogin)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        txtSignUp.setOnClickListener {

            val intent = Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(intent)

        }

        txtForgotPassword.setOnClickListener{
            val intent = Intent(this@LoginActivity,ResetPassword::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {            //6.

            val password = etPassword.text.toString()
            val mobileNumber = etMobileNumber.text.toString()


            if((password== validPassword) && (mobileNumber==validMobileNumber)) {
                val intent= Intent(this@LoginActivity,MainActivity::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this@LoginActivity,"Invalid Credentials",Toast.LENGTH_SHORT).show()
        }



    }


    override fun onPause() {
        super.onPause()
        finish()
    }

    fun savePreferences() {   //3.

        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
    }

}