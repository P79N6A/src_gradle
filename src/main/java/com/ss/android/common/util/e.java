package com.ss.android.common.util;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.MultiProcessSharedProvider;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2451a;

    public static String a(Context context, int i) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{context, 2}, null, f2451a, true, 15946, new Class[]{Context.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, 2}, null, f2451a, true, 15946, new Class[]{Context.class, Integer.TYPE}, String.class);
        }
        try {
            MultiProcessSharedProvider.b b2 = MultiProcessSharedProvider.b(context);
            if (b2 == null) {
                return "";
            }
            str = b2.a("dns", "");
            if (str instanceof String) {
                str2 = String.valueOf(str);
            } else {
                str2 = "";
            }
            return str2;
        } catch (Exception unused) {
            str = "";
        }
    }

    public static void a(Context context, int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str2}, null, f2451a, true, 15945, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), str2}, null, f2451a, true, 15945, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        try {
            MultiProcessSharedProvider.b b2 = MultiProcessSharedProvider.b(context);
            if (b2 != null) {
                MultiProcessSharedProvider.a a2 = b2.a();
                switch (i) {
                    case 1:
                        a2.a("ssids", str2);
                        break;
                    case 2:
                        a2.a("dns", str2);
                        break;
                }
                Logger.debug();
                a2.a();
            }
        } catch (Exception unused) {
        }
    }
}
