package com.ss.android.ugc.aweme.discover.api;

import com.ss.android.ugc.aweme.discover.api.a.b;
import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.discover.model.CategoryList;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\bJ3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\rJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\rJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/DiscoverApiNew;", "", "getBannerList", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/model/BannerList;", "bannerTabType", "", "adPersonalityMode", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Observable;", "getCategoryList", "Lcom/ss/android/ugc/aweme/discover/model/CategoryList;", "cursor", "count", "(IILjava/lang/Integer;)Lio/reactivex/Observable;", "getCategoryV2List", "getFindFascinatingList", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface DiscoverApiNew {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42072a = a.f42074b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/DiscoverApiNew$Companion;", "", "()V", "BANNER_URL", "", "CATEGORY_FIND_FASCINATING", "CATEGORY_URL", "CATEGORY_URL_V2", "INSTANCE", "Lcom/ss/android/ugc/aweme/discover/api/DiscoverApiNew;", "getINSTANCE", "()Lcom/ss/android/ugc/aweme/discover/api/DiscoverApiNew;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public static final DiscoverApiNew f42073a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f42074b = new a();

        private a() {
        }

        static {
            Object create = b.f42105a.create(DiscoverApiNew.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "RetrofitProvider.COMMON_…scoverApiNew::class.java)");
            f42073a = (DiscoverApiNew) create;
        }
    }

    @NotNull
    @GET(a = "/aweme/v1/find/")
    Observable<BannerList> getBannerList(@Nullable @Query(a = "banner_tab_type") Integer num, @Nullable @Query(a = "ad_personality_mode") Integer num2);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v1/category/list/")
    Observable<CategoryList> getCategoryList(@Query(a = "cursor") int i, @Query(a = "count") int i2, @Nullable @Query(a = "ad_personality_mode") Integer num);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/category/list/")
    Observable<CategoryList> getCategoryV2List(@Query(a = "cursor") int i, @Query(a = "count") int i2, @Nullable @Query(a = "ad_personality_mode") Integer num);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v1/category/fascinating/list/")
    Observable<CategoryList> getFindFascinatingList(@Query(a = "cursor") int i, @Query(a = "count") int i2, @Nullable @Query(a = "ad_personality_mode") Integer num);
}
