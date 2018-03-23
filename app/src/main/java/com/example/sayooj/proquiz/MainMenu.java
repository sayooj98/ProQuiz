package com.example.sayooj.proquiz;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    public void onBackPressed() {
        AlertDialog.Builder buider = new AlertDialog.Builder(MainMenu.this);
        View v = getLayoutInflater().inflate(R.layout.exit_dialog, null);
        buider.setView(v);
        buider.setCancelable(false);   //Side Clickable:off

        Button y = (Button) v.findViewById(R.id.button5);
        Button n = (Button) v.findViewById(R.id.button6);

        final AlertDialog ad = buider.create();
        ad.show();


        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.dismiss();
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = getSharedPreferences("myData", Context.MODE_PRIVATE);
        TextView tv = (TextView)findViewById(R.id.highscore);
        tv.setTextColor(Color.WHITE);
        tv.setText(sp.getString("HighScore","0"));
        Button b = (Button)findViewById(R.id.button); // play button
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMenu.this,Question1.class);
                startActivity(i);
            }
        });

        Button b1 = (Button)findViewById(R.id.button7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMenu.this,Rules.class);
                startActivity(i);
            }
        });

    }
}
