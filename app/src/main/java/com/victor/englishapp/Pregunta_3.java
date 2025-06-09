package com.victor.englishapp;

import android.content.Intent;
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

public class Pregunta_3 extends AppCompatActivity {

    ImageView ImgCoconut;
    ImageView ImgMonkey;
    ImageView ImgCarrot;
    ImageView ImgYellow;
    TextView puntuacionActual;
    MediaPlayer sonidoBien;
    MediaPlayer sonidoMal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);

        ImgCoconut = findViewById(R.id.imgCoconut3);
        ImgYellow = findViewById(R.id.imgYellow3);
        ImgCarrot = findViewById(R.id.imgCarrot4);
        ImgMonkey = findViewById(R.id.imgMonkey3);
        puntuacionActual = findViewById(R.id.tvPuntuacionActual3);
        puntuacionActual.setText("Puntuacion Actual: " + Jugar.puntos);

        sonidoBien = MediaPlayer.create(Pregunta_3.this, R.raw.bien);
        sonidoMal = MediaPlayer.create(Pregunta_3.this, R.raw.mal);

        Intent siguietePregunta = new Intent(Pregunta_3.this, Pregunta_4.class);



        ImgCarrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sonidoBien.start();
                Jugar.arrayPreguntas[2] = "1";
                Jugar.puntos += 20;
                startActivity(siguietePregunta);

            }
        });
        ImgYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sonidoMal.start();
                Jugar.puntos -= 10;
                startActivity(siguietePregunta);

            }

        });
        ImgCoconut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                Jugar.puntos -= 10;
                startActivity(siguietePregunta);

            }
        });
        ImgMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                Jugar.puntos -= 10;
                startActivity(siguietePregunta);

            }
        });




    }
}