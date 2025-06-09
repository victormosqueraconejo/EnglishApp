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

public class Jugar extends AppCompatActivity {
    public static int puntos = 0;
    public static String[] arrayPreguntas = {"0", "0", "0", "0", "0"};

    TextView puntuacionActual;
    ImageView imgCoco2;
    ImageView imgLechuga2;
    ImageView imgElefante2;
    ImageView imgZanahoria2;

    MediaPlayer sonidoBien, sonidoMal;
    Button btnSiguienete;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jugar);

        imgCoco2 = findViewById(R.id.imgCoco2);
        imgLechuga2 = findViewById(R.id.imgLechuga2);
        imgElefante2 = findViewById(R.id.imgElefante2);
        imgZanahoria2 = findViewById(R.id.imgZanahoria2);
        btnSiguienete = findViewById(R.id.btnSiguiente2);
        puntuacionActual = findViewById(R.id.tvPuntuacionActual);
        puntuacionActual.setText("Puntuacion Actual: " + puntos);
        sonidoBien = MediaPlayer.create(Jugar.this, R.raw.bien);
        sonidoMal = MediaPlayer.create(Jugar.this, R.raw.mal);
        Intent irASiguiente2 = new Intent(Jugar.this, Pregunta_2.class);


        imgCoco2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonidoBien.start();

                startActivity(irASiguiente2);
                puntos += 20;
                arrayPreguntas[0] = "1";


            }
        });

        imgLechuga2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                puntos -= 10;
                startActivity(irASiguiente2);

            }
        });

        imgElefante2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                puntos -= 10;
                startActivity(irASiguiente2);

            }
        });

        imgZanahoria2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal.start();
                puntos -= 10;
                startActivity(irASiguiente2);

            }
        });

     btnSiguienete.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent irASiguiente2 = new Intent(Jugar.this, Pregunta_2.class);
             startActivity(irASiguiente2);

         }
     });


    }
}