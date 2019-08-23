package com.ali.auth.third.ui.support;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import java.util.Map;

public interface ActivityResultHandler {
    void onActivityResult(int i, int i2, int i3, Intent intent, Activity activity, Map<Class<?>, Object> map, WebView webView);
}
