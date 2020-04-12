package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText password, usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.login_name);
        password = (EditText) findViewById(R.id.login_pass);
    }

    public void logIn(View view){
        if(!Errores()){
            /*Intent intent = new Intent(this, homeActivity.class);
            startActivity(intent);*/
        }
    }

    private boolean Errores(){
        Validar validar = new Validar();
        boolean fine = false;

        if (validar.isNullOrEmpty(usuario.getText().toString())){
            /*usuario.setErrorEnabled(true);
            email.setError(getString(R.string.email_vacio));
            error = true;*/
            fine = true;
            Toast.makeText(getApplicationContext(), R.string.email_vacio, Toast.LENGTH_SHORT).show();
        } else if (!validar.isValidEmail(usuario.getText().toString())){
            /*email.setErrorEnabled(true);
            email.setError(getString(R.string.email_no_valido));
            error = true;*/
            fine = true;
            Toast.makeText(getApplicationContext(), R.string.email_no_valido, Toast.LENGTH_SHORT).show();
        } else if (validar.isNullOrEmpty(password.getText().toString())){
            /*password.setErrorEnabled(true);
            password.setError(getString(R.string.contraseña_vacia));
            error = true;*/
            fine = true;
            Toast.makeText(getApplicationContext(), R.string.pass_vacia, Toast.LENGTH_SHORT).show();
        } else if (!validar.isValidPassword(password.getText().toString(), false)) {
            /*password.setErrorEnabled(true);
            password.setError(getString(R.string.contraseña_no_valida));
            error = true;*/
            fine = true;
            Toast.makeText(getApplicationContext(), R.string.pass_no_valida, Toast.LENGTH_SHORT).show();
        }

        return fine;
    }
}
