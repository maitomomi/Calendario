package com.maite.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button siguiente=findViewById(R.id.boton_siguiente);
        siguiente.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,Confirmacion.class);
        TextView nombre=findViewById(R.id.nombre);
        intent.putExtra("nombre",nombre.getText().toString());

        DatePicker nacimiento=findViewById(R.id.nacimiento);
        intent.putExtra("nacimientodia",nacimiento.getDayOfMonth());
        intent.putExtra("nacimientomes",nacimiento.getMonth()+1);
        intent.putExtra("nacimientoano",nacimiento.getYear());

        TextView telefono=findViewById(R.id.telefono);
        intent.putExtra("telefono",telefono.getText().toString());

        TextView email=findViewById(R.id.email);
        intent.putExtra("email",email.getText().toString());

        TextView descripcioncontacto=findViewById(R.id.descripcioncontacto);
        intent.putExtra("descripcioncontacto",descripcioncontacto.getText().toString());
        startActivity(intent);
    }
}