package com.example.desafiodosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        Spinner rangoEdad=findViewById(R.id.spinner);
        Button ingrearUsuario=findViewById(R.id.botonIngresarDatos);

        //se crea un adaptador
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.rangoEdad,android.R.layout.simple_spinner_item);

        //agregar adaptador al spinner creado
        rangoEdad.setAdapter(adapter);

        ingrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityDos.this, "USUARIO INGRESADO", Toast.LENGTH_SHORT).show();
                pasarActivityTres();
            }
        });



    }//onCreate

    private void pasarActivityTres() {
        //pasar de ActivityDos a ActivityTres
        Intent intent = new Intent (this, ActivityTres.class);

        startActivity(intent);

    }//pasar nueva activity

}//class