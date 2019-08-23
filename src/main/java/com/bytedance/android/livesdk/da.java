package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.g;
import com.bytedance.android.livesdkapi.service.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class da implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13672a;

    public final c a() {
        if (!PatchProxy.isSupport(new Object[0], this, f13672a, false, 3022, new Class[0], c.class)) {
            return TTLiveSDKContext.getLiveService();
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f13672a, false, 3022, new Class[0], c.class);
    }

    public final <T> T a(Class<T> cls) {
        if (!PatchProxy.isSupport(new Object[]{cls}, this, f13672a, false, 3023, new Class[]{Class.class}, Object.class)) {
            return TTLiveSDKContext.getService(cls);
        }
        return PatchProxy.accessDispatch(new Object[]{cls}, this, f13672a, false, 3023, new Class[]{Class.class}, Object.class);
    }
}
