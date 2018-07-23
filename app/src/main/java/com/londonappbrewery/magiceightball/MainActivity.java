package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_main);
        ImageView Balldisplay = (ImageView) findViewById(R.id.imageball_eightball);

        fiinal int[] Ballarray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        Button mybutton = (Button) findViewById(R.id.askbutton);

        mybutton = SetOnclickListener(new.OnClickListener()
        @Override
        Public void onClick (View v){
            Random randomnumberGenerator = new Random();
            int number = randomnumberGenerator.nextInt(5);
            int imageResourseId = Ballarray[number];
            Balldisplay.setImageResource(imageResourseId);
        }
        )};


     }
}
