package com.victor.englishapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ColoresLayout extends AppCompatActivity {

    Button btnYellow;
    Button btnBlue, btnRegresar;
    Button btnRed;

    ImageView imgAzul;
    ImageView imgYellow;
    MediaPlayer suondYellow;
    MediaPlayer suondBlue;
    MediaPlayer suondRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_layout);

        imgYellow = findViewById(R.id.imgAmarillo);
        imgAzul = findViewById(R.id.imgAzul);

        btnYellow = findViewById(R.id.btnAmarillo);
        btnBlue = findViewById(R.id.btnAzul);
        btnRed = findViewById(R.id.btnRojo);
        btnRegresar = findViewById(R.id.btnColoresMenuApp);

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suondYellow = MediaPlayer.create(ColoresLayout.this, R.raw.yellow);
                suondYellow.start();

            }
        });

        imgYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suondYellow = MediaPlayer.create(ColoresLayout.this, R.raw.yellow);
                suondYellow.start();

            }
        });


        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suondBlue = MediaPlayer.create(ColoresLayout.this, R.raw.blue);
                suondBlue.start();

            }
        });

        imgAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suondBlue = MediaPlayer.create(ColoresLayout.this, R.raw.blue);
                suondBlue.start();

            }
        });


        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suondRed = MediaPlayer.create(ColoresLayout.this, R.raw.red);
                suondRed.start();

            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(ColoresLayout.this, MenuApp.class);
                startActivity(regresar);
            }
        });


    }
}