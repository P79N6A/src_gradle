package com.bytedance.android.livesdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17570a;

    public static int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f17570a, true, 13719, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, null, f17570a, true, 13719, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
