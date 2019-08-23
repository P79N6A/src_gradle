package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.a.g;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import java.util.HashMap;

public final class am implements ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17965a;

    /* renamed from: b  reason: collision with root package name */
    private long f17966b;

    /* renamed from: c  reason: collision with root package name */
    private long f17967c;

    public final int b() {
        return 10002;
    }

    public final Observable<d<g>> a() {
        if (PatchProxy.isSupport(new Object[0], this, f17965a, false, 14155, new Class[0], Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[0], this, f17965a, false, 14155, new Class[0], Observable.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("package_id", String.valueOf(this.f17966b));
        hashMap.put("anchor_id", String.valueOf(this.f17967c));
        return ((WalletApi) j.q().d().a(WalletApi.class)).buyWard(hashMap);
    }

    public am(long j, long j2) {
        this.f17966b = j;
        this.f17967c = j2;
    }
}
