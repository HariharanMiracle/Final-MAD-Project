package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HQ4cor4 extends AppCompatActivity {

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq4cor4);

        button3 = (Button) findViewById(R.id.next);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHQ5();
            }
        });
    }

    public void openHQ5(){
        Intent intent = new Intent(this, HQ5.class);
        startActivity(intent);
    }
}
