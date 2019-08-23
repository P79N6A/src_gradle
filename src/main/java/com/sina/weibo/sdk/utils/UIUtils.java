package com.sina.weibo.sdk.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.ss.android.ugc.aweme.utils.eq;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class UIUtils {

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(toast);
            }
            toast.show();
        }
    }

    public static void showAlert(Context context, int i, int i2) {
        if (context != null) {
            showAlert(context, context.getString(i), context.getString(i2));
        }
    }

    public static void showToast(Context context, int i, int i2) {
        if (context != null) {
            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context, i, i2));
        }
    }

    public static void showToastInCenter(Context context, int i, int i2) {
        if (context != null) {
            Toast makeText = Toast.makeText(context, i, i2);
            makeText.setGravity(17, 0, 0);
            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(makeText);
        }
    }

    public static void showAlert(Context context, String str, String str2) {
        if (context != null) {
            new AlertDialog.Builder(context).setTitle(str).setMessage(str2).create().show();
        }
    }

    public static void showToast(Context context, CharSequence charSequence, int i) {
        if (context != null) {
            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context, charSequence, i));
        }
    }
}
