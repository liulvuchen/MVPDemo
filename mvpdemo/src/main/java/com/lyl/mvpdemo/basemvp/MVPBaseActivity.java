package com.lyl.mvpdemo.basemvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 类名：MVPBaseActivity <br/>
 * 描述：MVP风格的样例模板
 * 创建时间：2016/03/17 18:45
 *
 * @author hanter
 * @version 1.0
 */
public abstract class MVPBaseActivity<T extends BasePresenter> extends AppCompatActivity {

    protected T mPresenter;

    protected abstract T createPresenter();

    public T getPresenter() {
        return mPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = createPresenter();
        mPresenter.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onResume();
    }

    @Override
    protected void onPause() {
        mPresenter.onPause();
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        mPresenter.onSaveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }

        super.onDestroy();
    }
}
