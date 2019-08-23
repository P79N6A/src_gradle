package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.a.g;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import java.util.HashMap;

public final class u implements ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18148a;

    /* renamed from: b  reason: collision with root package name */
    long f18149b;

    /* renamed from: c  reason: collision with root package name */
    long f18150c;

    public final int b() {
        return 10001;
    }

    public final Observable<d<g>> a() {
        if (PatchProxy.isSupport(new Object[0], this, f18148a, false, 13992, new Class[0], Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[0], this, f18148a, false, 13992, new Class[0], Observable.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("campaign_id", String.valueOf(this.f18149b));
        hashMap.put("item_id", String.valueOf(this.f18150c));
        return ((WalletApi) j.q().d().a(WalletApi.class)).buyPackage(hashMap);
    }

    public u(long j, long j2) {
        this.f18149b = j;
        this.f18150c = j2;
    }
}
