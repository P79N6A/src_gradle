package com.ss.android.excitingvideo;

public interface ExcitingVideoListener {
    void onComplete(int i, int i2, int i3);

    void onError(int i, String str);

    void onSuccess();
}
