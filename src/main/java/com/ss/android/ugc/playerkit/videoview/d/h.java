package com.ss.android.ugc.playerkit.videoview.d;

import com.ss.android.ugc.playerkit.videoview.d.g;
import java.util.List;

public final class h implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private List<g> f77768a;

    /* renamed from: b  reason: collision with root package name */
    private d f77769b;

    /* renamed from: c  reason: collision with root package name */
    private int f77770c;

    public final d a() {
        return this.f77769b;
    }

    public final e a(d dVar) {
        if (this.f77770c < this.f77768a.size()) {
            return this.f77768a.get(this.f77770c).a(new h(this.f77768a, dVar, this.f77770c + 1));
        }
        throw new AssertionError();
    }

    public h(List<g> list, d dVar, int i) {
        this.f77768a = list;
        this.f77769b = dVar;
        this.f77770c = i;
    }
}
