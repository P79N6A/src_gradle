package com.ss.android.ugc.aweme.setting;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63972a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f63973b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f63974c;

    public static boolean a(Context context) {
        boolean z;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f63972a, true, 72046, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f63972a, true, 72046, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (!f63973b) {
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            f63974c = c.a(context2, "aweme_app", 0).getBoolean("use_dynamic_cover", z);
            f63973b = true;
        }
        return f63974c;
    }

    public static void a(Context context, boolean z) {
        Context context2 = context;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f63972a, true, 72047, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, null, f63972a, true, 72047, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        c.a(context2, "aweme_app", 0).edit().putBoolean("use_dynamic_cover", z2).apply();
        f63974c = z2;
    }
}
