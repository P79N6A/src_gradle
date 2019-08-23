package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74241a;

    /* renamed from: b  reason: collision with root package name */
    private final c f74242b;

    d(c cVar) {
        this.f74242b = cVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74241a, false, 86200, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74241a, false, 86200, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f74242b.b(z);
    }
}
