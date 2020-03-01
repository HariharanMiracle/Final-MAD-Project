package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HQ2cor2 extends AppCompatActivity {

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq2cor2);

        button3 = (Button) findViewById(R.id.next);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHQ3();
            }
        });
    }

    public void openHQ3(){
        Intent intent = new Intent(this, HQ3.class);
        startActivity(intent);
    }
}
