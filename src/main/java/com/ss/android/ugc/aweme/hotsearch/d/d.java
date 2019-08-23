package com.ss.android.ugc.aweme.hotsearch.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements com.ss.android.ugc.b.a.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49729a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49730b;

    d(c cVar) {
        this.f49730b = cVar;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{4, Integer.valueOf(i2)}, this, f49729a, false, 49817, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{4, Integer.valueOf(i2)}, this, f49729a, false, 49817, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        c cVar = this.f49730b;
        if (cVar.f49726b != null) {
            cVar.f49726b.a();
        }
    }
}
