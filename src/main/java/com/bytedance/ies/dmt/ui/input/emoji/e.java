package com.bytedance.ies.dmt.ui.input.emoji;

import android.content.Context;
import com.bytedance.ies.dmt.ui.input.c;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public c f20396a;

    /* renamed from: b  reason: collision with root package name */
    public int f20397b;

    /* renamed from: c  reason: collision with root package name */
    public List<c> f20398c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private Context f20399d;

    /* renamed from: e  reason: collision with root package name */
    private b f20400e;

    public final int c() {
        return this.f20398c.size();
    }

    public final int a() {
        if (this.f20396a == null) {
            return 0;
        }
        return this.f20396a.d();
    }

    public final int b() {
        if (this.f20396a == null) {
            return 0;
        }
        return this.f20396a.c();
    }

    public e(Context context) {
        this.f20399d = context;
        this.f20400e = new b(context);
        this.f20398c.add(this.f20400e);
        a(0);
    }

    public final void a(int i) {
        if (i >= 0 && i < c()) {
            this.f20397b = i;
            this.f20396a = this.f20398c.get(this.f20397b);
        }
    }
}
