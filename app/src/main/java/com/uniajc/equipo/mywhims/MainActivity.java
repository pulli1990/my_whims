package com.uniajc.equipo.mywhims;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText email, contraseña;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.Pt_email);
        contraseña=(EditText)findViewById(R.id.Et_contraseña);

    }///fin metodo oncreate

    public void lanzarDeseo(View v){
        Intent intent=new Intent(MainActivity.this, DeseoActivity.class);
        startActivity(intent);
    }
}
