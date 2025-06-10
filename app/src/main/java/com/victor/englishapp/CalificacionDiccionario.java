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

public class CalificacionDiccionario extends AppCompatActivity {
    Button btnEncuestaAInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificacion_diccionario);

        btnEncuestaAInicio = findViewById(R.id.btnDiccionarioAInicio);

        btnEncuestaAInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAInicio = new Intent(CalificacionDiccionario.this, MenuJuegoOAprender.class);
                startActivity(irAInicio);
            }
        });

    }
}