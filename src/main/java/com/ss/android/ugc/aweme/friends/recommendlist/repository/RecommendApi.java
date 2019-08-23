package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J}\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\r\u001a\u00020\n2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\nH'¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendApi;", "", "dislikeRecommend", "Lio/reactivex/Observable;", "", "userId", "", "recommendList", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "count", "", "cursor", "targetUserId", "recommendType", "yellowPointCount", "addressBookAccess", "recImprUsers", "pushUserId", "gpsAccess", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Observable;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface RecommendApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48981a = a.f48983b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendApi$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48982a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f48983b = new a();

        private a() {
        }

        @NotNull
        public final RecommendApi a() {
            if (PatchProxy.isSupport(new Object[0], this, f48982a, false, 46749, new Class[0], RecommendApi.class)) {
                return (RecommendApi) PatchProxy.accessDispatch(new Object[0], this, f48982a, false, 46749, new Class[0], RecommendApi.class);
            }
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RecommendApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…RecommendApi::class.java)");
            return (RecommendApi) create;
        }
    }

    @NotNull
    @GET(a = "/aweme/v1/recommend/user/dislike/")
    Observable<Unit> dislikeRecommend(@NotNull @Query(a = "user_id") String str);

    @NotNull
    @GET(a = "/aweme/v2/user/recommend/")
    Observable<RecommendList> recommendList(@Nullable @Query(a = "count") Integer num, @Nullable @Query(a = "cursor") Integer num2, @Nullable @Query(a = "target_user_id") String str, @Query(a = "recommend_type") int i, @Nullable @Query(a = "yellow_point_count") Integer num3, @Nullable @Query(a = "address_book_access") Integer num4, @Nullable @Query(a = "rec_impr_users") String str2, @Nullable @Query(a = "push_user_id") String str3, @Nullable @Query(a = "gps_access") Integer num5);
}
