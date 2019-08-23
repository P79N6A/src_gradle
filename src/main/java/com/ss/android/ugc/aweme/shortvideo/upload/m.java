package com.ss.android.ugc.aweme.shortvideo.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71024a;

    /* renamed from: b  reason: collision with root package name */
    private final i f71025b;

    m(i iVar) {
        this.f71025b = iVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f71024a, false, 80786, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71024a, false, 80786, new Class[0], Void.TYPE);
            return;
        }
        this.f71025b.a();
    }
}
