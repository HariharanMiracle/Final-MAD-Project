package com.example.hariharan.finalmadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddToScore extends AppCompatActivity {
    DBHelper mydb;
    Button add;
    EditText edname;
    String msg, med;
    int score;
    TextView scr, medal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_score);

        mydb = new DBHelper(this);
        scr = (TextView) findViewById(R.id.score);
        medal = (TextView) findViewById(R.id.medal);
        add = (Button) findViewById(R.id.add);
        edname = (EditText) findViewById(R.id.player);

        Intent intent = getIntent();
        msg = intent.getStringExtra(HQ1incor1.Extra);
        score = Integer.parseInt(msg);

        scr.setText(msg);

        //herald,guardian,crusader,archon,legend,divine
        if(score == 0){
            med = "herald";
            medal.setText(med);
        }
        else if(score == 1){
            med = "guardian";
            medal.setText(med);
        }
        else if(score == 2){
            med = "crusader";
            medal.setText(med);
        }
        else if(score == 3){
            med = "archon";
            medal.setText(med);
        }
        else if(score == 4){
            med = "legend";
            medal.setText(med);
        }
        else{
            med = "divine";
            medal.setText(med);
        }
        AddData();
    }

    public void AddData(){
        add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String xname = edname.getText().toString();

                        boolean res = mydb.insertData(xname, msg, med);

                        if(res == true){
                            Toast.makeText(AddToScore.this,"Data inserted", Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(AddToScore.this, "Data not inserted", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
