package com.wyy.miniprogramtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

/**
 * 模仿微信小程序多任务窗口
 * https://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=2650266350&idx=1&sn=769948c499ddd2e6dfb54cc579bcd4b8&chksm=88632b81bf14a297dcf9a890be578d5f9109e4c611567665201102db301b8986cdacc950a31b&scene=178&cur_album_id=1455589563531214850#rd
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button firstBtn = findViewById(R.id.first_btn);
        Button secondBtn = findViewById(R.id.second_btn);
        Button thirdBtn = findViewById(R.id.third_btn);

        firstBtn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        });
        secondBtn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
        thirdBtn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });
    }
}