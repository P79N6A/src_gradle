package com.ss.android.ugc.aweme.favorites.api;

import a.i;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/api/ProfileCollectionApi;", "", "()V", "PROFILE_COLLECTION_API_URL", "", "sApi", "Lcom/ss/android/ugc/aweme/favorites/api/ProfileCollectionApi$RealApi;", "kotlin.jvm.PlatformType", "getProfileCollection", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/favorites/bean/UserCollectionResponse;", "RealApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final ProfileCollectionApi f44264a = new ProfileCollectionApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RealApi f44265b = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RealApi.class));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/api/ProfileCollectionApi$RealApi;", "", "getProfileCollection", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/favorites/bean/UserCollectionResponse;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface RealApi {
        @NotNull
        @GET(a = "/aweme/v1/user/collectionlist/")
        i<com.ss.android.ugc.aweme.favorites.a.i> getProfileCollection();
    }

    private ProfileCollectionApi() {
    }
}
