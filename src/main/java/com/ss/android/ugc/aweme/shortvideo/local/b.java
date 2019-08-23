package com.ss.android.ugc.aweme.shortvideo.local;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68344a;

    /* renamed from: b  reason: collision with root package name */
    private final UploadButton f68345b;

    b(UploadButton uploadButton) {
        this.f68345b = uploadButton;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68344a, false, 77545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68344a, false, 77545, new Class[0], Void.TYPE);
            return;
        }
        this.f68345b.a();
    }
}
