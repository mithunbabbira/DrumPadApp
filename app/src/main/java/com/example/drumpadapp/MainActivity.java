package com.example.drumpadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    public void onBackPressed() {// when the user goes back the phone should stop using the resources
        finish();  // When i tried running app without this class(onBackPressed) the music continued
        System.exit(0);//playing even after pressing the back button
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.imageButton1);
        b2 = findViewById(R.id.imageButton2);
        b3 = findViewById(R.id.imageButton3);
        b4 = findViewById(R.id.imageButton4);
        b5 = findViewById(R.id.imageButton5);
        b6= findViewById(R.id.imageButton6);
        b7 = findViewById(R.id.imageButton7);
        b8 = findViewById(R.id.imageButton8);
        b9 = findViewById(R.id.imageButton9);
        b10 = findViewById(R.id.imageButton10);
        b11 = findViewById(R.id.imageButton11);
        b12 = findViewById(R.id.imageButton12);

        m1= MediaPlayer.create(this,R.raw.one);
        m2 = MediaPlayer.create(this,R.raw.two);
        m3 = MediaPlayer.create(this,R.raw.three);
        m4 = MediaPlayer.create(this,R.raw.four);
        m5 = MediaPlayer.create(this,R.raw.fv);
        m6= MediaPlayer.create(this,R.raw.sixth);
        m7 = MediaPlayer.create(this,R.raw.seventh);
        m8 = MediaPlayer.create(this,R.raw.eighth);
        m9 = MediaPlayer.create(this,R.raw.nine);
        m10 = MediaPlayer.create(this,R.raw.ten);
        m11= MediaPlayer.create(this,R.raw.eleven);
        m12= MediaPlayer.create(this,R.raw.twele);



        b1.setOnClickListener(new click());
        b2.setOnClickListener(new click());
        b3.setOnClickListener(new click());
        b4.setOnClickListener(new click());
        b5.setOnClickListener(new click());
        b6.setOnClickListener(new click());
        b7.setOnClickListener(new click());
        b8.setOnClickListener(new click());
        b9.setOnClickListener(new click());
        b10.setOnClickListener(new click());
        b11.setOnClickListener(new click());
        b12.setOnClickListener(new click());




//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                m1.start();
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                m2.start();
//            }
//        });



     //there are two method to execute the music file above is the traditional below
     // with the switch case

    }public class click implements View.OnClickListener{

        //ctrl+o (select onclick)

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case (R.id.imageButton1):
                    m1.start();
                    break;
                case(R.id.imageButton2):
                    m2.start();
                    break;
                case(R.id.imageButton3):
                    m3.start();
                    break;
                case(R.id.imageButton4):
                    m4.start();
                    break;
                case(R.id.imageButton5):
                    m5.start();
                    break;
                case (R.id.imageButton6):
                    m6.start();
                    break;
                case(R.id.imageButton7):
                    m7.start();
                    break;
                case(R.id.imageButton8):
                    m8.start();
                    break;
                case(R.id.imageButton9):
                    m9.start();
                    break;
                case(R.id.imageButton10):
                    m10.start();
                    break;
                case(R.id.imageButton11):
                    m11.start();
                    break;
                case(R.id.imageButton12):
                    m12.start();
                    break;
            }
        }
    }
}
