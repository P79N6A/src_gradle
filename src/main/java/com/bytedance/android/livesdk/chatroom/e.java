package com.bytedance.android.livesdk.chatroom;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f10009b;

    /* renamed from: c  reason: collision with root package name */
    public long f10010c;

    public final long a() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f10009b, false, 3906, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f10009b, false, 3906, new Class[0], Long.TYPE)).longValue();
        }
        if (this.f10010c > 0) {
            j = SystemClock.uptimeMillis() - this.f10010c;
        } else {
            j = 0;
        }
        this.f10010c = 0;
        return j;
    }
}
