package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.sharedpref.f;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47065a;

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40078, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40078, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return e.d().a("has_receive_new_coupon", false);
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40080, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40080, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return e.d().a("show_coupon_guide_pop", false);
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40082, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40082, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return e.d().a("show_upload_img_tip_dialog", true);
    }

    public static void e() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40084, new Class[0], Void.TYPE);
            return;
        }
        f d2 = e.d();
        d2.b("live_bubble_display_times_today", d2.a("live_bubble_display_times_today", 0) + 1);
    }

    public static void f() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40086, new Class[0], Void.TYPE);
            return;
        }
        f d2 = e.d();
        d2.b("live_bubble_display_times_totally", d2.a("live_bubble_display_times_totally", 0) + 1);
    }

    public static long g() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40087, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40087, new Class[0], Long.TYPE)).longValue();
        }
        return e.d().a("live_bubble_last_time", 0);
    }

    public static void h() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40088, new Class[0], Void.TYPE);
        } else {
            e.d().b("live_bubble_last_time", System.currentTimeMillis());
        }
    }

    public static void i() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40090, new Class[0], Void.TYPE);
            return;
        }
        f d2 = e.d();
        d2.b("live_bubble_force_display_times_today", d2.a("live_bubble_force_display_times_today", 0) + 1);
    }

    public static void j() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40093, new Class[0], Void.TYPE);
            return;
        }
        f d2 = e.d();
        d2.b("live_bubble_force_display_times_totally", d2.a("live_bubble_force_display_times_totally", 0) + 1);
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f47065a, true, 40061, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47065a, true, 40061, new Class[0], Boolean.TYPE)).booleanValue();
        }
        f d2 = e.d();
        if (!d2.a("enter_music_guide_available", true) || (!a.a() && d2.a("cold_start_times", 0) < 2)) {
            return false;
        }
        return true;
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f47065a, true, 40077, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f47065a, true, 40077, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e.d().b("has_receive_new_coupon", z);
    }

    public static void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, f47065a, true, 40079, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, f47065a, true, 40079, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e.d().b("show_coupon_guide_pop", true);
    }

    public static void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, null, f47065a, true, 40081, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, null, f47065a, true, 40081, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e.d().b("show_upload_img_tip_dialog", false);
    }

    public static void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f47065a, true, 40096, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f47065a, true, 40096, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e.d().b("live_bubble_force_last_state", z);
    }
}
