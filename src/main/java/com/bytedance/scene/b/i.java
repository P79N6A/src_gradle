package com.bytedance.scene.b;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class i {
    public static boolean a(View view) {
        if (view == null || !((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0)) {
            return false;
        }
        return true;
    }
}
