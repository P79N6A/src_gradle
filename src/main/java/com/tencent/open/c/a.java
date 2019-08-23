package com.tencent.open.c;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Method;

public class a extends WebView {
    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebSettings settings = getSettings();
        if (settings != null) {
            try {
                Method method = settings.getClass().getMethod("removeJavascriptInterface", new Class[]{String.class});
                if (method != null) {
                    method.invoke(this, new Object[]{"searchBoxJavaBridge_"});
                }
            } catch (Exception unused) {
            }
        }
    }

    public a(Context context) {
        super(context);
    }
}
