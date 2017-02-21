package com.lyl.mvpdemo;

import  com.lyl.mvpdemo.basemvp.BaseModel;
import  com.lyl.mvpdemo.basemvp.BaseView;

/**
 * 类名：MainContract <br/>
 * 描述：
 * 创建时间：2016/09/01 23:56
 *
 * @author hanter
 * @version 1.0
 */
public class MainContract {

    public interface View extends BaseView {
        /**
         * 切换弹出窗口状态
         */
        void showMessage(String message);
    }


    public interface Model extends BaseModel {
        void doRequest(String request, RequestListener listener);
    }


    public interface Presenter {
        void request();
    }
}

