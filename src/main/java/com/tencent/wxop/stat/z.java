package com.tencent.wxop.stat;

import com.tencent.wxop.stat.a.f;
import java.util.List;

public final class z implements ai {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f79950a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f79951b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t f79952c;

    z(t tVar, List list, boolean z) {
        this.f79952c = tVar;
        this.f79950a = list;
        this.f79951b = z;
    }

    public final void a() {
        g.b();
        t tVar = this.f79952c;
        List list = this.f79950a;
        boolean z = this.f79951b;
        if (tVar.f79927a != null) {
            tVar.f79927a.a(new v(tVar, list, z, true));
        }
    }

    public final void b() {
        g.c();
        t tVar = this.f79952c;
        List list = this.f79950a;
        boolean z = this.f79951b;
        if (tVar.f79927a != null) {
            f fVar = tVar.f79927a;
            u uVar = new u(tVar, list, 1, z, true);
            fVar.a(uVar);
        }
    }
}
