package com.example.bae.myapplication3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    Button btnGo;
    ImageView imgJung;
    float angle = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("연습문제 4-9");

        btnGo = (Button) findViewById(R.id.BtnGo);
        imgJung = (ImageView) findViewById(R.id.ImgJung);

        btnGo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                angle += 10;
                imgJung.setRotation(angle);

            }

        });

    }
}