package com.ss.android.account;

import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.a;

public abstract class d extends a<com.bytedance.sdk.account.api.call.d> {
    public abstract void a(com.bytedance.sdk.account.api.call.d dVar);

    public abstract void a(com.bytedance.sdk.account.api.call.d dVar, String str, String str2, String str3);

    public abstract void b(com.bytedance.sdk.account.api.call.d dVar);

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        com.bytedance.sdk.account.api.call.d dVar = (com.bytedance.sdk.account.api.call.d) baseApiResponse;
        if (dVar.success) {
            b(dVar);
        } else if (!dVar.isBindExist()) {
            a(dVar);
        } else if (dVar.f22255d != null) {
            a(dVar, dVar.f22253b, dVar.f22254c, dVar.f22255d);
        } else {
            a(dVar);
        }
    }
}
