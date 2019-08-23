package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.Url;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010JF\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u0007H'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'¨\u0006\u0011"}, d2 = {"Lcom/bytedance/android/livesdk/commerce/LiveCommerceApi;", "", "fetchLiveCommerce", "Lio/reactivex/Observable;", "Lcom/bytedance/android/live/core/network/response/ListResponse;", "Lcom/bytedance/android/livesdk/commerce/LiveGoods;", "url", "", "userId", "", "offset", "count", "from", "fetchLiveGoodsUserStatus", "Lcom/bytedance/android/live/core/network/response/Response;", "Lcom/bytedance/android/livesdk/commerce/LiveGoodsUserStatus;", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public interface LiveCommerceApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13580a = a.f13581a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/android/livesdk/commerce/LiveCommerceApi$Companion;", "", "()V", "infoUrl", "", "promotionUrl", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f13581a = new a();

        private a() {
        }
    }

    @NotNull
    @GET
    Observable<c<d>> fetchLiveCommerce(@NotNull @Url String str, @Query(a = "user_id") long j, @Query(a = "offset") long j2, @Query(a = "count") long j3, @NotNull @Query(a = "from") String str2);

    @NotNull
    @GET
    Observable<d<f>> fetchLiveGoodsUserStatus(@NotNull @Url String str, @Query(a = "user_id") long j);
}
