package com.bytedance.android.live.core.utils;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.android.live.uikit.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8238a;

    private static void b(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f8238a, true, 1282, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f8238a, true, 1282, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        activity.getWindow().setFlags(1024, 1024);
        d(activity);
    }

    public static int a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f8238a, true, 1285, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f8238a, true, 1285, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    private static int c(Activity activity) {
        if (!PatchProxy.isSupport(new Object[]{activity}, null, f8238a, true, 1283, new Class[]{Activity.class}, Integer.TYPE)) {
            return activity.getResources().getColor(C0906R.color.a7l);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{activity}, null, f8238a, true, 1283, new Class[]{Activity.class}, Integer.TYPE)).intValue();
    }

    private static void d(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f8238a, true, 1284, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f8238a, true, 1284, new Class[]{Activity.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(c(activity));
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                a.a(activity2, c(activity));
            }
        }
    }

    public static void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f8238a, true, 1281, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f8238a, true, 1281, new Class[]{Activity.class}, Void.TYPE);
        } else if (activity == null || g.a(activity)) {
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                b(activity);
            } else if (Build.VERSION.SDK_INT >= 16) {
                activity.getWindow().setFlags(1024, 1024);
                activity.getWindow().getDecorView().setSystemUiVisibility(4);
                ActionBar actionBar = activity.getActionBar();
                if (actionBar != null) {
                    actionBar.hide();
                }
            } else {
                activity.getWindow().setFlags(1024, 1024);
            }
        }
    }
}
