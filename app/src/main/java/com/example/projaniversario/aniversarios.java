package com.example.projaniversario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class aniversarios extends AppCompatActivity {

    public TextView dataNiver1;
    public TextView dataNiver2;
    public TextView dataNiver3;
    public TextView dataNiver4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniversarios);

        dataNiver1 = findViewById(R.id.aniver1);
        dataNiver2 = findViewById(R.id.aniver2);
        dataNiver3 = findViewById(R.id.aniver3);
        dataNiver4 = findViewById(R.id.aniver4);
    }
}