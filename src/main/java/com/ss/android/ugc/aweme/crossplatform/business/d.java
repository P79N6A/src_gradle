package com.ss.android.ugc.aweme.crossplatform.business;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.base.c;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sdk.IWalletService;

public class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40768a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    final c f40769b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    private final BusinessService f40770c = new BusinessService(this);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40768a, false, 34247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40768a, false, 34247, new Class[0], Void.TYPE);
            return;
        }
        ((WalletBusiness) this.f40770c.a(WalletBusiness.class)).a();
    }

    d(@NonNull c cVar) {
        this.f40769b = cVar;
    }

    @MainThread
    public final <T extends BusinessService.Business> T a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, f40768a, false, 34245, new Class[]{Class.class}, BusinessService.Business.class)) {
            return this.f40770c.a(cls2);
        }
        return (BusinessService.Business) PatchProxy.accessDispatch(new Object[]{cls2}, this, f40768a, false, 34245, new Class[]{Class.class}, BusinessService.Business.class);
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f40768a, false, 34248, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f40768a, false, 34248, new Class[]{a.class}, Void.TYPE);
        } else if (aVar2 == null || aVar2.f40805a.f40796d == null) {
        } else {
            int intValue = aVar2.f40805a.f40794b.intValue();
            if (!(intValue == 3 || intValue == 1)) {
                z = false;
            }
            if (z && aVar2.f40805a.f40796d.endsWith("pay")) {
                WalletBusiness walletBusiness = (WalletBusiness) this.f40770c.a(WalletBusiness.class);
                if (PatchProxy.isSupport(new Object[0], walletBusiness, WalletBusiness.f40754a, false, 34281, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], walletBusiness, WalletBusiness.f40754a, false, 34281, new Class[0], Void.TYPE);
                    return;
                }
                IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
                if (iWalletService != null) {
                    iWalletService.syncWallet();
                }
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f40768a, false, 34246, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f40768a, false, 34246, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((WalletBusiness) this.f40770c.a(WalletBusiness.class)).f40755b = true;
    }
}
