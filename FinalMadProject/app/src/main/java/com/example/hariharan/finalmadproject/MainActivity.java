package com.example.hariharan.finalmadproject;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button newGame, high, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newGame= (Button) findViewById(R.id.newGame);
        high= (Button) findViewById(R.id.hscore);
        button2 = (Button) findViewById(R.id.button2);

        newGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent inti = new Intent(MainActivity.this, GameModes.class);
                startActivity(inti);
            }
        });

        high.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent inti = new Intent(MainActivity.this, HighScore.class);
                startActivity(inti);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent inti = new Intent(MainActivity.this, scBoard.class);
                startActivity(inti);
            }
        });
    }
}
