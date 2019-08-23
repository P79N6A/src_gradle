package com.ss.android.ugc.aweme.photo.setfilter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.av;
import com.ss.android.ugc.aweme.filter.h;

public final /* synthetic */ class c implements av {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58786a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectSetFilterLayout f58787b;

    c(EffectSetFilterLayout effectSetFilterLayout) {
        this.f58787b = effectSetFilterLayout;
    }

    public final void a(h hVar, boolean z) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f58786a, false, 63842, new Class[]{h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, Byte.valueOf(z)}, this, f58786a, false, 63842, new Class[]{h.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f58787b.a(hVar2, z);
    }
}
