package com.bytedance.android.livesdk.live.a.a;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b implements com.ss.ugc.live.c.a.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15788a;

    public final void a(String str, Throwable th) {
        String str2 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str2, th2}, this, f15788a, false, 10299, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, th2}, this, f15788a, false, 10299, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a.a("live-stream-sdk", str2, th2);
    }
}
