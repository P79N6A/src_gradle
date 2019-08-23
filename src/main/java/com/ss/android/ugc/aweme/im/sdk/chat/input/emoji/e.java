package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.c;
import com.ss.android.ugc.aweme.im.sdk.resources.b;
import com.ss.android.ugc.aweme.im.sdk.resources.k;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50561a;

    /* renamed from: b  reason: collision with root package name */
    public c f50562b;

    /* renamed from: c  reason: collision with root package name */
    public List<c> f50563c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f50564d;

    /* renamed from: e  reason: collision with root package name */
    private a f50565e;

    /* renamed from: f  reason: collision with root package name */
    private i f50566f;

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f50561a, false, 50837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50561a, false, 50837, new Class[0], Void.TYPE);
            return;
        }
        if (k.b()) {
            if (this.f50566f == null) {
                this.f50566f = new i();
            }
            this.f50563c.add(this.f50566f);
        }
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f50561a, false, 50841, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50561a, false, 50841, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f50562b == null) {
            return 0;
        } else {
            return this.f50562b.e();
        }
    }

    public final int d() {
        if (PatchProxy.isSupport(new Object[0], this, f50561a, false, 50842, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50561a, false, 50842, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f50562b == null) {
            return 0;
        } else {
            return this.f50562b.d();
        }
    }

    public final int e() {
        if (!PatchProxy.isSupport(new Object[0], this, f50561a, false, 50848, new Class[0], Integer.TYPE)) {
            return this.f50563c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50561a, false, 50848, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50561a, false, 50838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50561a, false, 50838, new Class[0], Void.TYPE);
            return;
        }
        this.f50563c.clear();
        this.f50563c.add(this.f50565e);
        f();
        LinkedHashMap<com.ss.android.ugc.aweme.im.sdk.resources.model.e, List<a>> linkedHashMap = b.a().f52262b;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry next : linkedHashMap.entrySet()) {
                g gVar = new g();
                gVar.f50579e = (com.ss.android.ugc.aweme.im.sdk.resources.model.e) next.getKey();
                gVar.f50580f = (List) next.getValue();
                a((c) gVar);
            }
        }
        if (this.f50564d >= e()) {
            a(0);
        }
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f50561a, false, 50839, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50561a, false, 50839, new Class[0], Integer.TYPE)).intValue();
        }
        int i = 0;
        for (c next : this.f50563c) {
            if (next == this.f50562b) {
                return this.f50562b.d() + i;
            }
            i += next.e();
        }
        return 0;
    }

    public final void a(List<a> list) {
        if (this.f50566f != null) {
            this.f50566f.f50580f = list;
        }
    }

    public e(Context context) {
        this.f50565e = new a(context);
        this.f50563c.add(this.f50565e);
        f();
        a(0);
    }

    private void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f50561a, false, 50840, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f50561a, false, 50840, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f50563c.add(cVar2);
    }

    public final c c(int i) {
        int i2 = i;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50846, new Class[]{Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50846, new Class[]{Integer.TYPE}, c.class);
        } else if (i2 < 0) {
            return null;
        } else {
            for (c next : this.f50563c) {
                i3 += next.e();
                if (i2 < i3) {
                    return next;
                }
            }
            return null;
        }
    }

    public final List<c> d(int i) {
        int i2 = i;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50847, new Class[]{Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50847, new Class[]{Integer.TYPE}, List.class);
        } else if (i2 < 0) {
            return new ArrayList();
        } else {
            for (c next : this.f50563c) {
                if (i2 < next.e() + i3) {
                    return next.b(i2 - i3);
                }
                i3 += next.e();
            }
            return new ArrayList();
        }
    }

    public final c e(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50849, new Class[]{Integer.TYPE}, c.class)) {
            return this.f50563c.get(i);
        }
        return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50849, new Class[]{Integer.TYPE}, c.class);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50843, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50843, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i >= 0 && i < e()) {
            this.f50564d = i;
            this.f50562b = this.f50563c.get(this.f50564d);
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50844, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50561a, false, 50844, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i >= 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f50563c.size(); i3++) {
                c cVar = this.f50563c.get(i3);
                if (i < cVar.e() + i2) {
                    this.f50564d = i3;
                    this.f50562b = cVar;
                    this.f50562b.a(i - i2);
                    return;
                }
                i2 += cVar.e();
            }
        }
    }
}
