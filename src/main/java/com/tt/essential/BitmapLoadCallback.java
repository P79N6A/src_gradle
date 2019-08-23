package com.tt.essential;

public interface BitmapLoadCallback {
    void onFail(Exception exc);

    void onSuccess();
}
