package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.crash.d;
import com.bytedance.crash.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53153a;

    /* renamed from: b  reason: collision with root package name */
    static final g f53154b = new f();

    private f() {
    }

    public final void a(d dVar, String str, Thread thread) {
        if (PatchProxy.isSupport(new Object[]{dVar, str, thread}, this, f53153a, false, 55281, new Class[]{d.class, String.class, Thread.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar, str, thread}, this, f53153a, false, 55281, new Class[]{d.class, String.class, Thread.class}, Void.TYPE);
            return;
        }
        NpthTask.lambda$run$0$NpthTask(dVar, str, thread);
    }
}
