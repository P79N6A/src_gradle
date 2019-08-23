package com.ss.android.ugc.aweme.wallet.a;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.w.a.a;
import com.ss.android.ugc.aweme.wallet.api.WalletApi;
import com.ss.android.ugc.aweme.wallet.model.WalletEntranceResponse;

public final class b extends a<WalletEntranceResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76555a;

    /* renamed from: b  reason: collision with root package name */
    private final WalletApi f76556b = ((WalletApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(WalletApi.class));

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76555a, false, 89801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76555a, false, 89801, new Class[0], Void.TYPE);
            return;
        }
        this.f76556b.queryWalletEntrance().a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
