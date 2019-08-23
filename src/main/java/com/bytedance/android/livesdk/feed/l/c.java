package com.bytedance.android.livesdk.feed.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14220a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f14220a, true, 8974, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f14220a, true, 8974, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return true;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f14220a, true, 8975, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f14220a, true, 8975, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".contains("Ppx");
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f14220a, true, 8977, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f14220a, true, 8977, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "douyin".contains("hotsoon");
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f14220a, true, 8980, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f14220a, true, 8980, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".equals("i18nVigo");
    }

    public static boolean e() {
        if (PatchProxy.isSupport(new Object[0], null, f14220a, true, 8983, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f14220a, true, 8983, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (f() || g()) {
            return true;
        }
        return false;
    }

    private static boolean f() {
        if (PatchProxy.isSupport(new Object[0], null, f14220a, true, 8981, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f14220a, true, 8981, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".equals("i18nMusically");
    }

    private static boolean g() {
        if (PatchProxy.isSupport(new Object[0], null, f14220a, true, 8982, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f14220a, true, 8982, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".equals("i18nTiktok");
    }
}
