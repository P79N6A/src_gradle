package com.ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class cg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67167a;

    public static void a(@Nullable Dialog dialog) {
        if (PatchProxy.isSupport(new Object[]{dialog}, null, f67167a, true, 76587, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, f67167a, true, 76587, new Class[]{Dialog.class}, Void.TYPE);
        } else if (dialog != null) {
            a(dialog.getWindow());
        }
    }

    public static void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f67167a, true, 76589, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f67167a, true, 76589, new Class[]{Activity.class}, Void.TYPE);
        } else if (activity2 != null && activity.getCurrentFocus() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity2.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }

    public static void a(@Nullable Window window) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{window2}, null, f67167a, true, 76588, new Class[]{Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{window2}, null, f67167a, true, 76588, new Class[]{Window.class}, Void.TYPE);
        } else if (window2 != null) {
            window2.setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT < 19) {
                window.getDecorView().setSystemUiVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                window.getDecorView().setSystemUiVisibility(4102);
            }
        }
    }
}
