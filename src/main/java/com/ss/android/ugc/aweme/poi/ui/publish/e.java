package com.ss.android.ugc.aweme.poi.ui.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.a;

public final /* synthetic */ class e implements a.C0736a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60862a;

    /* renamed from: b  reason: collision with root package name */
    private final b f60863b;

    e(b bVar) {
        this.f60863b = bVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60862a, false, 66663, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60862a, false, 66663, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.f60863b;
        bVar.a(!z);
        if (bVar.f60853e != null) {
            bVar.f60853e.setEnabled(!z);
        }
    }
}
