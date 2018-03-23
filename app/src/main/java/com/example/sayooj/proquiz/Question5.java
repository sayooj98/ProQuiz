package com.example.sayooj.proquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Question5 extends AppCompatActivity {

    int [] id = {R.id.button,R.id.button2,R.id.button3,R.id.button4};

    public void correct(Button b){
        mp = MediaPlayer.create(Question5.this, R.raw.correct);
        mp.start();

        b.setBackgroundColor(Color.GREEN);
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(Question5.this);
        View myView = getLayoutInflater().inflate(R.layout.next_level,null);
        FloatingActionButton fb = (FloatingActionButton)myView.findViewById(R.id.bt);
        TextView sc = (TextView)myView.findViewById(R.id.score);

        score=((level)*(10+(level-1)*5))/2;
        sc.setText(Integer.toString(score));
        sc.setTextColor(Color.WHITE);

        mBuilder.setView(myView);
        mBuilder.setCancelable(false);
        final AlertDialog ad = mBuilder.create();
        ad.show();

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad.dismiss();
                mp.stop();
                Intent i = new Intent(Question5.this,Question6.class);
                startActivity(i);
            }

        });
    }

    public void wrong(Button b,int ans){
        mp = MediaPlayer.create(Question5.this, R.raw.wrong);
        mp.start();
        b.setBackgroundColor(Color.RED);
        Button bt = (Button)findViewById(id[ans-1]);
        bt.setBackgroundColor(Color.GREEN);
        showDialog();
    }

    public void showDialog(){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(Question5.this);
        View myView = getLayoutInflater().inflate(R.layout.wrong,null);
        TextView tv = (TextView) myView.findViewById(R.id.score);
        score = ((level-1)*(10+(level-2)*5))/2;
        tv.setText(Integer.toString(score));

        SharedPreferences sp = getSharedPreferences("myData", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        int temp = Integer.parseInt(sp.getString("HighScore","0"));
        if(score>temp){
            ed.putString("HighScore",Integer.toString(score));
            ed.apply();
        }

        Button b = (Button)myView.findViewById(R.id.bt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Question5.this,MainMenu.class);
                startActivity(i);
            }
        });

        mBuilder.setView(myView);
        mBuilder.setCancelable(false);
        AlertDialog ad = mBuilder.create();
        ad.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_home){
            Intent i = new Intent(Question5.this, MainMenu.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    Db_helper d;
    TextView t;
    int ans;
    boolean clicked = false;
    int level = 5;
    int score;
    MediaPlayer mp;


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "You cannot go back at this stage!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        d = new Db_helper(this);

        t = (TextView)findViewById(R.id.timer);
        final CountDownTimer c = new CountDownTimer(12000,1000) {
            @Override
            public void onTick(long l) {
                t.setTextColor(Color.WHITE);
                t.setText("Time Remaining : " + l/1000 + "s");
            }

            @Override
            public void onFinish() {
                t.setTextColor(Color.RED);
                t.setText("Time Up!!");
                clicked = true;
                showDialog();
            }
        }.start();
        final TextView q = (TextView)findViewById(R.id.textView);
        final Button b1 = (Button)findViewById(R.id.button);
        final Button b2 = (Button)findViewById(R.id.button2);
        final Button b3 = (Button)findViewById(R.id.button3);
        final Button b4 = (Button)findViewById(R.id.button4);


        Random r = new Random();
        int id = r.nextInt(5)+1;
        Cursor cv = d.getData(level,id);
        cv.moveToNext();
        q.setText(cv.getString(2));
        b1.setText(cv.getString(3));
        b2.setText(cv.getString(4));
        b3.setText(cv.getString(5));
        b4.setText(cv.getString(6));
        ans = cv.getInt(7);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!clicked)
                {
                    if(ans==1)
                        correct(b1);
                    else
                        wrong(b1,ans);
                    clicked = true;
                    c.cancel();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!clicked)
                {
                    if(ans==2)
                        correct(b2);
                    else
                        wrong(b2,ans);
                    clicked = true;
                    c.cancel();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!clicked)
                {
                    if(ans==3)
                        correct(b3);
                    else
                        wrong(b3,ans);
                    clicked = true;
                    c.cancel();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!clicked)
                {
                    if(ans==4)
                        correct(b4);
                    else
                        wrong(b4,ans);
                    clicked = true;
                    c.cancel();
                }

            }
        });
    }
}
