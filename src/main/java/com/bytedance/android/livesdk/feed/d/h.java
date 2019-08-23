package com.bytedance.android.livesdk.feed.d;

import com.bytedance.android.live.base.model.b.c;
import com.bytedance.android.live.base.model.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14085a;

    /* renamed from: b  reason: collision with root package name */
    public c f14086b;

    public final long getId() {
        return 2131170539;
    }

    public final String getMixId() {
        if (!PatchProxy.isSupport(new Object[0], this, f14085a, false, 8603, new Class[0], String.class)) {
            return String.valueOf(getId());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f14085a, false, 8603, new Class[0], String.class);
    }
}
