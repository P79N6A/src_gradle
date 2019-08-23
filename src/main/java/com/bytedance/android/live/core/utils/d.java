package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8251a;

    @Nullable
    public static Activity a(Context context) {
        Context context2 = context;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f8251a, true, 972, new Class[]{Context.class}, Activity.class)) {
                return (Activity) PatchProxy.accessDispatch(new Object[]{context2}, null, f8251a, true, 972, new Class[]{Context.class}, Activity.class);
            } else if (context2 == null) {
                return null;
            } else {
                if (context2 instanceof Activity) {
                    return (Activity) context2;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    return null;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
    }

    @Nullable
    public static FragmentActivity b(Context context) {
        Context context2 = context;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f8251a, true, 973, new Class[]{Context.class}, FragmentActivity.class)) {
                return (FragmentActivity) PatchProxy.accessDispatch(new Object[]{context2}, null, f8251a, true, 973, new Class[]{Context.class}, FragmentActivity.class);
            } else if (context2 == null) {
                return null;
            } else {
                if (context2 instanceof FragmentActivity) {
                    return (FragmentActivity) context2;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    return null;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
    }
}
