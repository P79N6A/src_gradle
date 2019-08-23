package com.ss.android.ugc.aweme.main;

import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010#\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010$\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/main/SafeMainTabPreferences;", "", "()V", "mPreferences", "Lcom/ss/android/ugc/aweme/main/MainTabPreferences;", "getConsumedFeedsForLocationPopup", "", "getDiggUnloginCount", "", "getHasShowContentLanguageDialogUids", "getShowHotSpotGuideTime", "hasShowUnloginDiggToast", "", "hasShownLocationPopup", "hasVisitedProfilePage", "defaultValue", "isDeviceHasDigged", "recordDeviceHasDigged", "", "setConsumedFeedsForLocationPopup", "feedsCount", "setDiggUnloginCount", "newValue", "setHasShowContentLanguageDialogUids", "setHasShowUnloginDiggToast", "hasShow", "setHasShownLocationPopup", "setHasVisitedProfilePage", "setShouldShowDiscoveryGuide", "setShouldShowDiscoveryV3Guide", "setShouldShowHotVideoSwipeUpGuide", "setShouldShowSwipeUpGuide", "setShowHotSpotGuideTime", "shouldShowDiscoveryGuide", "shouldShowDiscoveryV3Guide", "shouldShowHotVideoSwipeUpGuide", "shouldShowSwipeUpGuide", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class bt {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54646a;

    /* renamed from: b  reason: collision with root package name */
    public final bm f54647b;

    public bt() {
        Object a2 = c.a(k.a(), bm.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "SharedPreferencesHelper.…bPreferences::class.java)");
        this.f54647b = (bm) a2;
    }

    public final int a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f54646a, false, 57638, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54646a, false, 57638, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            i = this.f54647b.a(0);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
        return i;
    }

    public final int b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f54646a, false, 57647, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54646a, false, 57647, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            i = this.f54647b.f(0);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
        return i;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f54646a, false, 57648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54646a, false, 57648, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f54647b.C(true);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f54646a, false, 57649, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54646a, false, 57649, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            z = this.f54647b.d();
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
        return z;
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f54646a, false, 57650, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54646a, false, 57650, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            z = this.f54647b.e();
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
        return z;
    }

    public final boolean f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f54646a, false, 57652, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54646a, false, 57652, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            z = this.f54647b.F(false);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
        return z;
    }

    @NotNull
    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, f54646a, false, 57655, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f54646a, false, 57655, new Class[0], String.class);
        }
        String str = "";
        try {
            String h = this.f54647b.h("");
            Intrinsics.checkExpressionValueIsNotNull(h, "mPreferences.getConsumedFeedsForLocationPopup(\"\")");
            str = h;
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
        return str;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54646a, false, 57646, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54646a, false, 57646, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.f54647b.e(i);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final boolean b(boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f54646a, false, 57634, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f54646a, false, 57634, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            z2 = this.f54647b.a(true);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
            z2 = false;
        }
        return z2;
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f54646a, false, 57635, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f54646a, false, 57635, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.f54647b.b(false);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final boolean d(boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f54646a, false, 57636, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f54646a, false, 57636, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            z2 = this.f54647b.c(true);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
            z2 = false;
        }
        return z2;
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f54646a, false, 57637, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f54646a, false, 57637, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.f54647b.h(false);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final boolean f(boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f54646a, false, 57640, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f54646a, false, 57640, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            z2 = this.f54647b.v(true);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
            z2 = false;
        }
        return z2;
    }

    public final void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f54646a, false, 57641, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f54646a, false, 57641, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.f54647b.w(false);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final boolean h(boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f54646a, false, 57642, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f54646a, false, 57642, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            z2 = this.f54647b.A(true);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
            z2 = false;
        }
        return z2;
    }

    public final void i(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f54646a, false, 57643, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f54646a, false, 57643, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.f54647b.B(false);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54646a, false, 57654, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54646a, false, 57654, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "feedsCount");
        try {
            this.f54647b.g(str2);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final boolean a(boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f54646a, false, 57632, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f54646a, false, 57632, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            z2 = this.f54647b.H(false);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
            z2 = false;
        }
        return z2;
    }
}
