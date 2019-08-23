package com.ss.android.ugc.aweme.base.widget.recyclerview.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.e;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35194a;

    /* renamed from: b  reason: collision with root package name */
    public final List<e> f35195b;

    /* renamed from: c  reason: collision with root package name */
    public b f35196c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f35197d = true;

    /* renamed from: e  reason: collision with root package name */
    public e f35198e;

    /* renamed from: f  reason: collision with root package name */
    private e f35199f;

    public e a() {
        if (PatchProxy.isSupport(new Object[0], this, f35194a, false, 25605, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f35194a, false, 25605, new Class[0], e.class);
        }
        if (this.f35198e == null) {
            this.f35198e = this.f35196c.a();
        }
        return this.f35198e;
    }

    public final e b() {
        if (PatchProxy.isSupport(new Object[0], this, f35194a, false, 25607, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f35194a, false, 25607, new Class[0], e.class);
        }
        if (this.f35199f == null) {
            this.f35199f = this.f35196c.b();
        }
        return this.f35199f;
    }

    public a(List<e> list, b bVar) {
        this.f35195b = list;
        this.f35196c = bVar;
    }
}
