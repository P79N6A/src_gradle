package com.ss.android.ugc.aweme.common.ui;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40284a;

    public static void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, null, f40284a, true, 33504, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, null, f40284a, true, 33504, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(view.getContext());
        }
    }

    public static void a(Activity activity, View view) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, view}, null, f40284a, true, 33500, new Class[]{Activity.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, view}, null, f40284a, true, 33500, new Class[]{Activity.class, View.class}, Void.TYPE);
        } else if (activity2 != null) {
            ((InputMethodManager) activity2.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void a(View view, int i) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, 0}, null, f40284a, true, 33499, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, 0}, null, f40284a, true, 33499, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (!inputMethodManager.showSoftInput(view2, 0)) {
            view2.postDelayed(new Runnable(0) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40285a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f40285a, false, 33509, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f40285a, false, 33509, new Class[0], Void.TYPE);
                        return;
                    }
                    inputMethodManager.showSoftInput(view2, 0);
                }
            }, 100);
        }
    }
}
