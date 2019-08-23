package com.ss.android.ugc.aweme.following.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.following.a.c;
import com.ss.android.ugc.aweme.following.a.e;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0002\u0010\nJT\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\bH'JT\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\bH'¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/following/repository/FollowRelationApi;", "", "queryConnectedList", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/following/model/ConnectedRelationList;", "uid", "", "cursor", "", "count", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Observable;", "queryFollowerList", "Lcom/ss/android/ugc/aweme/following/model/FollowerItemList;", "userId", "maxTime", "", "offset", "sourceType", "addressBookAccess", "gpsAccess", "queryFollowingList", "Lcom/ss/android/ugc/aweme/following/model/FollowingItemList;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface FollowRelationApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f47913a = a.f47915b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/following/repository/FollowRelationApi$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/following/repository/FollowRelationApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47914a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f47915b = new a();

        private a() {
        }

        @NotNull
        public final FollowRelationApi a() {
            if (PatchProxy.isSupport(new Object[0], this, f47914a, false, 44806, new Class[0], FollowRelationApi.class)) {
                return (FollowRelationApi) PatchProxy.accessDispatch(new Object[0], this, f47914a, false, 44806, new Class[0], FollowRelationApi.class);
            }
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FollowRelationApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…wRelationApi::class.java)");
            return (FollowRelationApi) create;
        }
    }

    @NotNull
    @GET(a = "aweme/v1/connected/relation/list")
    Observable<com.ss.android.ugc.aweme.following.a.a> queryConnectedList(@NotNull @Query(a = "user_id") String str, @Nullable @Query(a = "cursor") Integer num, @Nullable @Query(a = "count") Integer num2);

    @NotNull
    @GET(a = "/aweme/v1/user/follower/list/")
    Observable<c> queryFollowerList(@NotNull @Query(a = "user_id") String str, @Query(a = "max_time") long j, @Query(a = "count") int i, @Query(a = "offset") int i2, @Query(a = "source_type") int i3, @Query(a = "address_book_access") int i4, @Query(a = "gps_access") int i5);

    @NotNull
    @GET(a = "/aweme/v1/user/following/list/")
    Observable<e> queryFollowingList(@NotNull @Query(a = "user_id") String str, @Query(a = "max_time") long j, @Query(a = "count") int i, @Query(a = "offset") int i2, @Query(a = "source_type") int i3, @Query(a = "address_book_access") int i4, @Query(a = "gps_access") int i5);
}
