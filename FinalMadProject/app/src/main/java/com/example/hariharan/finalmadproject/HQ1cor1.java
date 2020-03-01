package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HQ1cor1 extends AppCompatActivity {

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq1cor1);

        button3 = (Button) findViewById(R.id.next);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHQ2();
            }
        });

    }

    public void openHQ2(){
        Intent intent = new Intent(this, HQ2.class);
        startActivity(intent);
    }


}
