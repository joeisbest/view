package com.example.student.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hand=new Handler();
        view=(MyView)findViewById(R.id.myview);

        hand.postDelayed(run,100);
    }
    Handler hand;
    MyView view;
    Runnable run=new Runnable() {
        @Override
        public void run() {
            view.invalidate();
            hand.postDelayed(run,100);
        }
    };
}
