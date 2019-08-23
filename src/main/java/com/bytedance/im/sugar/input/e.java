package com.bytedance.im.sugar.input;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class e {
    public static void a(Activity activity, View view) {
        if (activity != null && view != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
