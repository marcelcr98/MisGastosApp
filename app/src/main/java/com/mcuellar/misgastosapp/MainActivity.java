package com.mcuellar.misgastosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mcuellar.misgastosapp.Repositories.Repository;
import com.mcuellar.misgastosapp.models.Operation;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton siguiente;
    TextView uno,dos,tres;
    ImageView i1;
    ImageView i2;
    ImageView i3;

    private EditText numbertext;
    private ProgressBar progressbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente=(FloatingActionButton)findViewById(R.id.next);
        uno = findViewById(R.id.n1);
        dos=findViewById(R.id.n2);
        tres = findViewById(R.id.n3);
        i1=(ImageView) findViewById(R.id.picture1);
        i2=(ImageView) findViewById(R.id.picture2);
        i3=(ImageView) findViewById(R.id.picture3);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent siguiente = new Intent(MainActivity.this, Registrar.class);
                startActivity(siguiente);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(MainActivity.this, Detalle.class);
                startActivity(i1);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(MainActivity.this, Detalle.class);
                startActivity(i2);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(MainActivity.this, Detalle.class);
                startActivity(i3);
            }
        });

        double sAhorro = Repository.sumaAhorro();
        double sCredito = Repository.sumaCredito();
        double sEfectivo= Repository.sumaEfectivo();
        String ahorro = String.valueOf(sAhorro);
        String credito = String.valueOf(sCredito);
        String efectivo = String.valueOf(sEfectivo);


        uno.setText(ahorro);
        dos.setText(credito);
        tres.setText(efectivo);


        if(getIntent().getExtras() != null){
            String tipo = getIntent().getExtras().getString("tipo");
            String tipoCuenta = getIntent().getExtras().getString("tipoCuenta");
            double monto = getIntent().getExtras().getDouble("monto");

            Operation g = new Operation(tipo,tipoCuenta,monto);
            Repository.registrar(g);
        }

        progressbar1=findViewById(R.id.progressbar);
        progressbar1.setProgress(50);
    }

    public void callAdd(View view) {
        Intent intent = new Intent(this,Registrar.class);
        startActivity(intent);
    }





}
