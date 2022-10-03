package com.example.poupancacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_calcular = (Button) findViewById(R.id.btnCalcular);

        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 0;
                double valor, aplicacao, taxa, time, total = 0, sup, resultado;

                EditText vlr = (EditText) findViewById(R.id.value);
                valor = Double.parseDouble(vlr.getText().toString());

                EditText app = (EditText) findViewById(R.id.app_mensal);
                aplicacao = Double.parseDouble(app.getText().toString());

                EditText tempo = (EditText) findViewById(R.id.tempo_app);
                time = Integer.parseInt(tempo.getText().toString());

                EditText tax = (EditText) findViewById(R.id.taxa);
                taxa = Double.parseDouble(tax.getText().toString());


                //total = (valor + aplicacao) + (valor + aplicacao) * (taxa/100);

                while (i<time){
                    total = (valor + aplicacao) + (valor + aplicacao) * (taxa/100);
                    valor = total;
                    i++;
                }



                TextView textView = findViewById(R.id.txtTotal);
                textView.setText(String.valueOf(total));
            }
        });


    }
}