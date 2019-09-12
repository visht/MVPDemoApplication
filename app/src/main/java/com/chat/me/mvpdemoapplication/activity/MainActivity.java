package com.chat.me.mvpdemoapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chat.me.mvpdemoapplication.R;
import com.chat.me.mvpdemoapplication.views.ViewMvp;
import com.chat.me.mvpdemoapplication.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements ViewMvp {

    private MainActivityPresenter mainActivityPresenter;
    private TextView tv;
    private Button gotonext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityPresenter = new MainActivityPresenter(this);
        tv = findViewById(R.id.text);
        gotonext = findViewById(R.id.button);
        mainActivityPresenter.updateName("Vishal");

        mainActivityPresenter.updateAge("24");

        gotonext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void updateModel(String str) {
        tv.setText(str);
    }
}
