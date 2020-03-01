package com.example.hariharan.finalmadproject;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HighScore extends AppCompatActivity {
    DBHelper mydb;
    Button viewscr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);
        viewscr = (Button) findViewById(R.id.viewscr);
        mydb = new DBHelper(this);
        viewAll();
    }

    public void viewAll(){
        viewscr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Cursor res = mydb.getAllData();
                        if(res.getCount() == 0){
                            showMessage("Error", "Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext()){
                            buffer.append("ID: " + res.getString(0) + "\n");
                            buffer.append("Name: " + res.getString(1) + "\n");
                            buffer.append("Score: " + res.getString(2) + "\n");
                            buffer.append("Medal: " + res.getString(3) + "\n\n");
                        }

                        showMessage("GG !Well Played! xD, GLHF", buffer.toString());

                    }
                }
        );
    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
