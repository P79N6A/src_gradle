package com.ss.android.ugc.aweme.poi.ui.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.k;

public final /* synthetic */ class d implements k.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60860a;

    /* renamed from: b  reason: collision with root package name */
    private final b f60861b;

    d(b bVar) {
        this.f60861b = bVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60860a, false, 66662, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60860a, false, 66662, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f60861b.b(!z);
    }
}
