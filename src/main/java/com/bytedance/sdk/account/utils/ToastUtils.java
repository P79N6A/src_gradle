package com.bytedance.sdk.account.utils;

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.Toast;

public class ToastUtils {
    private ToastUtils() {
    }

    public static void showToast(Context context, @StringRes int i) {
        showToast(context, i, 0);
    }

    public static void showToast(Context context, String str) {
        showToast(context, str, 0);
    }

    public static void showToast(Context context, @StringRes int i, int i2) {
        if (context != null) {
            e.a(Toast.makeText(context, i, i2));
        }
    }

    public static void showToast(Context context, String str, int i) {
        if (context != null) {
            e.a(Toast.makeText(context, str, i));
        }
    }
}
