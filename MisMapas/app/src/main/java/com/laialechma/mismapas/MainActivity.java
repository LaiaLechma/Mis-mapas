package com.laialechma.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irRambla (View v){
        Intent i = new Intent(this, RamblaActivity.class);
        startActivity(i);
    }

    public void irBorn (View v){
        Intent i = new Intent(this, BornActivity.class);
        startActivity(i);
    }

    public void irMontserrat (View v){
        Intent i = new Intent(this, MontserratActivity.class);
        startActivity(i);
    }

    public void irSagradaFamilia (View v){
        Intent i = new Intent(this, SagradafamiliaActivity.class);
        startActivity(i);
    }
}
