package com.example.maventest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.billy.cc.core.component.CC;
import com.example.base_a.TestActivity;
import com.example.base_a.TestShowActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestActivity.test();
        findViewById(R.id.tv_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CC.obtainBuilder("base_a.ComponentA")
                        .setActionName("showTest")
                        .build().call();

            }
        });
    }
}
