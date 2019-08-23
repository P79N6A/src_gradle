package com.ss.android.ugc.aweme.commercialize.coupon.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.coupon.model.b;
import com.ss.android.ugc.aweme.commercialize.coupon.model.d;
import com.ss.android.ugc.aweme.commercialize.coupon.model.e;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class CouponApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38582a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f38583b;

    /* renamed from: c  reason: collision with root package name */
    public static final IRetrofit f38584c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: d  reason: collision with root package name */
    private static IRetrofitService f38585d = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    public interface RealApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v2/coupon/detail/")
        q<d> getCouponDetail(@Query(a = "coupon_id") int i, @Query(a = "code_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v2/coupon/entry")
        q<b> getCouponEntry();

        @GET(a = "https://aweme.snssdk.com/aweme/v2/coupon/list/")
        q<e> getCouponList(@Query(a = "page") int i, @Query(a = "count") int i2, @Query(a = "filter_status") int i3);
    }

    public static boolean a() {
        return f38583b;
    }

    public static d a(int i, String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f38582a, true, 30442, new Class[]{Integer.TYPE, String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f38582a, true, 30442, new Class[]{Integer.TYPE, String.class}, d.class);
        }
        try {
            return (d) ((RealApi) f38584c.create(RealApi.class)).getCouponDetail(i, str2).get();
        } catch (ExecutionException e2) {
            throw f38585d.propagateCompatibleException(e2);
        }
    }

    public static e a(int i, int i2, int i3) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), 10, Integer.valueOf(i3)}, null, f38582a, true, 30441, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), 10, Integer.valueOf(i3)}, null, f38582a, true, 30441, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, e.class);
        }
        try {
            return (e) ((RealApi) f38584c.create(RealApi.class)).getCouponList(i, 10, i3).get();
        } catch (ExecutionException e2) {
            throw f38585d.propagateCompatibleException(e2);
        }
    }
}
