package com.example.hariharan.finalmadproject;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scBoard extends AppCompatActivity {

    Button hero, item, draft, ability;
    DBHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc_board);

        mydb = new DBHelper(this);
        hero = (Button) findViewById(R.id.hero);
        item = (Button) findViewById(R.id.item);
        draft = (Button) findViewById(R.id.draft);
        ability = (Button) findViewById(R.id.ability);

        viewHero();
        viewItem();
        viewDraft();
        viewAbility();
    }

    public void viewHero(){
        hero.setOnClickListener(
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

                        showMessage("Scoreboard - Hero", buffer.toString());

                    }
                }
        );
    }

    public void viewItem(){
        item.setOnClickListener(
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

                        showMessage("Scoreboard - Item", buffer.toString());

                    }
                }
        );
    }

    public void viewDraft(){
        draft.setOnClickListener(
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

                        showMessage("Scoreboard - Draft", buffer.toString());

                    }
                }
        );
    }

    public void viewAbility(){
        ability.setOnClickListener(
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

                        showMessage("Scoreboard - Ability", buffer.toString());

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
