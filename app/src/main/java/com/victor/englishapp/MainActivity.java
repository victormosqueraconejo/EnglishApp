package com.victor.englishapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button btnSiguiente;
    ImageView ivFacebookLogo, ivInstagramLogo, ivRedditLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivFacebookLogo = findViewById(R.id.ivFacebookLogo);
        ivInstagramLogo = findViewById(R.id.ivInstagramLogo);
        ivRedditLogo = findViewById(R.id.ivRedditLogo);
        btnSiguiente = findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAMenu = new Intent(MainActivity.this, DatosJugador.class);
                startActivity(irAMenu);

            }
        });
        ivFacebookLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irEnlace = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/"));
                startActivity(irEnlace);

            }
        });

        ivInstagramLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irEnlace = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/"));
                startActivity(irEnlace);

            }
        });

        ivInstagramLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irEnlace = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/"));
                startActivity(irEnlace);

            }
        });


    }
}