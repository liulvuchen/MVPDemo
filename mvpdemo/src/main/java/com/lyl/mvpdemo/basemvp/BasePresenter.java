package com.lyl.mvpdemo.basemvp;

import android.os.Bundle;

import java.lang.ref.WeakReference;

/**
 * 类名：BasePresenter <br/>
 * 描述：MVP中P基类
 * 创建时间：2016/03/17 18:42
 *
 * @author hanter
 * @version 1.0
 */
public abstract class BasePresenter {
    private WeakReference<BaseView> mViewRef;
    private final BaseModel mModel;

    public BasePresenter(BaseView view, BaseModel model) {
        mModel = model;
        attachView(view);
    }

    public void attachView(BaseView view) {
        mViewRef = new WeakReference<>(view);

        if (mModel != null) {
            mModel.start();
        }

    }

    public void onCreate(Bundle savedInstanceState) {

    }

    public void onResume() {

    }

    public BaseView getView() {
        return mViewRef == null ? null : mViewRef.get();
    }

    public BaseModel getModel() {
        return mModel;
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void onPause() {

    }

    public void onSaveInstanceState(Bundle outState) {

    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }

        if (mModel != null) {
            mModel.stop();
        }
    }
}
