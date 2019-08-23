package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.extract.e;

public final /* synthetic */ class ga implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67846a;

    /* renamed from: b  reason: collision with root package name */
    static final e.a f67847b = new ga();

    private ga() {
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67846a, false, 74719, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67846a, false, 74719, new Class[]{Boolean.TYPE}, Void.TYPE);
        }
    }
}
