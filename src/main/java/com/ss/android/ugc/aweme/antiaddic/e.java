package com.ss.android.ugc.aweme.antiaddic;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.common.a.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.c.b;
import com.ss.android.ugc.aweme.antiaddic.c.c;
import com.ss.android.ugc.aweme.antiaddic.c.d;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class e implements WeakHandler.IHandler, g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33387a;

    /* renamed from: c  reason: collision with root package name */
    private static Integer f33388c;

    /* renamed from: d  reason: collision with root package name */
    private static Integer f33389d;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<a> f33390b = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private q f33391e = q.a();

    /* renamed from: f  reason: collision with root package name */
    private WeakHandler f33392f = new WeakHandler(this);
    private boolean g;

    public interface a {
        boolean a(long j, long j2);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f33387a, false, 21709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33387a, false, 21709, new Class[0], Void.TYPE);
            return;
        }
        if (!this.g) {
            this.g = true;
            a(this.f33391e.a(TimeUnit.MILLISECONDS));
        }
    }

    public static int d() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f33387a, true, 21705, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f33387a, true, 21705, new Class[0], Integer.TYPE)).intValue();
        }
        if (f33389d == null) {
            if (c.b()) {
                i = 10000;
            } else {
                i = 60000;
            }
            f33389d = Integer.valueOf(i);
        }
        return f33389d.intValue();
    }

    public final void b() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f33387a, false, 21708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33387a, false, 21708, new Class[0], Void.TYPE);
            return;
        }
        WeakHandler weakHandler = this.f33392f;
        if (PatchProxy.isSupport(new Object[0], null, f33387a, true, 21704, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, f33387a, true, 21704, new Class[0], Integer.TYPE)).intValue();
        } else {
            if (f33388c == null) {
                if (c.b()) {
                    i2 = 20000;
                } else {
                    i2 = 30000;
                }
                f33388c = Integer.valueOf(i2);
            }
            i = f33388c.intValue();
        }
        weakHandler.sendEmptyMessageDelayed(100004, (long) i);
    }

    public e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33387a, false, 21713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33387a, false, 21713, new Class[0], Void.TYPE);
        } else {
            this.f33390b.clear();
        }
        a((a) new g());
        a((a) new f());
        a((a) new com.ss.android.ugc.aweme.antiaddic.lock.a());
        if (PatchProxy.isSupport(new Object[0], null, b.f33381a, true, 22100, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, b.f33381a, true, 22100, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a()) {
            z = true;
        }
        if (z) {
            a((a) new c());
            a((a) new d());
            a((a) new com.ss.android.ugc.aweme.antiaddic.c.a());
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f33387a, false, 21710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33387a, false, 21710, new Class[0], Void.TYPE);
            return;
        }
        this.f33392f.removeMessages(100004);
        if (!this.f33392f.hasMessages(100003)) {
            this.f33392f.sendEmptyMessageDelayed(100003, (long) d());
        }
        if (!this.f33391e.f2357a) {
            this.f33391e.c();
        }
        x.a().ah().a(0L);
    }

    private void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f33387a, false, 21711, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f33387a, false, 21711, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!this.f33390b.contains(aVar)) {
            this.f33390b.add(aVar);
        }
    }

    private void a(long j) {
        final long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f33387a, false, 21706, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f33387a, false, 21706, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33393a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f33393a, false, 21714, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f33393a, false, 21714, new Class[0], Void.TYPE);
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<a> it2 = e.this.f33390b.iterator();
                while (it2.hasNext()) {
                    it2.next().a(currentTimeMillis, j2);
                }
            }
        });
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f33387a, false, 21707, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f33387a, false, 21707, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message.what) {
            case 100003:
                this.f33392f.sendEmptyMessageDelayed(100003, (long) d());
                a(this.f33391e.a(TimeUnit.MILLISECONDS));
                return;
            case 100004:
                this.f33392f.removeMessages(100003);
                this.f33391e.e();
                c.a().g = "";
                c.a().f33376f = false;
                break;
        }
    }
}
