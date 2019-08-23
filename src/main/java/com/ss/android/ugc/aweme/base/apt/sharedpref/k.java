package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.h.a;
import com.ss.android.ugc.aweme.q.c;

public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34585a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34586b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34587c = c.a(this.f34586b, "CommercePreferences", 0);

    /* renamed from: d  reason: collision with root package name */
    private Keva f34588d = Keva.getRepoFromSp(this.f34586b, "CommercePreferences", 0);

    public k(Context context) {
        this.f34586b = context;
    }

    public final long a(long j) {
        if (!PatchProxy.isSupport(new Object[]{0L}, this, f34585a, false, 24179, new Class[]{Long.TYPE}, Long.TYPE)) {
            return this.f34588d.getLong("settingNotifyId", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{0L}, this, f34585a, false, 24179, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
    }

    public final void b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f34585a, false, 24180, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f34585a, false, 24180, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putLong("settingNotifyId", j);
        edit.apply();
        this.f34588d.storeLong("settingNotifyId", j);
    }

    public final long c(long j) {
        if (!PatchProxy.isSupport(new Object[]{0L}, this, f34585a, false, 24181, new Class[]{Long.TYPE}, Long.TYPE)) {
            return this.f34588d.getLong("portfolioBubbleId", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{0L}, this, f34585a, false, 24181, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
    }

    public final void d(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f34585a, false, 24182, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f34585a, false, 24182, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putLong("portfolioBubbleId", j);
        edit.apply();
        this.f34588d.storeLong("portfolioBubbleId", j);
    }

    public final String e(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34585a, false, 24197, new Class[]{String.class}, String.class)) {
            return this.f34588d.getString("isOrderInfoUpdateInSlideSettingMap", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34585a, false, 24197, new Class[]{String.class}, String.class);
    }

    public final void f(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34585a, false, 24198, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34585a, false, 24198, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putString("isOrderInfoUpdateInSlideSettingMap", str);
        edit.apply();
        this.f34588d.storeString("isOrderInfoUpdateInSlideSettingMap", str);
    }

    public final String g(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34585a, false, 24199, new Class[]{String.class}, String.class)) {
            return this.f34588d.getString("shoppingDesc", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34585a, false, 24199, new Class[]{String.class}, String.class);
    }

    public final void h(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34585a, false, 24200, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34585a, false, 24200, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putString("shoppingDesc", str);
        edit.apply();
        this.f34588d.storeString("shoppingDesc", str);
    }

    public final boolean i(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34585a, false, 24173, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("shouldShowEasyGoHint", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34585a, false, 24173, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void j(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24174, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24174, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("shouldShowEasyGoHint", false);
        edit.apply();
        this.f34588d.storeBoolean("shouldShowEasyGoHint", false);
    }

    public final boolean k(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24175, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("hasUserReadTaobaoProtocol", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24175, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void l(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34585a, false, 24176, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34585a, false, 24176, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("hasUserReadTaobaoProtocol", z);
        edit.apply();
        this.f34588d.storeBoolean("hasUserReadTaobaoProtocol", z);
    }

    public final boolean m(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34585a, false, 24185, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("shouldShowDiscoveryRankAutoScroll", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34585a, false, 24185, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void n(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24186, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24186, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("shouldShowDiscoveryRankAutoScroll", false);
        edit.apply();
        this.f34588d.storeBoolean("shouldShowDiscoveryRankAutoScroll", false);
    }

    public final boolean o(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34585a, false, 24189, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("shouldNeedGuideFootprint", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34585a, false, 24189, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void p(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24190, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24190, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("shouldNeedGuideFootprint", false);
        edit.apply();
        this.f34588d.storeBoolean("shouldNeedGuideFootprint", false);
    }

    public final boolean q(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34585a, false, 24191, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("isFirstShowCommonOrderTip", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34585a, false, 24191, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void r(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24192, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24192, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("isFirstShowCommonOrderTip", false);
        edit.apply();
        this.f34588d.storeBoolean("isFirstShowCommonOrderTip", false);
    }

    public final String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34585a, false, 24193, new Class[]{String.class}, String.class)) {
            return this.f34588d.getString("lastOrderTimeMap", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34585a, false, 24193, new Class[]{String.class}, String.class);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34585a, false, 24194, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34585a, false, 24194, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putString("lastOrderTimeMap", str);
        edit.apply();
        this.f34588d.storeString("lastOrderTimeMap", str);
    }

    public final String c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34585a, false, 24195, new Class[]{String.class}, String.class)) {
            return this.f34588d.getString("isOrderInfoUpdateInProfileMap", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34585a, false, 24195, new Class[]{String.class}, String.class);
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34585a, false, 24196, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34585a, false, 24196, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putString("isOrderInfoUpdateInProfileMap", str);
        edit.apply();
        this.f34588d.storeString("isOrderInfoUpdateInProfileMap", str);
    }

    public final boolean e(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34585a, false, 24169, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("shouldShowKaolaHint", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34585a, false, 24169, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24170, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24170, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("shouldShowKaolaHint", false);
        edit.apply();
        this.f34588d.storeBoolean("shouldShowKaolaHint", false);
    }

    public final boolean g(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34585a, false, 24171, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("shouldShowUnKnownHint", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34585a, false, 24171, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void h(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24172, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24172, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("shouldShowUnKnownHint", false);
        edit.apply();
        this.f34588d.storeBoolean("shouldShowUnKnownHint", false);
    }

    public final boolean a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34585a, false, 24165, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("shouldShowTaobaoHint", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34585a, false, 24165, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24166, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24166, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("shouldShowTaobaoHint", false);
        edit.apply();
        this.f34588d.storeBoolean("shouldShowTaobaoHint", false);
    }

    public final boolean c(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34585a, false, 24167, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34588d.getBoolean("shouldShowJingDongHint", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34585a, false, 24167, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34585a, false, 24168, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34585a, false, 24168, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34587c.edit();
        edit.putBoolean("shouldShowJingDongHint", false);
        edit.apply();
        this.f34588d.storeBoolean("shouldShowJingDongHint", false);
    }
}
