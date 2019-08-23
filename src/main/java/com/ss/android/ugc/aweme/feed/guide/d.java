package com.ss.android.ugc.aweme.feed.guide;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45398a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f45399b;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f45398a, true, 41225, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45398a, true, 41225, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return AbTestManager.a().aX();
    }

    public static boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f45398a, true, 41226, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45398a, true, 41226, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().br() == 0) {
            z = true;
        }
        return z;
    }

    public static boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f45398a, true, 41230, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45398a, true, 41230, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.a() && AbTestManager.a().ci()) {
            z = true;
        }
        return z;
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f45398a, true, 41228, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45398a, true, 41228, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f45399b) {
            return true;
        }
        if (a.a()) {
            if (!AbTestManager.a().bH()) {
                return true;
            }
            return false;
        } else if (!AbTestManager.a().bs()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f45398a, true, 41229, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45398a, true, 41229, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f45399b) {
            return true;
        }
        if (a.a()) {
            return AbTestManager.a().bH();
        }
        return AbTestManager.a().bs();
    }
}
