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

    TextView puntuacionActual;
    ImageView imgCoco2;
    ImageView imgLechuga2;
    ImageView imgElefante2;
    ImageView imgZanahoria2;

    MediaPlayer sonidoLechuga2;
    MediaPlayer sonidoCoco2;
    MediaPlayer sonidoElefante2;
    MediaPlayer sonidoZanahoria2;
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

        imgCoco2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoCoco2 = MediaPlayer.create(Jugar.this, R.raw.bien);
                sonidoCoco2.start();

                Intent siguietePregunta = new Intent(Jugar.this, Pregunta_2.class);
                startActivity(siguietePregunta);
                puntos += 20;

            }
        });

        imgLechuga2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoLechuga2 = MediaPlayer.create(Jugar.this, R.raw.mal);
                sonidoLechuga2.start();
                puntos -= 10;
            }
        });

        imgElefante2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoElefante2 = MediaPlayer.create(Jugar.this, R.raw.mal);
                sonidoElefante2.start();
                puntos -= 10;
            }
        });

        imgZanahoria2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoZanahoria2 = MediaPlayer.create(Jugar.this, R.raw.mal);
                sonidoZanahoria2.start();
                puntos -= 10;
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