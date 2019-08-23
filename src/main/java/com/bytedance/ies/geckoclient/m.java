package com.bytedance.ies.geckoclient;

import com.bytedance.ies.geckoclient.model.d;
import java.util.ArrayList;
import java.util.Map;

public final class m extends a {

    /* renamed from: b  reason: collision with root package name */
    private l f20773b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, d> f20774c;

    /* renamed from: d  reason: collision with root package name */
    private i f20775d;

    /* renamed from: e  reason: collision with root package name */
    private f f20776e;

    public final void run() {
        this.f20773b.a(this.f20774c);
        l lVar = this.f20773b;
        Map<String, d> map = this.f20774c;
        String str = this.f20776e.f20739d;
        String str2 = this.f20776e.f20738c;
        ArrayList<d> arrayList = new ArrayList<>();
        if (map.size() > 0) {
            arrayList.addAll(map.values());
        }
        if (arrayList.size() > 0) {
            for (d a2 : arrayList) {
                l.a(a2, str, str2);
            }
        }
        this.f20775d.d();
    }

    public m(l lVar, Map<String, d> map, f fVar) {
        super(null);
        this.f20773b = lVar;
        this.f20774c = map;
        this.f20775d = fVar;
        this.f20776e = fVar;
    }
}
