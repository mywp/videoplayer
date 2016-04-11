package com.example.scorpio.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop() {
        System.out.println("界面不可见时，最小化，暂停播放");
        super.onStop();
    }

    @Override
    protected void onStart() {
        System.out.println("开始播放小电影");
        super.onStart();
    }
}
