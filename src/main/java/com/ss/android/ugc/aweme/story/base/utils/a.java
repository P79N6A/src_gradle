package com.ss.android.ugc.aweme.story.base.utils;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71942a;

    public static FragmentActivity a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71942a, true, 82278, new Class[]{Context.class}, FragmentActivity.class)) {
            return (FragmentActivity) PatchProxy.accessDispatch(new Object[]{context}, null, f71942a, true, 82278, new Class[]{Context.class}, FragmentActivity.class);
        }
        for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof FragmentActivity) {
                return (FragmentActivity) context2;
            }
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }
}
