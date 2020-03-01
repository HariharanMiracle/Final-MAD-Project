package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HQ3incor3 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button;
    public static final String Extra = "";
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq3incor3);

        button1 = findViewById(R.id.buttonPlayAgain);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHQ3();
            }
        });
        button2 = findViewById(R.id.buttonQuit);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGM();
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addToScore();
            }
        });
    }

    public void openHQ3(){
        Intent intent = new Intent(this, HQ3.class);
        startActivity(intent);
    }

    public void openGM(){
        Intent intent = new Intent(this, GameModes.class);
        startActivity(intent);
    }

    public void addToScore(){
        score = (TextView) findViewById(R.id.mark);
        String scr = score.getText().toString();
        Intent intent = new Intent(this, AddToScore.class);
        intent.putExtra(Extra, scr);
        startActivity(intent);
    }
}
