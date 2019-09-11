package com.chat.me.mvpdemoapplication.presenter;

import com.chat.me.mvpdemoapplication.views.ViewMvp;
import com.chat.me.mvpdemoapplication.models.ModelInfo;

/**
 * Created by vishal on 11/09/19.
 */

public class MainActivityPresenter {
    private ViewMvp viewMvp;
    private ModelInfo modelInfo;

    public MainActivityPresenter(ViewMvp viewMvp) {
        this.viewMvp = viewMvp;
        this.modelInfo = new ModelInfo();
    }

    public void updateName(String name) {
        modelInfo.setName(name);
        viewMvp.updateModel(modelInfo.toString());
    }

    public void updateAge(String age) {
        modelInfo.setAge(age);
        viewMvp.updateModel(modelInfo.toString());
    }
}
