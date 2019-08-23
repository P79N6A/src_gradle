package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.ss.android.ugc.aweme.sdk.IapWalletProxy;
import dagger.internal.c;
import dagger.internal.e;

public final class ba implements c<IIapWalletProxy> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41428a;

    /* renamed from: b  reason: collision with root package name */
    static final ba f41429b = new ba();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41428a, false, 35412, new Class[0], IIapWalletProxy.class)) {
            return (IIapWalletProxy) PatchProxy.accessDispatch(new Object[0], this, f41428a, false, 35412, new Class[0], IIapWalletProxy.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41428a, true, 35413, new Class[0], IIapWalletProxy.class)) {
            return (IIapWalletProxy) PatchProxy.accessDispatch(new Object[0], null, f41428a, true, 35413, new Class[0], IIapWalletProxy.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41428a, true, 35414, new Class[0], IIapWalletProxy.class)) {
                return (IIapWalletProxy) PatchProxy.accessDispatch(new Object[0], null, f41428a, true, 35414, new Class[0], IIapWalletProxy.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, az.f41426a, true, 35410, new Class[0], IIapWalletProxy.class)) {
                obj = (IIapWalletProxy) PatchProxy.accessDispatch(new Object[0], null, az.f41426a, true, 35410, new Class[0], IIapWalletProxy.class);
            } else {
                obj = new IapWalletProxy();
            }
            return (IIapWalletProxy) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
