package com.ss.android.ugc.aweme.net;

import com.bytedance.ies.net.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import okhttp3.OkHttpClient;

public final class z implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57045a;

    public final OkHttpClient a() {
        if (!PatchProxy.isSupport(new Object[0], this, f57045a, false, 60782, new Class[0], OkHttpClient.class)) {
            return y.a().b();
        }
        return (OkHttpClient) PatchProxy.accessDispatch(new Object[0], this, f57045a, false, 60782, new Class[0], OkHttpClient.class);
    }

    public final OkHttpClient b() {
        if (!PatchProxy.isSupport(new Object[0], this, f57045a, false, 60783, new Class[0], OkHttpClient.class)) {
            return y.a().b();
        }
        return (OkHttpClient) PatchProxy.accessDispatch(new Object[0], this, f57045a, false, 60783, new Class[0], OkHttpClient.class);
    }
}
