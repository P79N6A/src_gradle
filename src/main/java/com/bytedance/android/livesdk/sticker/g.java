package com.bytedance.android.livesdk.sticker;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class g extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f17281c;

    /* renamed from: b  reason: collision with root package name */
    private long f17282b;

    /* renamed from: d  reason: collision with root package name */
    private long f17283d;

    public void a() {
    }

    public void a(int i, String str) {
    }

    public void b() {
    }

    public void b(int i, String str) {
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f17281c, false, 13349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17281c, false, 13349, new Class[0], Void.TYPE);
            return;
        }
        this.f17282b = SystemClock.uptimeMillis();
    }

    public final long d() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f17281c, false, 13350, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f17281c, false, 13350, new Class[0], Long.TYPE)).longValue();
        }
        if (this.f17282b > 0) {
            j = SystemClock.uptimeMillis() - this.f17282b;
        } else {
            j = 0;
        }
        this.f17282b = 0;
        return j;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f17281c, false, 13351, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17281c, false, 13351, new Class[0], Void.TYPE);
            return;
        }
        this.f17283d = SystemClock.uptimeMillis();
    }

    public final long f() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f17281c, false, 13352, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f17281c, false, 13352, new Class[0], Long.TYPE)).longValue();
        }
        if (this.f17283d > 0) {
            j = SystemClock.uptimeMillis() - this.f17283d;
        } else {
            j = 0;
        }
        this.f17283d = 0;
        return j;
    }
}
