package com.lyl.mvpdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lyl.mvpdemo.basemvp.MVPBaseActivity;

public class MainActivity extends MVPBaseActivity<MainPresenter> implements MainContract.View, View.OnClickListener {

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message+"~~~~~~~~", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main_request:
                mPresenter.request();
                break;
        }
    }
}
