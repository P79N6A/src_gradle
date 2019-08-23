package com.ss.android.ugc.aweme.live.authentication.b;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.authentication.b.a;
import com.ss.android.ugc.aweme.live.authentication.b.a.e;
import java.util.ArrayList;
import java.util.List;

public final class b implements a.C0618a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53311a;

    /* renamed from: b  reason: collision with root package name */
    private int f53312b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f53313c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private e f53314d;

    public final void b() {
        this.f53312b = 0;
    }

    public final e a() {
        return this.f53314d;
    }

    @SuppressLint({"LongLogTag"})
    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f53311a, false, 55642, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f53311a, false, 55642, new Class[]{e.class}, Void.TYPE);
        } else if (this.f53312b < this.f53313c.size()) {
            this.f53313c.get(this.f53312b).a(new b(this.f53312b + 1, this.f53313c, eVar));
        }
    }

    public b(int i, List<a> list, e eVar) {
        this.f53312b = i;
        this.f53313c.addAll(list);
        this.f53314d = eVar;
    }
}
