package com.example.caloma88.unireming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener {

    Button ingresar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ingresar = (Button) findViewById(R.id.ingresar);
        ingresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String usuario = ((EditText) findViewById(R.id.editText2)).getText().toString();
        String contraseña = ((EditText) findViewById(R.id.editText)).getText().toString();

        if (usuario.equals("camilo") && contraseña.equals("camilo")) {
            this.intent = new Intent(this, VentanaInicio.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "usuario y/o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }

    }

}

