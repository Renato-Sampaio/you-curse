package com.br.youcurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edtLogin, edtSenha;
    private TextView cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Chamada do Método responsável por inicializar os componentes
        inicializaComponentes();

        // Evento de clique do TextView Cadastrar
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCadastro();
            }
        });

        // Método responsável por efetuar o login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrar();
            }
        });
    }

    // Método responsável por chamar a tela de cadastro
    public void abrirCadastro(){
        Intent abrirCadastro = new Intent(this, CadastroActivity.class);
        startActivity(abrirCadastro);
        finish();
    }

    private void entrar(){
        Intent entrar = new Intent(this, HomeActivity.class);
        startActivity(entrar);
        finish();
    }

    // Método responsável por inicializar os componentes
    private void inicializaComponentes() {
        btnLogin = findViewById(R.id.btnEntrar);
        edtLogin = findViewById(R.id.edtLogin);
        edtSenha = findViewById(R.id.edtSenha);
        cadastrar = findViewById(R.id.txtCadastrar);
    }
}