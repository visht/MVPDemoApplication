package com.chat.me.mvpdemoapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.chat.me.mvpdemoapplication.R;
import com.chat.me.mvpdemoapplication.views.ViewMvp;
import com.chat.me.mvpdemoapplication.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements ViewMvp {

    private MainActivityPresenter mainActivityPresenter;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityPresenter = new MainActivityPresenter(this);
        tv = findViewById(R.id.text);
        mainActivityPresenter.updateName("Vishal");
        mainActivityPresenter.updateAge("24");
    }

    @Override
    public void updateModel(String str) {
        tv.setText(str);
    }
}
