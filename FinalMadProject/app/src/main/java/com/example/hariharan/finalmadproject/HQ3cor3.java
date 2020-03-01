package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HQ3cor3 extends AppCompatActivity {

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq3cor3);

        button3 = (Button) findViewById(R.id.next);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHQ4();
            }
        });
    }

    public void openHQ4(){
        Intent intent = new Intent(this, HQ4.class);
        startActivity(intent);
    }
}
