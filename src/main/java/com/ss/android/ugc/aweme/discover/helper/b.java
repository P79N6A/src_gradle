package com.ss.android.ugc.aweme.discover.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42326a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f42327b;

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f42328c;

    public static boolean k() {
        return f42328c;
    }

    public static boolean l() {
        return f42327b;
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36301, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36301, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a() || AbTestManager.a().aE() == 0) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36302, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36302, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a() || AbTestManager.a().aE() != 1) {
            return false;
        }
        return true;
    }

    public static boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36303, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36303, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a() && AbTestManager.a().aF() != 0) {
            z = true;
        }
        return z;
    }

    public static boolean f() {
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36304, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36304, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().aF() == 1) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36305, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36305, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().aF() == 2) {
            z = true;
        }
        return z;
    }

    public static boolean i() {
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36311, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36311, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().at() != 0 || l()) {
            return true;
        }
        return false;
    }

    public static int j() {
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36313, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36313, new Class[0], Integer.TYPE)).intValue();
        }
        return AbTestManager.a().au();
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36298, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36298, new Class[0], Boolean.TYPE)).booleanValue();
        }
        int av = AbTestManager.a().av();
        if ((av == 2 || av == 1) && !a.a()) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36300, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36300, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71821, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71821, new Class[0], Integer.TYPE)).intValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                i = 0;
            } else {
                i = d2.hotSearchRankingItemStyle;
            }
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36309, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36309, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71855, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71855, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = a2.d();
        if (d2 == null) {
            return false;
        }
        return d2.isGuideSearchEnabled();
    }

    public static boolean m() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36314, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36314, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a()) {
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71830, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71830, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                AbTestModel d2 = a2.d();
                if (d2 == null) {
                    z = false;
                } else {
                    z = d2.isSearchMixFeedStyle;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean n() {
        if (PatchProxy.isSupport(new Object[0], null, f42326a, true, 36315, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42326a, true, 36315, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71828, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71828, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = a2.d();
        if (d2 == null) {
            return false;
        }
        return d2.isSearchEmptyOptimizeEnabled;
    }

    static {
        boolean z;
        boolean z2;
        AbTestManager a2 = AbTestManager.a();
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71829, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71829, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                z = false;
            } else {
                z = d2.isDiscoverMvpEnabled();
            }
        }
        f42327b = z;
        AbTestManager a3 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71825, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71825, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d3 = a3.d();
            if (d3 == null) {
                z2 = false;
            } else {
                z2 = d3.isGuessUSearchEnabled;
            }
        }
        if (z2 && !f42327b) {
            z3 = true;
        }
        f42328c = z3;
    }
}
