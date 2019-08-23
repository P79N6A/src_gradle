package com.bytedance.android.live.core.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7841a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f7841a, true, 366, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f7841a, true, 366, new Class[]{String.class}, String.class);
        }
        return str2 + "_all";
    }

    public static String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f7841a, true, 367, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f7841a, true, 367, new Class[]{String.class}, String.class);
        }
        return str2 + "_error";
    }
}
