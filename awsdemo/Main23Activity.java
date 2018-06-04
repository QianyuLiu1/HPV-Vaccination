package com.example.guoan.awsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main23Activity extends AppCompatActivity {
      Button button, button2, button3;
    ImageButton home, visit, contact, more, resource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);


        home=(ImageButton)findViewById(R.id.buttonBook);
        visit=(ImageButton)findViewById(R.id.buttonVisit);
        contact=(ImageButton)findViewById(R.id.buttonContact);
        more=(ImageButton)findViewById(R.id.buttonMore);
        resource=(ImageButton)findViewById(R.id.buttonResource);

        button3=(Button)findViewById(R.id.button24);
        button2=(Button)findViewById(R.id.button6);
        button=(Button)findViewById(R.id.button5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main23Activity.this,Main17Activity.class);
                startActivity(k4);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main23Activity.this,Main24Activity.class);
                startActivity(k4);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main23Activity.this,Main2Activity.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main23Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main23Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main23Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main23Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });
    }
}
