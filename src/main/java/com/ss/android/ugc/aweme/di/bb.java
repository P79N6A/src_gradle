package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.ss.android.ugc.aweme.wallet.WalletMainProxy;
import dagger.internal.c;
import dagger.internal.e;

public final class bb implements c<IWalletMainProxy> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41430a;

    /* renamed from: b  reason: collision with root package name */
    static final bb f41431b = new bb();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41430a, false, 35415, new Class[0], IWalletMainProxy.class)) {
            return (IWalletMainProxy) PatchProxy.accessDispatch(new Object[0], this, f41430a, false, 35415, new Class[0], IWalletMainProxy.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41430a, true, 35416, new Class[0], IWalletMainProxy.class)) {
            return (IWalletMainProxy) PatchProxy.accessDispatch(new Object[0], null, f41430a, true, 35416, new Class[0], IWalletMainProxy.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41430a, true, 35417, new Class[0], IWalletMainProxy.class)) {
                return (IWalletMainProxy) PatchProxy.accessDispatch(new Object[0], null, f41430a, true, 35417, new Class[0], IWalletMainProxy.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, az.f41426a, true, 35409, new Class[0], IWalletMainProxy.class)) {
                obj = (IWalletMainProxy) PatchProxy.accessDispatch(new Object[0], null, az.f41426a, true, 35409, new Class[0], IWalletMainProxy.class);
            } else {
                obj = new WalletMainProxy();
            }
            return (IWalletMainProxy) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
