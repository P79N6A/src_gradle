package com.ss.android.ugc.aweme.shortvideo.i;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68198a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68199b;

    d(a aVar) {
        this.f68199b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68198a, false, 78290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68198a, false, 78290, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f68199b;
        aVar.e();
        aVar.m = com.ss.android.ugc.aweme.shortvideo.view.d.b(aVar.f68176b, aVar.f68176b.getResources().getString(C0906R.string.c83));
        aVar.m.setIndeterminate(true);
    }
}
