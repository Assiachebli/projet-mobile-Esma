package com.example.livraisonrepas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun register(view: View) {

        startActivity(new Intent(WelcomeActivity.this,RegistrationActivitY.class));
    }
}