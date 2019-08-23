package com.alibaba.sdk.android.httpdns.a;

import android.content.Context;
import java.util.List;

public class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f5080a;

    a(Context context) {
        this.f5080a = new d(context);
    }

    public List<e> a() {
        return this.f5080a.b();
    }

    public void a(e eVar) {
        this.f5080a.a(eVar);
    }

    public void b(e eVar) {
        this.f5080a.b(eVar.k, eVar.j);
    }
}
