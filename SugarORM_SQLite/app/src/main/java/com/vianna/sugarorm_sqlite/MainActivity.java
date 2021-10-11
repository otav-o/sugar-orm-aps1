package com.vianna.sugarorm_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.orm.SugarDb;

public class MainActivity extends AppCompatActivity {

    TextInputLayout tiNome, tiIdade;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();
        registraEventos();
    }

    private void registraEventos() {
        btnSalvar.setOnClickListener(salvarPessoa());
    }

    private View.OnClickListener salvarPessoa() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = tiNome.getEditText().getText().toString();
                int idade = Integer.parseInt(tiIdade.getEditText().getText().toString());

                Pessoa p = new Pessoa(nome, idade);
                p.save(); // aqui está o ORM
            }
        };

    }

    private void binding() {
        tiNome = findViewById(R.id.tiNome);
        tiIdade = findViewById(R.id.tiIdade);

        btnSalvar = findViewById(R.id.btnSalvar);
    }
}