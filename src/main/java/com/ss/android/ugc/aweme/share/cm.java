package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;

public final class cm {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64992a;

    /* renamed from: b  reason: collision with root package name */
    static Integer f64993b;

    static SharedPreferences a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f64992a, true, 73371, new Class[]{Context.class}, SharedPreferences.class)) {
            return c.a(context2, "aweme-share-internal", 0);
        }
        return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context2}, null, f64992a, true, 73371, new Class[]{Context.class}, SharedPreferences.class);
    }

    public static void a(Context context, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f64992a, true, 73373, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f64992a, true, 73373, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (f64993b == null || f64993b.intValue() != i2) {
            f64993b = Integer.valueOf(i);
            a(context).edit().putInt("share_internal_share_mode", i2).apply();
        }
    }
}
