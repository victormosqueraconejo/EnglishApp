package com.victor.englishapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuApp extends AppCompatActivity {

    Button btnColores;
    Button btnAnimales;
    Button btnFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_app);

        btnColores = findViewById(R.id.btnColores);
        btnFrutas = findViewById(R.id.btnFrutas);
        btnAnimales = findViewById(R.id.btnAnimales);

        btnColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAColores = new Intent( MenuApp.this, ColoresLayout.class);

                startActivity(irAColores);
            }
        });

        btnFrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAFrutas = new Intent(MenuApp.this , Frutas.class);
                startActivity(irAFrutas);
            }
        });

        btnAnimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAAnimales = new Intent(MenuApp.this , Animales.class);
                startActivity(irAAnimales);
            }
        });

    }
}