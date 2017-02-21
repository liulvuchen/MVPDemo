package com.lyl.mvpdemo;

import  com.lyl.mvpdemo.basemvp.BasePresenter;
import  com.lyl.mvpdemo.basemvp.BaseView;

public class MainPresenter extends BasePresenter implements MainContract.Presenter {

    public MainPresenter(BaseView view) {
        super(view, new MainModel());
    }

    @Override
    public void request() {
        // 模拟请求，返回数据
        ((MainContract.Model) getModel()).doRequest("test", new RequestListener() {
            @Override
            public void onSuccess() {
                ((MainContract.View) getView()).showMessage("test");
            }
        });
    }
}
