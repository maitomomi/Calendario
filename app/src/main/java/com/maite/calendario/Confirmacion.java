package com.maite.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmacion extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        TextView textview = findViewById(R.id.nombre);
        Intent intent = getIntent();
        textview.setText(intent.getStringExtra("nombre"));

        TextView nacimiento =findViewById(R.id.nacimiento);
        String fecha = intent.getIntExtra("nacimientodia",-1) + "/"+ intent.getIntExtra("nacimientomes",-1) +"/" + intent.getIntExtra("nacimientoano",-1);
        nacimiento.setText(fecha);

        TextView telefono = findViewById(R.id.telefono);

        telefono.setText(intent.getStringExtra("telefono"));

        TextView email = findViewById(R.id.email);

        email.setText(intent.getStringExtra("email"));

        TextView descripcioncontacto = findViewById(R.id.descripcioncontacto);

        descripcioncontacto.setText(intent.getStringExtra("descripcioncontacto"));

        Button editar=findViewById(R.id.boton_editar);
        editar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}