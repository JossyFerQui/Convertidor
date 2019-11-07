package com.example.convertidor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ValorConversor extends AppCompatActivity {
        TextView conversor;

        int valor;
        double resultado;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_valor_conversor);

            conversor = (TextView) findViewById(R.id.conversor);
            //Bundle bundle= new Bundle();
            Bundle bundle = this.getIntent().getExtras();
            conversor.setText(bundle.getString("dato"));

            valor= Integer.parseInt(bundle.getString("dato"));
            ///toneladas
            resultado =valor * 0.0000453592;
            ///gramos
            //resultado =valor * 453.592;

            conversor.setText(String.valueOf(resultado));




            Log.e("Valor", "Conversión Finalizada");
        }
    }
