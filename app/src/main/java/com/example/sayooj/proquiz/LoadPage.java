package com.example.sayooj.proquiz;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class LoadPage extends AppCompatActivity {

    Db_helper d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_page);
        d = new Db_helper(this);
        d.insert();

        TextView redColorTextView = (TextView) findViewById(R.id.textView4);
        String redString = getResources().getString(R.string.s3_games);
        redColorTextView.setText(Html.fromHtml(redString));

        CountDownTimer c = new CountDownTimer(1500,1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent i = new Intent(LoadPage.this,MainMenu.class);
                startActivity(i);
            }
        }.start();
    }
}
