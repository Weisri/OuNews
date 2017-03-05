package com.oushangfeng.ounews.module.pic;

/**
 * Created by Administrator on 2017/3/2.
 */

public interface BaseImageView {

    /**
     * show loading message
     *
     * @param msg
     */
    void showLoading(String msg);

    /**
     * hide loading
     */
    void hideLoading();

    /**
     * show error message
     */
    void showError(String msg);

    /**
     * show exception message
     */
    void showException(String msg);

    /**
     * show net error
     */
    void showNetError();

}
