package com.victor.englishapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DatosJugador extends AppCompatActivity {
    EditText entradaNombre, entradaApellido, entradaEdad;
    Button btnSiguiente3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_jugador);

        entradaNombre = findViewById(R.id.etEntradaNombre);
        entradaApellido = findViewById(R.id.etEntradaApellido);
        entradaEdad = findViewById(R.id.etEntradaEdad);

        btnSiguiente3 = findViewById(R.id.btnSiguiente3);

        btnSiguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irSiguiente = new Intent(DatosJugador.this, SeleccionApodo.class);
                irSiguiente.putExtra("nombre", entradaNombre.getText().toString());
                startActivity(irSiguiente);
            }
        });
    }
}