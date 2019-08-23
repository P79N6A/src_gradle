package com.alimama.tunion.sdk.login;

public interface TUnionLoginAuthCallback {
    void onFailure(int i, String str);

    void onSuccess(String str);
}
