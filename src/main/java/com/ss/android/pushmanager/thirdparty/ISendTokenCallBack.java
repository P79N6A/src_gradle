package com.ss.android.pushmanager.thirdparty;

import android.content.Context;

public interface ISendTokenCallBack {
    String getToken(Context context);

    int getType();
}
