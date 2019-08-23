package com.ss.android.ugc.aweme.feedback;

import com.bytedance.apm.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;

public final /* synthetic */ class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47184a;

    /* renamed from: b  reason: collision with root package name */
    static final c f47185b = new j();

    private j() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47184a, false, 43795, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47184a, false, 43795, new Class[0], Void.TYPE);
            return;
        }
        ALog.flush();
        ALog.forceLogSharding();
    }
}
