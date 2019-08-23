package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.facebook.react.bridge.ReactContext;

public class TranslucentModalHostView extends ReactModalHostView {
    @TargetApi(23)
    private boolean isDark() {
        Activity currentActivity = ((ReactContext) getContext()).getCurrentActivity();
        if (currentActivity != null && (currentActivity.getWindow().getDecorView().getSystemUiVisibility() & 8192) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void showOrUpdate() {
        super.showOrUpdate();
        Dialog dialog = getDialog();
        if (dialog != null) {
            setStatusBarTranslucent(dialog.getWindow(), true);
            setStatusBarColor(dialog.getWindow(), 0);
            if (Build.VERSION.SDK_INT >= 23) {
                setStatusBarStyle(dialog.getWindow(), isDark());
            }
        }
    }

    public TranslucentModalHostView(Context context) {
        super(context);
    }

    public static void setStatusBarColor(Window window, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    public static void setStatusBarStyle(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            if (z) {
                i = 8192;
            } else {
                i = 0;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    public static void setStatusBarTranslucent(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = window.getDecorView();
            if (z) {
                decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    @TargetApi(21)
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
                    }
                });
            } else {
                decorView.setOnApplyWindowInsetsListener(null);
            }
            ViewCompat.requestApplyInsets(decorView);
        }
    }
}
