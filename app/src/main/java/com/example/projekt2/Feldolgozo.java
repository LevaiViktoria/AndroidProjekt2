package com.example.projekt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Feldolgozo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feldolgozo);

        TextView sikeres = findViewById(R.id.sikeres);
        Bundle extras = getIntent().getExtras();

        if (extras != null){
            sikeres.setText(("Köszönjük a rendelést, " + extras.getString("nev")) + "! A fizetendő összeg 30.000 Ft lesz. ");
        }
    }
}