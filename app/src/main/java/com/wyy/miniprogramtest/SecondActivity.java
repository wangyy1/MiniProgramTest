package com.wyy.miniprogramtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setCustomTaskDescription();
    }

    private void setCustomTaskDescription() {
        ActivityManager.TaskDescription taskDescription = new ActivityManager
                .TaskDescription("SecondActivity", BitmapFactory.decodeResource(getResources(), R.mipmap.second));
        setTaskDescription(taskDescription);
    }
}