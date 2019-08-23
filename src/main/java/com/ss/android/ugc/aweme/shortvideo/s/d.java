package com.ss.android.ugc.aweme.shortvideo.s;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.ugc.aweme.shortvideo.s.c;

public final /* synthetic */ class d implements IESCameraInterface.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69141a;

    /* renamed from: b  reason: collision with root package name */
    private final c.AnonymousClass1 f69142b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f69143c;

    d(c.AnonymousClass1 r1, boolean z) {
        this.f69142b = r1;
        this.f69143c = z;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69141a, false, 81264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69141a, false, 81264, new Class[0], Void.TYPE);
            return;
        }
        c.this.f69137f.a(this.f69143c ? 0.0f : 14.874f);
    }
}
