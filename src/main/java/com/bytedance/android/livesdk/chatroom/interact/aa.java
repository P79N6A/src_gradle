package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.interact.c.gy;
import com.bytedance.android.livesdk.chatroom.interact.contract.c;
import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.model.a.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class aa implements a.C0089a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10282a;

    /* renamed from: b  reason: collision with root package name */
    private Room f10283b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.android.livesdk.chatroom.interact.d.a f10284c;

    /* renamed from: d  reason: collision with root package name */
    private a f10285d;

    /* renamed from: e  reason: collision with root package name */
    private List<c.a> f10286e = new ArrayList();

    public interface a {
        void a(int i);
    }

    public final void c(List<k> list) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10282a, false, 4440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10282a, false, 4440, new Class[0], Void.TYPE);
            return;
        }
        this.f10284c.a((a.C0089a) this);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10282a, false, 4441, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10282a, false, 4441, new Class[0], Void.TYPE);
            return;
        }
        this.f10284c.b((a.C0089a) this);
    }

    public final void b(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10282a, false, 4446, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10282a, false, 4446, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f10285d.a(list.size());
    }

    public final void a(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10282a, false, 4445, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10282a, false, 4445, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (c.a next : this.f10286e) {
            j a2 = this.f10284c.a(next.c(), next.d());
            if (a2 != null) {
                next.a(a2);
            }
        }
    }

    private c.a c(long j, int i) {
        long j2 = j;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, f10282a, false, 4443, new Class[]{Long.TYPE, Integer.TYPE}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, f10282a, false, 4443, new Class[]{Long.TYPE, Integer.TYPE}, c.a.class);
        }
        for (c.a next : this.f10286e) {
            if ((j2 > 0 && next.c() == j2) || (i2 > 0 && next.d() == i2)) {
                return next;
            }
        }
        return null;
    }

    public final void a(long j, int i) {
        long j2 = j;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, f10282a, false, 4449, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, f10282a, false, 4449, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        for (c.a next : this.f10286e) {
            if ((j2 > 0 && next.c() == j2) || (i2 > 0 && next.d() == i2)) {
                this.f10286e.remove(next);
                return;
            }
        }
    }

    public final c.a b(long j, int i) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, f10282a, false, 4442, new Class[]{Long.TYPE, Integer.TYPE}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, f10282a, false, 4442, new Class[]{Long.TYPE, Integer.TYPE}, c.a.class);
        }
        j b2 = this.f10284c.b(j2, i);
        if (b2 == null) {
            this.f10284c.c();
        }
        c.a c2 = c(j, i);
        if (c2 == null) {
            if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), b2}, this, f10282a, false, 4444, new Class[]{Long.TYPE, Integer.TYPE, j.class}, c.a.class)) {
                c2 = (c.a) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), b2}, this, f10282a, false, 4444, new Class[]{Long.TYPE, Integer.TYPE, j.class}, c.a.class);
            } else {
                gy gyVar = new gy(this.f10283b, j, i, b2);
                this.f10286e.add(gyVar);
                c2 = gyVar;
            }
        } else {
            c2.a(b2);
        }
        return c2;
    }

    public final void a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f10282a, false, 4447, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f10282a, false, 4447, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
        } else if (j3 > 0) {
            for (c.a next : this.f10286e) {
                if (next.c() == j3) {
                    next.a(j4);
                    return;
                }
            }
        }
    }

    public aa(Room room, com.bytedance.android.livesdk.chatroom.interact.d.a aVar, a aVar2) {
        this.f10283b = room;
        this.f10285d = aVar2;
        this.f10284c = aVar;
    }

    public final void a(long j, int i, boolean z) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f10282a, false, 4448, new Class[]{Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Byte.valueOf(z)}, this, f10282a, false, 4448, new Class[]{Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        c.a c2 = c(j, i);
        if (c2 != null) {
            c2.a(z ^ true ? 1 : 0);
        }
    }
}
