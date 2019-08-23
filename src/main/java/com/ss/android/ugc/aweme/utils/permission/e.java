package com.ss.android.ugc.aweme.utils.permission;

import android.support.v4.content.ContextCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75940a;

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f75940a, true, 88786, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75940a, true, 88786, new Class[0], Integer.TYPE)).intValue();
        }
        if (a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    public static int b() {
        if (PatchProxy.isSupport(new Object[0], null, f75940a, true, 88787, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75940a, true, 88787, new Class[0], Integer.TYPE)).intValue();
        }
        if (a("android.permission.ACCESS_FINE_LOCATION") || a("android.permission.ACCESS_COARSE_LOCATION")) {
            return 1;
        }
        return 2;
    }

    private static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75940a, true, 88788, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f75940a, true, 88788, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (ContextCompat.checkSelfPermission(k.a(), str2) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
