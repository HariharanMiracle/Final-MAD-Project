package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HQ5cor5 extends AppCompatActivity {

    Button button3;
    public static final String Extra = "";
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq5cor5);

        button3 = (Button) findViewById(R.id.next);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addToScore();
            }
        });
    }

    public void addToScore(){
        score = (TextView) findViewById(R.id.mark);
        String scr = score.getText().toString();
        Intent intent = new Intent(this, AddToScore.class);
        intent.putExtra(Extra, scr);
        startActivity(intent);
    }
}
