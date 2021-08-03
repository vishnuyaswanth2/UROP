package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.covid_19.ui.login.LoginActivity;

public class page2 extends AppCompatActivity {
    Button home_button, donor_button, plasma_receiver_button, logout_button;
    ImageButton back_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        home_button = findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        donor_button = findViewById(R.id.donor_button);
        donor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1  = new Intent(page2.this, donar_page.class);
                startActivity(intent1);
            }
        });

        plasma_receiver_button = findViewById(R.id.plasma_receiver_button);
        plasma_receiver_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(page2.this, plasma_page.class);
                startActivity(intent2);
            }
        });

        logout_button = findViewById(R.id.logout_button);
        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(page2.this, LoginActivity.class);
                startActivity(intent3);
            }
        });


        back_button1 = findViewById(R.id.back_button1);
        back_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(page2.this, LoginActivity.class);
                startActivity(intent4);
            }
        });

        }

}