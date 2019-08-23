package com.ss.android.ugc.aweme.wallet.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.w.a.b;
import com.ss.android.ugc.aweme.wallet.model.WalletEntranceResponse;

public final class c extends b<b, a> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76557a;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76557a, false, 89802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76557a, false, 89802, new Class[0], Void.TYPE);
            return;
        }
        ((b) this.f76546d).a();
        ((a) this.f76547e).aq_();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f76557a, false, 89804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76557a, false, 89804, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            WalletEntranceResponse walletEntranceResponse = (WalletEntranceResponse) ((b) this.f76546d).mData;
            if (walletEntranceResponse != null) {
                ((a) this.f76547e).a(walletEntranceResponse);
                return;
            }
            ((a) this.f76547e).a(new Exception());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f76557a, false, 89803, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f76557a, false, 89803, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            ((a) this.f76547e).a(exc);
        }
    }

    public c(b bVar, a aVar) {
        super(bVar, aVar);
        bVar.addNotifyListener(this);
    }
}
