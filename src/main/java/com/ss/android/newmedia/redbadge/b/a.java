package com.ss.android.newmedia.redbadge.b;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30323a;

    /* renamed from: c  reason: collision with root package name */
    private static a f30324c;

    /* renamed from: b  reason: collision with root package name */
    public PushMultiProcessSharedProvider.b f30325b = PushMultiProcessSharedProvider.a(this.f30326d);

    /* renamed from: d  reason: collision with root package name */
    private Context f30326d;

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f30323a, false, 18832, new Class[0], Boolean.TYPE)) {
            return this.f30325b.a("is_desktop_red_badge_show", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30323a, false, 18832, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f30323a, false, 18834, new Class[0], String.class)) {
            return this.f30325b.a("desktop_red_badge_args", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f30323a, false, 18834, new Class[0], String.class);
    }

    public final long c() {
        if (!PatchProxy.isSupport(new Object[0], this, f30323a, false, 18836, new Class[0], Long.TYPE)) {
            return this.f30325b.a("red_badge_last_request_time", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f30323a, false, 18836, new Class[0], Long.TYPE)).longValue();
    }

    public final int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f30323a, false, 18838, new Class[0], Integer.TYPE)) {
            return this.f30325b.a("red_badge_next_query_interval", 600);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30323a, false, 18838, new Class[0], Integer.TYPE)).intValue();
    }

    public final String e() {
        if (!PatchProxy.isSupport(new Object[0], this, f30323a, false, 18840, new Class[0], String.class)) {
            return this.f30325b.a("red_badge_last_time_paras", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f30323a, false, 18840, new Class[0], String.class);
    }

    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f30323a, false, 18842, new Class[0], String.class)) {
            return this.f30325b.a("red_badge_last_last_time_paras", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f30323a, false, 18842, new Class[0], String.class);
    }

    public final int g() {
        if (!PatchProxy.isSupport(new Object[0], this, f30323a, false, 18844, new Class[0], Integer.TYPE)) {
            return this.f30325b.a("red_badge_launch_times", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30323a, false, 18844, new Class[0], Integer.TYPE)).intValue();
    }

    public final int h() {
        if (!PatchProxy.isSupport(new Object[0], this, f30323a, false, 18846, new Class[0], Integer.TYPE)) {
            return this.f30325b.a("red_badge_show_times", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30323a, false, 18846, new Class[0], Integer.TYPE)).intValue();
    }

    private a(Context context) {
        this.f30326d = context.getApplicationContext();
    }

    public static synchronized a a(Context context) {
        Context context2 = context;
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f30323a, true, 18830, new Class[]{Context.class}, a.class)) {
                a aVar = (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f30323a, true, 18830, new Class[]{Context.class}, a.class);
                return aVar;
            }
            if (f30324c == null) {
                f30324c = new a(context2);
            }
            a aVar2 = f30324c;
            return aVar2;
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f30323a, false, 18843, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f30323a, false, 18843, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("red_badge_launch_times", i).a();
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f30323a, false, 18845, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f30323a, false, 18845, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("red_badge_show_times", i).a();
    }

    public final void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30323a, false, 18849, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f30323a, false, 18849, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("rom", str2).a();
    }

    public final void e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30323a, false, 18851, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f30323a, false, 18851, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("red_badge_last_valid_response", str2).a();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f30323a, false, 18837, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f30323a, false, 18837, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("red_badge_next_query_interval", i).a();
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30323a, false, 18841, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f30323a, false, 18841, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("red_badge_last_last_time_paras", str2).a();
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30323a, false, 18847, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f30323a, false, 18847, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("session_key", str2).a();
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f30323a, false, 18835, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f30323a, false, 18835, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("red_badge_last_request_time", j2).a();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30323a, false, 18839, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f30323a, false, 18839, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f30325b.a().a("red_badge_last_time_paras", str2).a();
    }
}
