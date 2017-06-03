package com.example.caloma88.unireming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class VentanaInicio extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner pagina_principal , plataformas, contactos;

    ArrayAdapter<String> adapter_pagina_principal;
    ArrayAdapter<String> adapter_plataformas;
    ArrayAdapter<String> adapter_contactos;

    String [] lista_pagina_principal = new String[] {"pagina principal" , "pagina principal Medellin" , "pagina principal Manizales"};
    String [] lista_plataformas = new String[] {"paltaformas" , "Q10" , "Moodle" , "correo estudiantil"};
    String [] lista_contactos = new String[] {"contactos" , "contacto Medellin" , "contacto Manizales"};

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_inicio);

        pagina_principal = (Spinner) findViewById(R.id.spinner1);
        adapter_pagina_principal = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista_pagina_principal);
        pagina_principal.setAdapter(adapter_pagina_principal);
        pagina_principal.setOnItemSelectedListener(this);

        plataformas = (Spinner) findViewById(R.id.spinner2);
        adapter_plataformas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista_plataformas);
        plataformas.setAdapter(adapter_plataformas);
        plataformas.setOnItemSelectedListener(this);

        contactos = (Spinner) findViewById(R.id.spinner3);
        adapter_contactos = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista_contactos);
        contactos.setAdapter(adapter_contactos);
        contactos.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (parent.getId()){
            case R.id.spinner1:
                int seleccionpaginaprincipal = pagina_principal.getSelectedItemPosition();
                if (seleccionpaginaprincipal==1)
                {
                    this.intent = new Intent(this, paginaprincipalmedellin.class);
                    startActivity(intent);
                }
                if (seleccionpaginaprincipal==2)
                {
                    this.intent = new Intent(this, paginaprincipalmanizales.class);
                    startActivity(intent);
                }
        }

        switch (parent.getId()){
            case R.id.spinner2:
                int seleccionplataformas = plataformas.getSelectedItemPosition();
                if (seleccionplataformas==1)
                {
                    this.intent = new Intent(this, PlataformaQ10.class);
                    startActivity(intent);
                }
                if (seleccionplataformas==2)
                {
                    this.intent = new Intent(this, PlataformaMoodle.class);
                    startActivity(intent);
                }
                if (seleccionplataformas==3)
                {
                    this.intent = new Intent(this, PlataformaCorreo.class);
                    startActivity(intent);
                }
        }

        switch (parent.getId()){
            case R.id.spinner3:
                int seleccioncontactos = contactos.getSelectedItemPosition();
                if (seleccioncontactos==1)
                {
                    this.intent = new Intent(this, contactosmedellin.class);
                    startActivity(intent);
                }
                if (seleccioncontactos==2)
                {
                    this.intent = new Intent(this, contactosmanizales.class);
                    startActivity(intent);
                }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
