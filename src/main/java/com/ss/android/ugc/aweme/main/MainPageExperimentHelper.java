package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MainPageExperimentHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54220a;

    @Retention(RetentionPolicy.SOURCE)
    @interface MainPageSecondTab {
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface NearByTabPosition {
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57378, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57378, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a() && AbTestManager.a().bC() == 1) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57380, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57380, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().bC() == 3) {
            z = true;
        }
        return z;
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57381, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57381, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a() || b()) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57382, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57382, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return d();
    }

    public static boolean h() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57386, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57386, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (f() == 0 || f() == 2) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57387, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57387, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (r() == 101) {
            z = true;
        }
        return z;
    }

    public static boolean k() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57389, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57389, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a() || c()) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57390, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57390, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a() && !b() && !TimeLockRuler.isTeenModeON()) {
            z = true;
        }
        return z;
    }

    public static boolean m() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57392, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57392, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a();
    }

    public static boolean n() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57393, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57393, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a();
    }

    public static boolean o() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57394, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57394, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a() || b()) {
            return true;
        }
        return false;
    }

    public static boolean p() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57395, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57395, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a();
    }

    public static boolean q() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57396, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57396, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return c();
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57379, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57379, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.a()) {
            return false;
        }
        if (AbTestManager.a().bC() == 2 || AbTestManager.a().bC() == 3) {
            return true;
        }
        return false;
    }

    public static int f() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57383, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57383, new Class[0], Integer.TYPE)).intValue();
        }
        if (a.a()) {
            return 10;
        }
        if (a()) {
            return 1;
        }
        if (b()) {
            return 2;
        }
        return 0;
    }

    @Constants.MainPageTabMode
    public static int g() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57385, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57385, new Class[0], Integer.TYPE)).intValue();
        }
        if (a.a()) {
            throw new IllegalArgumentException();
        } else if (c()) {
            return 3;
        } else {
            if (a()) {
                return 1;
            }
            return 2;
        }
    }

    public static boolean j() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57388, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57388, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TimeLockRuler.isTeenModeON()) {
            if (a()) {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71976, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71976, new Class[0], Integer.TYPE)).intValue();
                } else if (a2.x != null) {
                    i = a2.x.f63977c;
                } else {
                    a2.x = a2.bB();
                    i = a2.x.f63977c;
                }
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static int r() {
        if (PatchProxy.isSupport(new Object[0], null, f54220a, true, 57384, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f54220a, true, 57384, new Class[0], Integer.TYPE)).intValue();
        }
        if (a.a()) {
            return 100;
        }
        if (a()) {
            return 102;
        }
        return BaseLoginOrRegisterActivity.o;
    }
}
