package com.ss.android.ugc.aweme.poi.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.model.ac;
import com.ss.android.ugc.aweme.poi.model.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/api/PoiHalfCardApi;", "", "()V", "POI_COUPON_SCOPE_API_URL", "", "POI_HALF_CARD_API_URL", "sApi", "Lcom/ss/android/ugc/aweme/poi/api/PoiHalfCardApi$RealApi;", "kotlin.jvm.PlatformType", "getPoiCouponScopeResp", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/poi/model/PoiCouponScopeResponse;", "couponId", "", "codeId", "cursor", "", "count", "getPoiHalfCardResp", "Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoResponse;", "poiId", "RealApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiHalfCardApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59717a;

    /* renamed from: b  reason: collision with root package name */
    public static final RealApi f59718b = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RealApi.class));

    /* renamed from: c  reason: collision with root package name */
    public static final PoiHalfCardApi f59719c = new PoiHalfCardApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\bH'¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/api/PoiHalfCardApi$RealApi;", "", "getPoiCouponScopeResp", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/poi/model/PoiCouponScopeResponse;", "couponId", "", "codeId", "", "cursor", "", "count", "getPoiHalfCardResp", "Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoResponse;", "poiId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface RealApi {
        @NotNull
        @GET(a = "/aweme/v1/poi/coupon/scopelist/")
        i<w> getPoiCouponScopeResp(@Query(a = "coupon_id") int i, @NotNull @Query(a = "code_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i2);

        @NotNull
        @GET(a = "/aweme/v1/poi/halfcard/")
        i<ac> getPoiHalfCardResp(@NotNull @Query(a = "poi_id") String str);
    }

    private PoiHalfCardApi() {
    }

    @NotNull
    public final i<w> a(int i, @NotNull String str, long j, int i2) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, new Long(j2), 20}, this, f59717a, false, 64925, new Class[]{Integer.TYPE, String.class, Long.TYPE, Integer.TYPE}, i.class)) {
            Object[] objArr = {Integer.valueOf(i), str2, new Long(j2), 20};
            return (i) PatchProxy.accessDispatch(objArr, this, f59717a, false, 64925, new Class[]{Integer.TYPE, String.class, Long.TYPE, Integer.TYPE}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "codeId");
        return f59718b.getPoiCouponScopeResp(i, str, j, 20);
    }
}
