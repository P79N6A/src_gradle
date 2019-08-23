package com.bytedance.scene.b;

import java.util.ArrayList;
import java.util.List;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private List<b> f22080a = new ArrayList();

    public final b c() {
        b bVar = new b();
        a(bVar);
        return bVar;
    }

    public final void b() {
        for (b b2 : this.f22080a) {
            b2.b();
        }
        super.b();
    }

    private void a(b bVar) {
        j.a();
        this.f22080a.add(bVar);
    }
}
