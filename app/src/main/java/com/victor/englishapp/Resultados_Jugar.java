package com.victor.englishapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Resultados_Jugar extends AppCompatActivity {

    Button volverInicio, verPuntuacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resultados_jugar);


        volverInicio = findViewById(R.id.btnlVolverInicio);
        verPuntuacion = findViewById(R.id.btnVerPuntuacion);

        verPuntuacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder modal = new AlertDialog.Builder(Resultados_Jugar.this);

                modal.setTitle("Puntuacion Final");
                modal.setMessage("" + Jugar.puntos);

                modal.setNegativeButton("Cerrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                modal.show();

            }
        });

        volverInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Jugar.puntos = 0;

                Intent inicio = new Intent(Resultados_Jugar.this, MainActivity.class);
                startActivity(inicio);
            }
        });

    }
}