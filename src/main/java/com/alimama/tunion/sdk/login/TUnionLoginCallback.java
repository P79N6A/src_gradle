package com.alimama.tunion.sdk.login;

public interface TUnionLoginCallback {
    void onFailure(int i, String str);

    void onSuccess();
}
