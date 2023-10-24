package com.example.gettingstartedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


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
    }
}