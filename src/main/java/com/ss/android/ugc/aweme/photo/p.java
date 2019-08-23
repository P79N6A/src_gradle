package com.ss.android.ugc.aweme.photo;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.common.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58623a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoModule f58624b;

    /* renamed from: c  reason: collision with root package name */
    private final String f58625c;

    public p(PhotoModule photoModule, String str) {
        this.f58624b = photoModule;
        this.f58625c = str;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58623a, false, 63595, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58623a, false, 63595, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new s<TResult>(this.f58624b, this.f58625c), i.f1052b);
    }
}
