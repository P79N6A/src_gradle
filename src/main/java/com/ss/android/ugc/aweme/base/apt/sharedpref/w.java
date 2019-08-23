package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.q.c;

public final class w implements bm {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34621a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34622b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34623c = c.a(this.f34622b, "MainTabPreferences", 0);

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34621a, false, 24262, new Class[0], Boolean.TYPE)) {
            return this.f34623c.getBoolean("hasReadPhoneStateRequested", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34621a, false, 24262, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f34621a, false, 24264, new Class[0], Boolean.TYPE)) {
            return this.f34623c.getBoolean("hasAccessLocationRequested", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34621a, false, 24264, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f34621a, false, 24298, new Class[0], Boolean.TYPE)) {
            return this.f34623c.getBoolean("secondTabLastLandFollowTab", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34621a, false, 24298, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f34621a, false, 24307, new Class[0], Boolean.TYPE)) {
            return this.f34623c.getBoolean("deviceHasDigged", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34621a, false, 24307, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, f34621a, false, 24309, new Class[0], Boolean.TYPE)) {
            return this.f34623c.getBoolean("hasShowUnloginDiggToast", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34621a, false, 24309, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public w(Context context) {
        this.f34622b = context;
    }

    public final boolean A(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24300, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("shouldShowDiscoveryV3Guide", z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24300, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void B(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24301, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24301, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("shouldShowDiscoveryV3Guide", z);
        edit.apply();
    }

    public final void C(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24306, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24306, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("deviceHasDigged", true);
        edit.apply();
    }

    public final void D(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24308, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24308, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("hasShowUnloginDiggToast", z);
        edit.apply();
    }

    public final void E(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24312, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24312, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("hasLocationPopupShown", z);
        edit.apply();
    }

    public final boolean F(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34621a, false, 24313, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("hasLocationPopupShown", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34621a, false, 24313, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void G(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24314, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24314, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("hasVisitedProfilePage", z);
        edit.apply();
    }

    public final boolean H(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24315, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("hasVisitedProfilePage", z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24315, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f34621a, false, 24249, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34623c.getInt("showHotSpotGuideTime", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f34621a, false, 24249, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34621a, false, 24250, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34621a, false, 24250, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putInt("showHotSpotGuideTime", i);
        edit.apply();
    }

    public final int c(int i) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f34621a, false, 24253, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34623c.getInt("liveSquareGuideShowCount", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f34621a, false, 24253, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34621a, false, 24254, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34621a, false, 24254, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putInt("liveSquareGuideShowCount", i);
        edit.apply();
    }

    public final String e(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34621a, false, 24296, new Class[]{String.class}, String.class)) {
            return this.f34623c.getString("hasClickActivityDot", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34621a, false, 24296, new Class[]{String.class}, String.class);
    }

    public final int f(int i) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f34621a, false, 24305, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34623c.getInt("diggUnloginCount", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f34621a, false, 24305, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void g(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34621a, false, 24310, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34621a, false, 24310, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putString("consumedFeedsCountForLocationPop", str2);
        edit.apply();
    }

    public final String h(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34621a, false, 24311, new Class[]{String.class}, String.class)) {
            return this.f34623c.getString("consumedFeedsCountForLocationPop", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34621a, false, 24311, new Class[]{String.class}, String.class);
    }

    public final boolean i(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24258, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("doubleClickLikeGuideShown", z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24258, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void j(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24259, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24259, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("doubleClickLikeGuideShown", true);
        edit.apply();
    }

    public final boolean k(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34621a, false, 24260, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("hasFollowGuideShown", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34621a, false, 24260, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void l(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24261, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24261, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("hasFollowGuideShown", true);
        edit.apply();
    }

    public final void m(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24263, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24263, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("hasReadPhoneStateRequested", true);
        edit.apply();
    }

    public final void n(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24265, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24265, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("hasAccessLocationRequested", true);
        edit.apply();
    }

    public final void o(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24269, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24269, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("hasClickSearch", true);
        edit.apply();
    }

    public final boolean p(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24276, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("shouldShowPrivacyPolicyDialog", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24276, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void q(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34621a, false, 24277, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34621a, false, 24277, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("shouldShowPrivacyPolicyDialog", false);
        edit.apply();
    }

    public final boolean r(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24280, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("shouldShowLongClickGuide", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24280, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void s(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34621a, false, 24281, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34621a, false, 24281, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("shouldShowLongClickGuide", false);
        edit.apply();
    }

    public final boolean t(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24282, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("shouldShowNewDoubleClickGuide", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24282, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void u(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34621a, false, 24283, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34621a, false, 24283, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("shouldShowNewDoubleClickGuide", false);
        edit.apply();
    }

    public final boolean v(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24288, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("shouldShowDiscoveryGuide", z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24288, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void w(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24289, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24289, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("shouldShowDiscoveryGuide", z);
        edit.apply();
    }

    public final boolean x(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34621a, false, 24292, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("hasClosedActivityLink", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34621a, false, 24292, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void y(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24293, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24293, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("hasClosedActivityLink", z);
        edit.apply();
    }

    public final void z(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24299, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24299, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("secondTabLastLandFollowTab", z);
        edit.apply();
    }

    public final String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34621a, false, 24290, new Class[]{String.class}, String.class)) {
            return this.f34623c.getString("hasClickActivityLink", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34621a, false, 24290, new Class[]{String.class}, String.class);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34621a, false, 24291, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34621a, false, 24291, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putString("hasClickActivityLink", str2);
        edit.apply();
    }

    public final String c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34621a, false, 24294, new Class[]{String.class}, String.class)) {
            return this.f34623c.getString("activityLinkFirstLaunchTime", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34621a, false, 24294, new Class[]{String.class}, String.class);
    }

    public final void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34621a, false, 24295, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34621a, false, 24295, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putString("activityLinkFirstLaunchTime", str2);
        edit.apply();
    }

    public final void e(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34621a, false, 24304, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34621a, false, 24304, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putInt("diggUnloginCount", i);
        edit.apply();
    }

    public final void f(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34621a, false, 24297, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34621a, false, 24297, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putString("hasClickActivityDot", str2);
        edit.apply();
    }

    public final void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24256, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24256, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("liveSquareGuideShowing", z);
        edit.apply();
    }

    public final void h(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24257, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24257, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("shouldShowHotVideoSwipeUpGuide", z);
        edit.apply();
    }

    public final boolean a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24246, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("shouldShowSwipeUpGuide1", z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24246, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24247, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24247, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("shouldShowSwipeUpGuide1", z);
        edit.apply();
    }

    public final boolean c(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34621a, false, 24248, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("shouldShowHotVideoSwipeUpGuide", z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34621a, false, 24248, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean d(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24251, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("shouldShowScrollToFeedFollowGuide", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24251, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34621a, false, 24252, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34621a, false, 24252, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34623c.edit();
        edit.putBoolean("shouldShowScrollToFeedFollowGuide", false);
        edit.apply();
    }

    public final boolean f(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34621a, false, 24255, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34623c.getBoolean("liveSquareGuideShowing", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34621a, false, 24255, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
