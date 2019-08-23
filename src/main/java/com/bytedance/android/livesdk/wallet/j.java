package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.bytedance.android.livesdkapi.depend.model.c;
import com.bytedance.android.livesdkapi.host.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import org.json.JSONObject;

public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18119a;

    public final Observable<c> a(long j, r rVar) {
        long j2 = j;
        final r rVar2 = rVar;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), rVar2}, this, f18119a, false, 13943, new Class[]{Long.TYPE, r.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2), rVar2}, this, f18119a, false, 13943, new Class[]{Long.TYPE, r.class}, Observable.class);
        }
        switch (rVar) {
            case ALIPAY:
                break;
            case GOOGLE:
                i = 10;
                break;
            case TEST:
                i = -1;
                break;
            default:
                i = 1;
                break;
        }
        return ((WalletApi) com.bytedance.android.livesdk.v.j.q().d().a(WalletApi.class)).createOrderInfo(String.valueOf(j), i).map(new Function<String, c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18120a;

            public final /* synthetic */ Object apply(Object obj) throws Exception {
                String str = (String) obj;
                if (PatchProxy.isSupport(new Object[]{str}, this, f18120a, false, 13944, new Class[]{String.class}, c.class)) {
                    return (c) PatchProxy.accessDispatch(new Object[]{str}, this, f18120a, false, 13944, new Class[]{String.class}, c.class);
                }
                JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
                c cVar = new c();
                cVar.g = jSONObject.optString("order_info", "");
                cVar.h = jSONObject.optString("app_id", "");
                cVar.k = jSONObject.optString("nonce_str", "");
                cVar.i = jSONObject.optString("partner_id", "");
                cVar.j = jSONObject.optString("prepay_id", "");
                cVar.m = jSONObject.optString("sign", "");
                cVar.l = jSONObject.optString("timestamp", "");
                cVar.f18695a = jSONObject.optString("order_id", "");
                cVar.f18699e = jSONObject.optBoolean("result", false);
                cVar.f18696b = rVar2;
                return cVar;
            }
        }).compose(i.a());
    }
}
