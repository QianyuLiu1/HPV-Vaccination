package com.example.guoan.awsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by liuqianyu on 12/3/17.
 */

public class Main36Activity extends AppCompatActivity {
    TextView view;
    Button button;
    ImageButton home, visit, contact, more, resource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main36);

        view=(TextView)findViewById(R.id.textView16);
        button=(Button)findViewById(R.id.button52);
        home=(ImageButton)findViewById(R.id.buttonBook);
        visit=(ImageButton)findViewById(R.id.buttonVisit);
        contact=(ImageButton)findViewById(R.id.buttonContact);
        more=(ImageButton)findViewById(R.id.buttonMore);
        resource=(ImageButton)findViewById(R.id.buttonResource);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main36Activity.this,Main3Activity.class);
                startActivity(k);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main36Activity.this,Main2Activity.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main36Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main36Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main36Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main36Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });

    }
}
