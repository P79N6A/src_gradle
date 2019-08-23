package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.sdk.WalletService;
import dagger.internal.c;
import dagger.internal.e;

public final class bc implements c<IWalletService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41432a;

    /* renamed from: b  reason: collision with root package name */
    static final bc f41433b = new bc();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41432a, false, 35418, new Class[0], IWalletService.class)) {
            return (IWalletService) PatchProxy.accessDispatch(new Object[0], this, f41432a, false, 35418, new Class[0], IWalletService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41432a, true, 35419, new Class[0], IWalletService.class)) {
            return (IWalletService) PatchProxy.accessDispatch(new Object[0], null, f41432a, true, 35419, new Class[0], IWalletService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41432a, true, 35420, new Class[0], IWalletService.class)) {
                return (IWalletService) PatchProxy.accessDispatch(new Object[0], null, f41432a, true, 35420, new Class[0], IWalletService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, az.f41426a, true, 35411, new Class[0], IWalletService.class)) {
                obj = (IWalletService) PatchProxy.accessDispatch(new Object[0], null, az.f41426a, true, 35411, new Class[0], IWalletService.class);
            } else {
                obj = new WalletService();
            }
            return (IWalletService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
