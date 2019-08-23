package com.bytedance.android.livesdk.feed.network;

import com.bytedance.android.livesdk.feed.services.b;
import com.bytedance.retrofit2.Retrofit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14305a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<Class, Object> f14306b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private Retrofit f14307c;

    public d() {
        Retrofit retrofit;
        com.bytedance.android.livesdk.feed.services.d a2 = com.bytedance.android.livesdk.feed.services.d.a();
        if (PatchProxy.isSupport(new Object[0], a2, com.bytedance.android.livesdk.feed.services.d.f14391a, false, 8896, new Class[0], Retrofit.class)) {
            retrofit = (Retrofit) PatchProxy.accessDispatch(new Object[0], a2, com.bytedance.android.livesdk.feed.services.d.f14391a, false, 8896, new Class[0], Retrofit.class);
        } else {
            retrofit = (Retrofit) b.a(Retrofit.class);
        }
        this.f14307c = retrofit;
    }

    public final <T> T a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f14305a, false, 8791, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls}, this, f14305a, false, 8791, new Class[]{Class.class}, Object.class);
        } else if (this.f14306b.contains(cls)) {
            return this.f14306b.get(cls);
        } else {
            return this.f14307c.create(cls);
        }
    }
}
