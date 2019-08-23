package com.bytedance.android.livesdk.browser.c;

import com.bytedance.android.livesdk.browser.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract /* synthetic */ class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9322a;

    public static b.C0073b a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f9322a, true, 3428, new Class[]{String.class}, b.C0073b.class)) {
            return new b.C0073b(str2, (byte) 0);
        }
        return (b.C0073b) PatchProxy.accessDispatch(new Object[]{str2}, null, f9322a, true, 3428, new Class[]{String.class}, b.C0073b.class);
    }

    public static b.a b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f9322a, true, 3429, new Class[]{String.class}, b.a.class)) {
            return new b.a(str2, (byte) 0);
        }
        return (b.a) PatchProxy.accessDispatch(new Object[]{str2}, null, f9322a, true, 3429, new Class[]{String.class}, b.a.class);
    }
}
