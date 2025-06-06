package com.victor.englishapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeleccionApodo extends AppCompatActivity {
    public static String apodoSeleccionado;

    EditText apodoJugadorEntrada;
    ListView lvListaApodos;
    Bundle extra;
    Button btnSiguiente4;
    ArrayAdapter lsNombresAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_seleccion_apodo);

        lvListaApodos = findViewById(R.id.lvLitaApodos);
        btnSiguiente4 = findViewById(R.id.btnSiguiente4);
        apodoJugadorEntrada = findViewById(R.id.entradaApoyo);
        extra = getIntent().getExtras();
        String nombreUsuario = extra.getString("nombre");
        String[] posiblesNombres = {nombreUsuario + "pro", nombreUsuario + "theBest", nombreUsuario + "Young"};

        lsNombresAdaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, posiblesNombres);
        lvListaApodos.setAdapter(lsNombresAdaptador);
        lvListaApodos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                apodoSeleccionado = posiblesNombres[position];
                Intent irSiguiente = new Intent(SeleccionApodo.this, MenuJuegoOAprender.class);
                startActivity(irSiguiente);
            }
        });


        btnSiguiente4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apodoSeleccionado = apodoJugadorEntrada.getText().toString();
                Intent irSiguiente = new Intent(SeleccionApodo.this, MenuJuegoOAprender.class);
                startActivity(irSiguiente);
            }
        });

    }
}