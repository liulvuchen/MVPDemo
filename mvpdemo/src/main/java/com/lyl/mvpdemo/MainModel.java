package com.lyl.mvpdemo;

public class MainModel implements MainContract.Model {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void doRequest(String request, RequestListener listener) {
        listener.onSuccess();
    }
}
