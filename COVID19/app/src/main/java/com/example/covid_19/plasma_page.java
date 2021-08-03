package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.covid_19.R.id.call_donor;

public class plasma_page extends AppCompatActivity {

    ImageButton call_donor, back_button3, call_donor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plasma_page);

        call_donor=findViewById(R.id.call_donor);
        call_donor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9849425679"));
                startActivity(intent6);

            }
        });

        back_button3 = findViewById(R.id.back_button3);
        back_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plasma_page.this, page2.class);
                startActivity(intent);
            }
        });

        call_donor1 = findViewById(R.id.call_donor1);
        call_donor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9876543210"));
                startActivity(intent1);
            }
        });

    }
}