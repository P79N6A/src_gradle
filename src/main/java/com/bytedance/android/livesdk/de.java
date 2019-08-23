package com.bytedance.android.livesdk;

import com.bytedance.android.live.base.b.c;
import com.bytedance.android.livesdkapi.host.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class de implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13679a;

    /* renamed from: b  reason: collision with root package name */
    static final c f13680b = new de();

    private de() {
    }

    public final long a() {
        if (!PatchProxy.isSupport(new Object[0], this, f13679a, false, 3037, new Class[0], Long.TYPE)) {
            return ((l) TTLiveSDKContext.getService(l.class)).c();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f13679a, false, 3037, new Class[0], Long.TYPE)).longValue();
    }
}
