package com.ss.android.ugc.aweme.qrcode.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.qrcode.c.a;
import com.ss.android.ugc.aweme.qrcode.c.e;
import com.ss.android.ugc.aweme.qrcode.c.h;
import java.util.concurrent.ExecutionException;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class QRCodeApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63336a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f63337b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f63338c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    interface RealApi {
        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/qrcode/info/")
        q<a> getQRCodeInfo(@Field(a = "schema_type") int i, @Field(a = "object_id") String str, @Field(a = "edition_uid") String str2);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/fancy/qrcode/info/")
        q<a> getQRCodeInfoV2(@Field(a = "schema_type") int i, @Field(a = "object_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/commerce/scan/guide/")
        q<e> getScanGuideInfo();

        @GET(a = "https://aweme.snssdk.com/aweme/v1/commerce/scan/material/")
        q<h> scanMaterialResult(@Query(a = "target_id") String str);
    }

    public static e a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f63336a, true, 70402, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f63336a, true, 70402, new Class[0], e.class);
        }
        try {
            return (e) ((RealApi) f63337b.create(RealApi.class)).getScanGuideInfo().get();
        } catch (ExecutionException e2) {
            throw f63338c.propagateCompatibleException(e2);
        }
    }

    public static h a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f63336a, true, 70403, new Class[]{String.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{str2}, null, f63336a, true, 70403, new Class[]{String.class}, h.class);
        }
        try {
            return (h) ((RealApi) f63337b.create(RealApi.class)).scanMaterialResult(str2).get();
        } catch (ExecutionException e2) {
            throw f63338c.propagateCompatibleException(e2);
        }
    }

    public static a a(int i, String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f63336a, true, 70401, new Class[]{Integer.TYPE, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f63336a, true, 70401, new Class[]{Integer.TYPE, String.class}, a.class);
        }
        try {
            return (a) ((RealApi) f63337b.create(RealApi.class)).getQRCodeInfoV2(i, str2).get();
        } catch (ExecutionException e2) {
            throw f63338c.propagateCompatibleException(e2);
        }
    }

    public static a a(int i, String str, String str2) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, null, f63336a, true, 70400, new Class[]{Integer.TYPE, String.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, null, f63336a, true, 70400, new Class[]{Integer.TYPE, String.class, String.class}, a.class);
        }
        try {
            return (a) ((RealApi) f63337b.create(RealApi.class)).getQRCodeInfo(i, str3, str4).get();
        } catch (ExecutionException e2) {
            throw f63338c.propagateCompatibleException(e2);
        }
    }
}
