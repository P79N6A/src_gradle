package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.annotation.SuppressLint;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import com.ss.android.ugc.aweme.o;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"LogNotTimber"})
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52965a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f52966b = com.ss.android.ugc.aweme.g.a.a();

    a(c cVar) {
        super(cVar);
    }

    private int a(e eVar, SsResponse ssResponse) {
        int i;
        e eVar2 = eVar;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{eVar2, ssResponse}, this, f52965a, false, 55013, new Class[]{e.class, SsResponse.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{eVar2, ssResponse}, this, f52965a, false, 55013, new Class[]{e.class, SsResponse.class}, Integer.TYPE)).intValue();
        }
        if (!(eVar2 == null || eVar2.f52987a == null)) {
            i2 = eVar2.f52987a.f52989a;
        }
        if (i2 == 0) {
            try {
                i = new JSONObject(ssResponse.body().toString()).getJSONObject("data").optInt("error_code");
            } catch (JSONException unused) {
            }
            return i;
        }
        i = i2;
        return i;
    }

    /* access modifiers changed from: package-private */
    @NotNull
    public final c.a a(e eVar, Request request, SsResponse ssResponse) {
        e eVar2 = eVar;
        Request request2 = request;
        SsResponse ssResponse2 = ssResponse;
        if (PatchProxy.isSupport(new Object[]{eVar2, request2, ssResponse2}, this, f52965a, false, 55012, new Class[]{e.class, Request.class, SsResponse.class}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{eVar2, request2, ssResponse2}, this, f52965a, false, 55012, new Class[]{e.class, Request.class, SsResponse.class}, c.a.class);
        } else if (request2 == null || TextUtils.isEmpty(request.getUrl())) {
            return b.f52968b;
        } else {
            ArrayMap arrayMap = new ArrayMap();
            o interceptorService = com.ss.android.ugc.aweme.account.c.a().interceptorService();
            if (interceptorService.shouldIntercept(request2)) {
                arrayMap.putAll(interceptorService.interceptAndGetNewParams(a(eVar2, ssResponse2), request2, ssResponse2));
            }
            if (arrayMap.isEmpty()) {
                return b.f52968b;
            }
            return new c.a(true, true, arrayMap);
        }
    }
}
