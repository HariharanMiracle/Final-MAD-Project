package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HQ2 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq2);

        button1 = (Button) findViewById(R.id.axe);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIncorrect();
            }
        });
        button2 = (Button) findViewById(R.id.cent);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIncorrect();
            }
        });
        button3 = (Button) findViewById(R.id.bb);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIncorrect();
            }
        });
        button4 = (Button) findViewById(R.id.buttonBeast);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCorrect1();
            }
        });
    }

    public void openIncorrect(){
        Intent intent = new Intent(this, HQ2incor2.class);
        startActivity(intent);
    }
    public void openCorrect1(){
        Intent intent = new Intent(this, HQ2cor2.class);
        startActivity(intent);
    }
}
