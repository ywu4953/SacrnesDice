package com.example.scarnesdice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int userOverall;
    int userTurn;
    int comOverall;
    int comTurn;
    Button roll;
    Button hold;
    Button reset;
    ImageView image;
    TextView text;
    String displayScore = "Your score: " + String.valueOf(userOverall) + " Your turn score: " + String.valueOf(userTurn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll = (Button) findViewById(R.id.roll);
        hold = (Button) findViewById(R.id.hold);
        image = (ImageView) findViewById(R.id.imageView);
        text = (TextView) findViewById(R.id.textView);
        userOverall = 0;
        userTurn = 0;
        comOverall = 0;
        comTurn = 0;
    }

    public void roll(View view){
        Random rand = new Random();
        int rand1 = rand.nextInt(6)+1;
        switch (rand1){
            case 1:
                image.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                userTurn = 0;
                break;
            case 2:
                image.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                userTurn += rand1;
                break;
            case 3:
                image.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                userTurn += rand1;
                break;
            case 4:
                image.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                userTurn += rand1;
                break;
            case 5:
                image.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                userTurn += rand1;
                break;
            case 6:
                image.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                userTurn += rand1;
                break;

        }
        userOverall += userTurn;
        text.setText(displayScore);

    }

    public void hold(View view){

    }

    public void reset(View view){

    }
}
