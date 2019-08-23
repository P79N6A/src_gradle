package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.support.annotation.RestrictTo;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockAboutFragment;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockEnterFragment;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockOptionsFragment;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockSetFragment;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockAboutFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockOptionsFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockEnterFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockOptionsFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockSetFragmentV2;
import com.ss.android.ugc.aweme.mobile.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class TimeLockFragmentFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33469a;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f33469a, true, 21917, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f33469a, true, 21917, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return false;
    }

    public static Fragment a() {
        if (PatchProxy.isSupport(new Object[0], null, f33469a, true, 21918, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], null, f33469a, true, 21918, new Class[0], Fragment.class);
        }
        return b(0);
    }

    public static Fragment a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f33469a, true, 21916, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f33469a, true, 21916, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (b()) {
            return a.a(TimeLockAboutFragment.class).a();
        } else {
            if (i == 0) {
                return a.a(TimeLockAboutFragmentV2.class).a();
            }
            return a.a(TeenagerLockAboutFragmentV2.class).a();
        }
    }

    public static Fragment b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f33469a, true, 21919, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f33469a, true, 21919, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (b()) {
            return a.a(TimeLockEnterFragment.class).a();
        } else {
            return a.a(TimeLockEnterFragmentV2.class).a("type_close", i).a();
        }
    }

    public static Fragment c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f33469a, true, 21920, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f33469a, true, 21920, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (b()) {
            return a.a(TimeLockOptionsFragment.class).a();
        } else {
            if (i == 0) {
                return a.a(TimeLockOptionsFragmentV2.class).a();
            }
            return a.a(TeenagerLockOptionsFragmentV2.class).a();
        }
    }

    public static Fragment a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f33469a, true, 21921, new Class[]{Boolean.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f33469a, true, 21921, new Class[]{Boolean.TYPE}, Fragment.class);
        } else if (b()) {
            return a.a(TimeLockSetFragment.class).a("from_change_pwd", z2).a();
        } else {
            return a.a(TimeLockSetFragmentV2.class).a("from_change_pwd", z2).a();
        }
    }
}
