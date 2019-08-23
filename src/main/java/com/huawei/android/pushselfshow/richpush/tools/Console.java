package com.huawei.android.pushselfshow.richpush.tools;

import android.webkit.JavascriptInterface;
import com.huawei.android.pushagent.utils.a.e;

public class Console {
    @JavascriptInterface
    public void log(String str) {
        e.b("[WebView]", str);
    }

    @JavascriptInterface
    public void logV(String str) {
        e.e("[WebView]", str);
    }
}
