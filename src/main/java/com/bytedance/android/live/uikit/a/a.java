package com.bytedance.android.live.uikit.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8462a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1745, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1745, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return true;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1746, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1746, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".contains("Ppx");
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1747, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1747, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".equals("cnXg");
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1748, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1748, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "douyin".contains("hotsoon");
    }

    public static boolean e() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1749, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1749, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".equals("cnToutiao");
    }

    public static boolean f() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1750, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1750, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c() || e()) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1751, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1751, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".equals("i18nVigo");
    }

    public static boolean h() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1752, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1752, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".equals("i18nMusically");
    }

    public static boolean i() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1753, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1753, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "cnDouyin".equals("i18nTiktok");
    }

    public static boolean j() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1754, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1754, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (h() || i()) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1755, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1755, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return AdvanceSetting.CLEAR_NOTIFICATION.equals("i18n");
    }

    public static boolean l() {
        if (PatchProxy.isSupport(new Object[0], null, f8462a, true, 1756, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8462a, true, 1756, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (d() || g()) {
            return true;
        }
        return false;
    }
}
