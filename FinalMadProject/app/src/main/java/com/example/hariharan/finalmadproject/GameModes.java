package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GameModes extends AppCompatActivity {

    private ImageButton button1;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_modes);

        button1 = findViewById(R.id.imageButton);
        back = (Button) findViewById(R.id.back);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHQ1();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goback();
            }
        });
    }

    public void openHQ1(){
        Intent intent = new Intent(this, HQ1.class);
        startActivity(intent);
    }

    public void goback(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
