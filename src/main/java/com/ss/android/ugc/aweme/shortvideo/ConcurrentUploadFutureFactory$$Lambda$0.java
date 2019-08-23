package com.ss.android.ugc.aweme.shortvideo;

import android.support.v4.os.CancellationSignal;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ConcurrentUploadFutureFactory$$Lambda$0 implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65333a;

    /* renamed from: b  reason: collision with root package name */
    private final an f65334b;

    ConcurrentUploadFutureFactory$$Lambda$0(an anVar) {
        this.f65334b = anVar;
    }

    public final void onCancel() {
        if (PatchProxy.isSupport(new Object[0], this, f65333a, false, 74031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65333a, false, 74031, new Class[0], Void.TYPE);
            return;
        }
        an anVar = this.f65334b;
        if (!anVar.f65625c) {
            anVar.f65625c = true;
            anVar.f65626d.c();
        }
    }
}
