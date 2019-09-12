package com.chat.me.mvpdemoapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.chat.me.mvpdemoapplication.R;
import com.chat.me.mvpdemoapplication.presenter.NextActivityPresenter;
import com.chat.me.mvpdemoapplication.views.NextView;

public class NextActivity extends AppCompatActivity implements NextView {

    private NextActivityPresenter nextActivityPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        nextActivityPresenter = new NextActivityPresenter(this);
        nextActivityPresenter.updateUserHNo("224");
        nextActivityPresenter.updatePincode("439809");
        nextActivityPresenter.updateUserLocality("Noida,U.P");
    }

    @Override
    public void updateView(String nextView) {
        ((TextView)findViewById(R.id.textView)).setText(nextView);
    }
}
