package com.victor.englishapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuJuegoOAprender extends AppCompatActivity {

    Button btnAprender;
    Button btnJugar;

    TextView tvApodoJugador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_juego_oaprender);
        btnAprender = findViewById(R.id.btnAprender);
        btnJugar = findViewById(R.id.btnJugar);
        tvApodoJugador = findViewById(R.id.tvApodoUsuario);

        tvApodoJugador.setText("¡Bienvenido " + SeleccionApodo.apodoSeleccionado + "!");

        btnAprender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAAprender = new Intent( MenuJuegoOAprender.this, MenuApp.class);

                startActivity(irAAprender);
            }
        });

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAJugar = new Intent( MenuJuegoOAprender.this, Jugar.class);

                startActivity(irAJugar);
            }
        });




    }
}