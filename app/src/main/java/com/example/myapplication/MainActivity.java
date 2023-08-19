package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText e3;
    Button calcularButton;
    EditText e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        e2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        e3 = (EditText) findViewById(R.id.editTextNumberDecimal3);
        calcularButton = (Button) findViewById(R.id.button);
        e4 = (EditText) findViewById(R.id.editTextNumberDecimal4);
        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularMedia();
            }
        });
    }

    public void calcularMedia() {
        double nota1 = Double.parseDouble(e1.getText().toString());
        double nota2 = Double.parseDouble(e2.getText().toString());
        double nota3 = Double.parseDouble(e3.getText().toString());

        double media = (nota1 + nota2 + nota3) / 3;
        e4.setText(""+  media);
    }
}
