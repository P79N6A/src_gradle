package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.URI;

public final class ew {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75853a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75853a, true, 88647, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75853a, true, 88647, new Class[]{String.class}, String.class);
        }
        try {
            return new URI(str2).getHost();
        } catch (Throwable unused) {
            return "";
        }
    }
}
