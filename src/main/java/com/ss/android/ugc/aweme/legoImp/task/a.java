package com.ss.android.ugc.aweme.legoImp.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.anrmonitor.ANRError;
import com.ss.android.anrmonitor.a;

public final /* synthetic */ class a implements a.C0327a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53144a;

    /* renamed from: b  reason: collision with root package name */
    static final a.C0327a f53145b = new a();

    private a() {
    }

    public final void a(ANRError aNRError) {
        if (PatchProxy.isSupport(new Object[]{aNRError}, this, f53144a, false, 55241, new Class[]{ANRError.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aNRError}, this, f53144a, false, 55241, new Class[]{ANRError.class}, Void.TYPE);
            return;
        }
        AnrTask.lambda$run$0$AnrTask(aNRError);
    }
}
