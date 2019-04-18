package com.example.maventest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.base_module.internal.base.BaseMvpActivity;
import com.base_module.internal.base.BasePresenter;
import com.billy.cc.core.component.CC;
import com.example.base_a.TestActivity;
import com.example.base_a.TestShowActivity;

public class MainActivity extends BaseMvpActivity {

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

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }
}
