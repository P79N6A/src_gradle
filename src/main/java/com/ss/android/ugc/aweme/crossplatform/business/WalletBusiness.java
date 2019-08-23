package com.ss.android.ugc.aweme.crossplatform.business;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.crossplatform.activity.f;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.verify.a;

public class WalletBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40754a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40755b;

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40754a, false, 34280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40754a, false, 34280, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40755b) {
            if (((Integer) SharePrefCache.inst().getRefreshZhima().c()).intValue() != 1) {
                bg.a(new a());
            } else if (this.g instanceof f) {
                ((f) this.g).a("https://wallet.snssdk.com/douyin/withdraw");
            }
            this.f40755b = false;
        }
    }

    @Keep
    WalletBusiness(@NonNull d dVar) {
        super(dVar);
    }
}
