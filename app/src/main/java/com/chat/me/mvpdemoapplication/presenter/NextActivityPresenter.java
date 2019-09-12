package com.chat.me.mvpdemoapplication.presenter;

import com.chat.me.mvpdemoapplication.models.NextModel;
import com.chat.me.mvpdemoapplication.views.NextView;

/**
 * Created by vishal on 12/09/19.
 */

public class NextActivityPresenter {

    private NextView nextView;
    private NextModel nextModel;

    public NextActivityPresenter(NextView nextView) {
        nextModel=new NextModel();
        this.nextView = nextView;
    }

    public void updateUserHNo(String hno){
        nextModel.setH_no(hno);
        nextView.updateView(nextModel.toString());
    }
    public void updatePincode(String pincode){
        nextModel.setPincode(pincode);
        nextView.updateView(nextModel.toString());
    }
    public void updateUserLocality(String locality){
        nextModel.setLocality(locality);
        nextView.updateView(nextModel.toString());
    }
}
