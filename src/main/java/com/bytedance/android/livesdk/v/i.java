package com.bytedance.android.livesdk.v;

import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements h.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17676a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f17677b;

    i(Class cls) {
        this.f17677b = cls;
    }

    public final h.b.a a(h.b.a aVar) {
        h.b.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17676a, false, 13228, new Class[]{h.b.a.class}, h.b.a.class)) {
            return h.a(this.f17677b, aVar2);
        }
        return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17676a, false, 13228, new Class[]{h.b.a.class}, h.b.a.class);
    }
}
