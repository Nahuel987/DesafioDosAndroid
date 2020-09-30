package com.example.desafiodosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ActivityTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        ImageView imagenFinal= findViewById(R.id.imagenFinal);

        Picasso.get().load("https://picsum.photos/200/300").into(imagenFinal);

    }//oncreate

}//class