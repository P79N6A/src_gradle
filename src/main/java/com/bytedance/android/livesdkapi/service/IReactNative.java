package com.bytedance.android.livesdkapi.service;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.annotation.UiThread;
import android.support.v4.app.DialogFragment;
import com.bytedance.android.livesdkapi.service.IReactNativeHost;

@Keep
public interface IReactNative {
    @UiThread
    void createHalfScreenReactBoxDialog(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4, IReactNativeHost.Callback1<DialogFragment> callback1);

    void goRN(Context context, Uri uri);

    void initReactNative(Application application);
}
