package com.example.app_hello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private EditText nota1, nota2;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = findViewById(R.id.Nota1);
        nota2 = findViewById(R.id.Nota2);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        textResultado = findViewById(R.id.textResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularMedia();
            }
        });
    }

    private void calcularMedia() {
        String nota1Str = nota1.getText().toString();
        String nota2Str = nota2.getText().toString();

        if (!nota1Str.isEmpty() && !nota2Str.isEmpty()) {

            double n1 = Double.parseDouble(nota1Str);
            double n2 = Double.parseDouble(nota2Str);

            double media = (n1 + n2) / 2;

            if (media >= 12) {
                textResultado.setText("Aprovado: " + media);
                textResultado.setTextColor(Color.GREEN);
            } else {
                textResultado.setText("Reprovado/Exame: " + media);
                textResultado.setTextColor(Color.RED);
            }
        } else {
            textResultado.setText("Insira as duas notas.");
            textResultado.setTextColor(Color.BLACK);
        }
    }
}
