package com.bytedance.android.livesdk.feed.roomdetector;

import com.bytedance.android.livesdk.feed.roomdetector.a;
import com.bytedance.android.livesdk.feed.roomdetector.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e implements a, b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14376a;

    /* renamed from: b  reason: collision with root package name */
    private b f14377b;

    /* renamed from: c  reason: collision with root package name */
    private a.C0102a f14378c;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14376a, false, 8871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14376a, false, 8871, new Class[0], Void.TYPE);
            return;
        }
        this.f14377b.a();
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f14376a, false, 8873, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14376a, false, 8873, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f14378c != null && this.f14378c.a()) {
            z = true;
        }
        return z;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f14376a, false, 8874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14376a, false, 8874, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14378c != null) {
            this.f14378c.b();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f14376a, false, 8875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14376a, false, 8875, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14378c != null) {
            this.f14378c.c();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14376a, false, 8870, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14376a, false, 8870, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.f14377b;
        if (PatchProxy.isSupport(new Object[0], bVar, b.f14366a, false, 8863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, b.f14366a, false, 8863, new Class[0], Void.TYPE);
            return;
        }
        if (!bVar.f14368c) {
            bVar.f14368c = true;
            bVar.b();
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14376a, false, 8872, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14376a, false, 8872, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f14378c != null) {
            this.f14378c.a(i);
        }
    }

    public final void a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f14376a, false, 8876, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f14376a, false, 8876, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f14378c != null) {
            this.f14378c.a(j3, j4);
        }
    }

    public e(long j, long j2, boolean z, a.C0102a aVar) {
        b bVar = new b(j, j2, "", true, this);
        this.f14377b = bVar;
        this.f14378c = aVar;
    }
}
