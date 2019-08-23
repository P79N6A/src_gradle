package com.ss.android.ugc.aweme.photo;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.common.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class q implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58720a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoModule f58721b;

    /* renamed from: c  reason: collision with root package name */
    private final String f58722c;

    q(PhotoModule photoModule, String str) {
        this.f58721b = photoModule;
        this.f58722c = str;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58720a, false, 63596, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58720a, false, 63596, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new r<TResult>(this.f58721b, i, this.f58722c), i.f1052b);
    }
}
