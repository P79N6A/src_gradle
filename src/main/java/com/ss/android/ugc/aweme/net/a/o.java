package com.ss.android.ugc.aweme.net.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56863a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f56864b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f56865c;

    o(Context context, boolean z) {
        this.f56864b = context;
        this.f56865c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f56863a, false, 60903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56863a, false, 60903, new Class[0], Void.TYPE);
            return;
        }
        j.a(this.f56864b, this.f56865c);
    }
}
