package com.example.gettingstartedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView = findViewById(R.id.card_view_card);
        cardView.setOnClickListener(view -> {
            Intent cardActivityIntent = new Intent(MainActivity.this, CardActivity.class);
            startActivity(cardActivityIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailIntent.setData(Uri.parse("mailto:egork@digitalchemy.us"));
                startActivity(launchEmailIntent);
            }
        });
    }
}