package com.victor.englishapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Diccionario extends AppCompatActivity {

    Button btnCalificarDiccionario;
    Spinner spSeleccionIdioma;
    ListView lsListaPalabras1, lsListaPalabras2;

    ArrayAdapter lista1Adaptador, lista2Adaptador, idiomasAdaptador, lista3Adaptador, lista4Adaptador;
    String[] palabrasParaDiccionarioIngles = {
            "Hello",
            "Green",
            "Yellow",
            "Gray",
            "Goodbye",
            "Elephant",
            "Orange",
            "Lemon"
    };
    String[] palabrasParaDiccionarioEspanol = {
            "Hola",
            "Verde",
            "Amarillo",
            "Gris",
            "Adios",
            "Elefante",
            "Naranja",
            "Limon"
    };
    String[] palabrasParaDiccionarioChino = {
            " (nǐ hǎo)", // Hola
            " (lǜ sè)", // Verde
            " (huáng sè)", // Amarillo
            " (huī sè)", // Gris
            " (zài jiàn)", // Adios
            " (dà xiàng)", // Elefante
            " (jú zi)", // Naranja
            " (níng méng)" // Limon
    };
    String[] palabrasParaDiccionarioPortugues = {
            "Olá", // Hola
            "Verde", // Verde
            "Amarelo", // Amarillo
            "Cinza", // Gris
            "Tchau", // Adios
            "Elefante", // Elefante
            "Laranja", // Naranja
            "Limão" // Limon
    };

    String[] idiomasDisponibles = {
            "Ingles","Portugues", "Chino"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diccionario);

        btnCalificarDiccionario = findViewById(R.id.btnCalificarDiccionario);
        spSeleccionIdioma = findViewById(R.id.spSeleccionIdioma);
        lsListaPalabras1 = findViewById(R.id.lvListaPalabras1);
        lsListaPalabras2 = findViewById(R.id.lvListaPalabras2);

        lista1Adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, palabrasParaDiccionarioEspanol);
        lista2Adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, palabrasParaDiccionarioIngles);
        lista3Adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, palabrasParaDiccionarioPortugues);
        lista4Adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, palabrasParaDiccionarioChino);


        idiomasAdaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, idiomasDisponibles);

        spSeleccionIdioma.setAdapter(idiomasAdaptador);

        spSeleccionIdioma.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                lsListaPalabras1.setAdapter(lista1Adaptador);

                if (position == 0) {
                    lsListaPalabras2.setAdapter(lista2Adaptador);
                }
                if (position == 1) {
                    lsListaPalabras2.setAdapter(lista3Adaptador);
                }
                if (position == 2) {
                    lsListaPalabras2.setAdapter(lista4Adaptador);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnCalificarDiccionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irEncuesta = new Intent(Diccionario.this, CalificacionDiccionario.class);
                startActivity(irEncuesta);
            }
        });


    }
}