package com.ss.android.ugc.aweme.story.profile.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryApi;", "", "getAllStory", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryResponse;", "userId", "", "cursor", "", "count", "", "zone", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface AllStoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73278a = a.f73282d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryApi$Companion;", "", "()V", "API_HOST_HS", "", "getAPI_HOST_HS", "()Ljava/lang/String;", "API_URL_PREFIX_SI", "getAPI_URL_PREFIX_SI", "retrofitService", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "kotlin.jvm.PlatformType", "getRetrofitService", "()Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "create", "Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryApi;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73279a = null;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        static final String f73280b = ("https://" + f73283e);

        /* renamed from: c  reason: collision with root package name */
        static final IRetrofitService f73281c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ a f73282d = new a();
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private static final String f73283e = f73283e;

        private a() {
        }
    }

    @NotNull
    @GET(a = "/aweme/v1/life/profile/")
    Observable<AllStoryResponse> getAllStory(@NotNull @Query(a = "user_id") String str, @Query(a = "max_cursor") long j, @Query(a = "count") int i, @NotNull @Query(a = "zone") String str2);
}
