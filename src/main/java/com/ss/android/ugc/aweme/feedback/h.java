package com.ss.android.ugc.aweme.feedback;

import com.bytedance.apm.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47177a;

    /* renamed from: b  reason: collision with root package name */
    private final long f47178b;

    /* renamed from: c  reason: collision with root package name */
    private final long f47179c;

    h(long j, long j2) {
        this.f47178b = j;
        this.f47179c = j2;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f47177a, false, 43793, new Class[0], Object.class)) {
            return a.a(ALog.sConfig.f27862d, this.f47178b, this.f47179c, "ActiveUpload", j.f47185b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f47177a, false, 43793, new Class[0], Object.class);
    }
}
