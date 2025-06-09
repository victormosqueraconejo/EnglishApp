package com.victor.englishapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animales extends AppCompatActivity {
    Button btnElephant;
    Button btnMonkey;
    Button btnDonkey;

    MediaPlayer soundElephant;
    MediaPlayer soundMonkey;
    MediaPlayer soundDonkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_animales);

        btnElephant = findViewById(R.id.btnElefante);
        btnDonkey = findViewById(R.id.btnBurro);
        btnMonkey = findViewById(R.id.btnMono);

        btnElephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundElephant = MediaPlayer.create(Animales.this, R.raw.elephant);
                soundElephant.start();
            }
        });

        btnDonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundDonkey = MediaPlayer.create(Animales.this, R.raw.donkey);
                soundDonkey.start();
            }
        });

        btnMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMonkey = MediaPlayer.create(Animales.this, R.raw.monkey);
                soundMonkey.start();

            }
        });


    }
}