package com.ss.android.ugc.aweme.main.g;

import android.os.Build;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54773a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f54774b;

    private static boolean d() {
        if (f54774b == 1) {
            return true;
        }
        return false;
    }

    public static boolean a() {
        if (f54774b == 2) {
            return true;
        }
        return false;
    }

    static {
        AbTestManager a2 = AbTestManager.a();
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71770, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71770, new Class[0], Integer.TYPE)).intValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 != null) {
                i = d2.removeStoryStrategy;
            }
        }
        f54774b = i;
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f54773a, true, 58169, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54773a, true, 58169, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return b();
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f54773a, true, 58168, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54773a, true, 58168, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (MainPageExperimentHelper.o() || b.i() || (!d() && !a())) {
            return false;
        }
        return true;
    }

    public static void a(int i, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i2 = i;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), marginLayoutParams2}, null, f54773a, true, 58176, new Class[]{Integer.TYPE, ViewGroup.MarginLayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), marginLayoutParams2}, null, f54773a, true, 58176, new Class[]{Integer.TYPE, ViewGroup.MarginLayoutParams.class}, Void.TYPE);
            return;
        }
        marginLayoutParams2.leftMargin = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams2.setMarginStart(i2);
        }
    }

    public static void b(int i, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i2 = i;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), marginLayoutParams2}, null, f54773a, true, 58177, new Class[]{Integer.TYPE, ViewGroup.MarginLayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), marginLayoutParams2}, null, f54773a, true, 58177, new Class[]{Integer.TYPE, ViewGroup.MarginLayoutParams.class}, Void.TYPE);
            return;
        }
        marginLayoutParams2.rightMargin = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams2.setMarginEnd(i2);
        }
    }
}
