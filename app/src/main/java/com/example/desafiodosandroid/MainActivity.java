package com.example.desafiodosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagen= findViewById(R.id.mostarImagen);

        Button miboton= findViewById(R.id.botonResgistrarse);

        Button mibotonDos=findViewById(R.id.botonIngresar);

        Picasso.get().load("https://guide.fire-emblem-heroes.com/wp-content/uploads/myrrh_great_dragon.png").into(imagen);

        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"BOTON PRESIONADO", Toast.LENGTH_LONG).show();
                pasarActivityDos();
            }
        });

        mibotonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Bienvenido usuario", Toast.LENGTH_LONG).show();
                pasarActivityTres();
            }
        });



    }//on cerate


    private void pasarActivityDos() {

        //pasar de MainActivity a ActivityDos
        Intent intent = new Intent (this,   ActivityDos.class);

        startActivity(intent);

    }//pasar nueva activity dos


    private void pasarActivityTres() {

        //pasar de MainActivity a ActivityTres
        Intent intent = new Intent (this,   ActivityTres.class);

        startActivity(intent);

    }//pasar nueva activity tres



}//class