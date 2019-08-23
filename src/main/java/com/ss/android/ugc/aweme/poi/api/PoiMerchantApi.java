package com.ss.android.ugc.aweme.poi.api;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.a.h;
import retrofit2.http.GET;
import retrofit2.http.POST;

public final class PoiMerchantApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59720a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f59721b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f59722c;

    /* renamed from: d  reason: collision with root package name */
    public static final IRetrofit f59723d = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    public interface RealApi {
        @POST(a = "/aweme/v1/poi/merchant/entry/hint/ack/")
        q<BaseResponse> ackPoiMerchantEntryHint();

        @GET(a = "/aweme/v1/poi/merchant/poi/list/")
        q<h> getPoiMerchantList();
    }

    public static boolean b() {
        return f59721b;
    }

    public static boolean c() {
        return f59722c;
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f59720a, true, 64927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f59720a, true, 64927, new Class[0], Void.TYPE);
            return;
        }
        f59722c = false;
        l.a(((RealApi) f59723d.create(RealApi.class)).ackPoiMerchantEntryHint(), new k<BaseResponse>() {
            public final void onFailure(@Nullable Throwable th) {
            }

            public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Object obj) {
            }
        }, v.a());
    }
}
