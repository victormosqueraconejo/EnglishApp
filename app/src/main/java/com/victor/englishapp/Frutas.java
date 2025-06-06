package com.victor.englishapp;

import android.media.MediaParser;
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

public class Frutas extends AppCompatActivity {
    Button btnCarrot;
    Button btnCoco;
    Button btnLechuga;
    ImageView imgCarrot;
    MediaPlayer sonidoZanahoria;
    MediaPlayer sonidoCoco;
    MediaPlayer sonidoLechuga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_frutas);

        btnCarrot = findViewById(R.id.btnZanahoria);
        btnLechuga = findViewById(R.id.btnLechuga);
        btnCoco = findViewById(R.id.btnCoco);

        btnCarrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoZanahoria = MediaPlayer.create(Frutas.this, R.raw.carrot);
                sonidoZanahoria.start();
            }
        });

        btnCoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoCoco = MediaPlayer.create(Frutas.this, R.raw.coconut);
                sonidoCoco.start();
            }
        });

        btnLechuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoLechuga = MediaPlayer.create(Frutas.this, R.raw.repollo);
                sonidoLechuga.start();
            }
        });


    }
}