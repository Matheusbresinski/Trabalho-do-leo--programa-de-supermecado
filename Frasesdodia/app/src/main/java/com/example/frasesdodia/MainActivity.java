package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovaFrase(View view){

        String [] frases = {

                "Frase 1",
                "Frase 2",
                "Frase 3",
                "Frase 4",

        };
        int numero = new Random().nextInt(frases.length);

        textView texto = findViewById(R.id.texte_resultado);
        texto.setText(frases[numero]);

    }
}
