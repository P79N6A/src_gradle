package com.ss.android.ugc.aweme.discover.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallengeResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestMusicResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestUserResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/SuggestApi;", "", "()V", "SUGGEST_CHALLENGE_URL", "", "SUGGEST_HOST", "SUGGEST_MUSIC_URL", "SUGGEST_USER_URL", "sRetrofit", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofit;", "kotlin.jvm.PlatformType", "sRetrofit$annotations", "getSuggestChallenges", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestChallengeResponse;", "getSuggestMusics", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestMusicResponse;", "getSuggestUsers", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestUserResponse;", "RealApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SuggestApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42097a;

    /* renamed from: b  reason: collision with root package name */
    public static final IRetrofit f42098b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    public static final SuggestApi f42099c = new SuggestApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H'¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/SuggestApi$RealApi;", "", "getSuggestChallenges", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestChallengeResponse;", "getSuggestMusics", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestMusicResponse;", "getSuggestUsers", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestUserResponse;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface RealApi {
        @NotNull
        @GET(a = "/aweme/v1/challenge/suggested/")
        i<SuggestChallengeResponse> getSuggestChallenges();

        @NotNull
        @GET(a = "/aweme/v1/music/suggested/")
        i<SuggestMusicResponse> getSuggestMusics();

        @NotNull
        @GET(a = "/aweme/v1/user/suggested/")
        i<SuggestUserResponse> getSuggestUsers();
    }

    private SuggestApi() {
    }
}
