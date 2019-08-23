package com.ss.android.ugc.aweme.plugin.g;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.b.a;
import com.bytedance.frameworks.plugin.pm.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.plugin.b.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59348a;

    public static void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f59348a, true, 64730, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f59348a, true, 64730, new Class[]{String.class}, Void.TYPE);
            return;
        }
        c.e(str);
        a.a(c.b(str2, 0), (ComponentInfo) null);
    }

    public static int b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f59348a, true, 64729, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f59348a, true, 64729, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        com.bytedance.frameworks.plugin.a.b a2 = com.bytedance.frameworks.plugin.d.b.a().a(str2);
        if (a2 != null) {
            return a2.o.getIndex();
        }
        return 1;
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f59348a, true, 64728, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f59348a, true, 64728, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.equals(str2, "com.ss.android.ugc.aweme.shortvideo_so") && !TextUtils.equals(str2, "com.ss.android.ugc.aweme.livestream_so") && !TextUtils.equals(str2, "com.ss.android.ugc.aweme.miniappplugin") && !TextUtils.equals(str2, "com.ss.android.ugc.aweme.fusionfuelplugin") && !TextUtils.equals(str2, "com.ss.android.ugc.aweme.player_pluginv3")) {
            return c.b(str);
        } else {
            if (b(str) == 8) {
                return true;
            }
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f59348a, true, 64732, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f59348a, true, 64732, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.plugin.e.b b2 = f.a(context).b(str2);
        int c2 = c.c(str);
        if (!(b2 == null || b2.f59319b == null || b2.f59319b.f59325b <= c2)) {
            z = true;
        }
        return z;
    }
}
