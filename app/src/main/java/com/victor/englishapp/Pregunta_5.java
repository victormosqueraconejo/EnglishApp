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

public class Pregunta_5 extends AppCompatActivity {
    TextView puntuacionActual;

    ImageView imgRepollo;
    ImageView imgElephan;
    ImageView imgDonkey;
    ImageView imgMonkey;

    MediaPlayer sonidoBien;
    MediaPlayer sonidoMal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pregunta5);


        sonidoMal = MediaPlayer.create(Pregunta_5.this, R.raw.mal);
        sonidoBien = MediaPlayer.create(Pregunta_5.this, R.raw.bien);
        imgRepollo = findViewById(R.id.imgLechuga5);
        imgDonkey = findViewById(R.id.imgDonkey5);
        imgElephan = findViewById(R.id.imgElefante5);
        imgMonkey = findViewById(R.id.imgMonkey5);
        puntuacionActual = findViewById(R.id.tvPuntuacionActual5);
        puntuacionActual.setText("Puntuacion Actual: " + Jugar.puntos);

        imgElephan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoBien.start();
                Intent siguietePregunta = new Intent(Pregunta_5.this, Resultados_Jugar.class);
                startActivity(siguietePregunta);
                Jugar.puntos += 20;
            }
        });

        imgDonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                Jugar.puntos -= 10;
            }
        });
        imgMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                Jugar.puntos -= 10;
            }
        });
        imgRepollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                Jugar.puntos -= 10;
            }
        });
    }
}