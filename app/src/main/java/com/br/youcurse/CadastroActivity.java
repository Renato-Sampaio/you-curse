package com.br.youcurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edtLogin, edtSenha;
    private TextView entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Chamada do Método responsável por inicializar os componentes
        inicializaComponentes();

        // Evento de clique do TextView Cadastrar
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirLogin();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrar();
            }
        });
    }

    // Método responsável por chamar a tela de cadastro
    public void abrirLogin(){
        Intent abrirLogin = new Intent(this, LoginActivity.class);
        startActivity(abrirLogin);
        finish();
    }

    private void entrar(){
        Intent entrar = new Intent(this, HomeActivity.class);
        startActivity(entrar);
        finish();
    }

    // Método responsável por inicializar os componentes
    private void inicializaComponentes() {
        btnLogin = findViewById(R.id.btnCadastrar);
        edtLogin = findViewById(R.id.edtLogin);
        edtSenha = findViewById(R.id.edtSenha);
        entrar = findViewById(R.id.txtEntrar);
    }
}