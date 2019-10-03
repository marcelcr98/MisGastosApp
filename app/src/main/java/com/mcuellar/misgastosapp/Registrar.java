package com.mcuellar.misgastosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Registrar extends AppCompatActivity {

    private RadioGroup radioGrupoTipo;
    private RadioGroup radioGroupCuenta;

    private EditText monto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        radioGrupoTipo=findViewById(R.id.rg1);
        radioGroupCuenta=findViewById(R.id.rg2);

        monto= findViewById(R.id.txtMonto);

    }

    public void callRegistter(View view) {
        String tipo = "";
        String tipoCuenta = "";
        if (radioGrupoTipo.getCheckedRadioButtonId() == R.id.rbuno) {
            tipo = "Ingreso";
            if (radioGroupCuenta.getCheckedRadioButtonId() == R.id.rb1) {
                tipoCuenta = "Credito";
            }else if(radioGroupCuenta.getCheckedRadioButtonId() == R.id.rb2){
                tipoCuenta = "Ahorro";
            }else if(radioGroupCuenta.getCheckedRadioButtonId() == R.id.rb3){
                tipoCuenta = "Efectivo";
            }

        }else if(radioGrupoTipo.getCheckedRadioButtonId() == R.id.rbdos){
            tipo = "Egreso";
            if (radioGroupCuenta.getCheckedRadioButtonId() == R.id.rb1) {
                tipoCuenta = "Credito";
            }else if(radioGroupCuenta.getCheckedRadioButtonId() == R.id.rb2){
                tipoCuenta = "Ahorro";
            }else if(radioGroupCuenta.getCheckedRadioButtonId() == R.id.rb3){
                tipoCuenta = "Efectivo";
            }
        }


        String m = monto.getText().toString();
        double montoIngresado = Double.parseDouble(m);

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("monto",montoIngresado);
        intent.putExtra("tipo",tipo);
        intent.putExtra("tipoCuenta",tipoCuenta);
        startActivity(intent);
    }
}
