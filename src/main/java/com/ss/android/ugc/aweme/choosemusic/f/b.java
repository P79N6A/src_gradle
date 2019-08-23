package com.ss.android.ugc.aweme.choosemusic.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.b.a.d;

public final /* synthetic */ class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35894a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35895b;

    b(a aVar) {
        this.f35895b = aVar;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{4, Integer.valueOf(i2)}, this, f35894a, false, 26766, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{4, Integer.valueOf(i2)}, this, f35894a, false, 26766, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f35895b.a(i2);
    }
}
