package com.bytedance.common.utility;

public interface ICustomToast {
    void dismissCustomToast();

    void showCustomLongToast(int i, String str);

    void showCustomToast(int i, String str);

    void showCustomToast(int i, String str, int i2, int i3);

    void showCustomToast(String str);

    void showCustomToast(String str, int i, int i2);
}
