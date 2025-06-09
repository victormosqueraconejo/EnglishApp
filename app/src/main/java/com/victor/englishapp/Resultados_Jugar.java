package com.victor.englishapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class Resultados_Jugar extends AppCompatActivity {

    Button volverInicio, verPuntuacion, verPreguntas;
    TextView txtMensajeFelicitacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resultados_jugar);


        volverInicio = findViewById(R.id.btnlVolverInicio);
        verPuntuacion = findViewById(R.id.btnVerPuntuacion);
        verPreguntas = findViewById(R.id.btnVerPreguntas);
        txtMensajeFelicitacion = findViewById(R.id.txtMensajeFelicitacion);

        txtMensajeFelicitacion.setText("!Felicitaciones por completar " + SeleccionApodo.apodoSeleccionado + "!!!");
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

        verPreguntas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder modal = new AlertDialog.Builder(Resultados_Jugar.this);

                for (int i = 0; i < Jugar.arrayPreguntas.length; i++) {
                    if (Objects.equals(Jugar.arrayPreguntas[i], "1")) {
                        Jugar.arrayPreguntas[i] = "La pregunta numero " + (i +1) + " es CORRECTA";
                    }
                    if (Objects.equals(Jugar.arrayPreguntas[i], "0")) {
                        Jugar.arrayPreguntas[i] = "La pregunta numero " + (i +1) + " es INCORRECTA";
                    }
                }

                modal.setTitle("Preguntas").setItems(Jugar.arrayPreguntas, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                modal.setNegativeButton("Cerrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                modal.show();

            }
        });

    }
}