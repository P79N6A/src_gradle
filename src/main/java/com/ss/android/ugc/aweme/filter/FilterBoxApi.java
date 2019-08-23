package com.ss.android.ugc.aweme.filter;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH'¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxApi;", "", "listFilterBox", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxEffectNetListResponse;", "accessKey", "", "sdkVersion", "appVersion", "region", "panel", "updateFilterBox", "Lcom/ss/android/ugc/effectmanager/common/model/BaseNetResponse;", "body", "Lcom/ss/android/ugc/aweme/filter/UpdateFilterBoxBody;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface FilterBoxApi {
    @NotNull
    @GET(a = "/effect/api/filterbox/list")
    Single<m> listFilterBox(@NotNull @Query(a = "access_key") String str, @NotNull @Query(a = "sdk_version") String str2, @NotNull @Query(a = "app_version") String str3, @NotNull @Query(a = "region") String str4, @NotNull @Query(a = "panel") String str5);

    @NotNull
    @POST(a = "/effect/api/filterbox/update")
    Single<BaseNetResponse> updateFilterBox(@NotNull @Body bc bcVar);
}
