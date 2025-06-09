package com.victor.englishapp;

import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pregunta_4 extends AppCompatActivity {
    ImageView imgBlue;
    ImageView imgYellow;
    ImageView imgCarrot;
    ImageView imgRed;
    TextView puntuacionActual;
    MediaPlayer sonidoBien;
    MediaPlayer sonidoMal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pregunta4);

        sonidoMal = MediaPlayer.create(Pregunta_4.this, R.raw.mal);
        sonidoBien = MediaPlayer.create(Pregunta_4.this, R.raw.bien);

        imgBlue = findViewById(R.id.imgBlue4);
        imgYellow = findViewById(R.id.imgYellow4);
        imgRed = findViewById(R.id.imgRed4);
        imgCarrot = findViewById(R.id.imgCarrot5);
        puntuacionActual = findViewById(R.id.tvPuntuacionActual4);
        puntuacionActual.setText("Puntuacion Actual: " + Jugar.puntos);
        Intent siguietePregunta = new Intent(Pregunta_4.this, Pregunta_5.class);


        imgBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoBien.start();
                Jugar.arrayPreguntas[3] = "1";
                Jugar.puntos += 20;
                startActivity(siguietePregunta);
            }
        });

        imgCarrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                Jugar.puntos -= 10;
                startActivity(siguietePregunta);

            }
        });

        imgRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                Jugar.puntos -= 10;
                startActivity(siguietePregunta);

            }
        });
        imgYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                Jugar.puntos -= 10;
                startActivity(siguietePregunta);
            }
        });



    }
}