package com.mcuellar.misgastosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton siguiente;
    ImageView uno;
    ImageView dos;
    ImageView tres;
    private EditText numbertext;
    private ProgressBar progressbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente=(FloatingActionButton)findViewById(R.id.next);
        uno=(ImageView) findViewById(R.id.picture1);
        dos=(ImageView) findViewById(R.id.picture2);
        tres=(ImageView) findViewById(R.id.picture3);


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent siguiente = new Intent(MainActivity.this, Registrar.class);
                startActivity(siguiente);
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent uno = new Intent(MainActivity.this, Detalle.class);
                startActivity(uno);
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dos = new Intent(MainActivity.this, Detalle.class);
                startActivity(dos);
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tres = new Intent(MainActivity.this, Detalle.class);
                startActivity(tres);
            }
        });




    }



}
