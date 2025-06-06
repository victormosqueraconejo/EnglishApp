package com.victor.englishapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pregunta_2 extends AppCompatActivity {
    TextView puntuacionActual;
    ImageView ImgRed2;
    ImageView ImgZanahoria3;
    ImageView ImgBlue2;
    ImageView ImgYellow2;

    MediaPlayer sonidoRed2;
    MediaPlayer sonidoZanahoria3;
    MediaPlayer sonidoBlue2;
    MediaPlayer sonidoYellow2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pregunta2);

        ImgBlue2 = findViewById(R.id.imgBlue2);
        ImgYellow2 = findViewById(R.id.imgYellow2);
        ImgZanahoria3 = findViewById(R.id.imgCarrot3);
        ImgRed2 = findViewById(R.id.imgRed2);
        puntuacionActual = findViewById(R.id.tvPuntuacionActual2);
        puntuacionActual.setText("Puntuacion Actual: " + Jugar.puntos);

        ImgYellow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoYellow2 = MediaPlayer.create(Pregunta_2.this, R.raw.mal);
                sonidoYellow2.start();
                Jugar.puntos -= 10;

            }
        });

        ImgZanahoria3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoZanahoria3 = MediaPlayer.create(Pregunta_2.this, R.raw.mal);
                sonidoZanahoria3.start();
                Jugar.puntos -= 10;

            }
        });
        ImgBlue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoBlue2 = MediaPlayer.create(Pregunta_2.this, R.raw.mal);
                sonidoBlue2.start();
                Jugar.puntos -= 10;
            }
        });
        ImgRed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoRed2 = MediaPlayer.create(Pregunta_2.this, R.raw.bien);
                sonidoRed2.start();

                Intent siguietePregunta = new Intent(Pregunta_2.this, Pregunta_3.class);
                startActivity(siguietePregunta);
                Jugar.puntos += 20;
            }
        });




    }
}