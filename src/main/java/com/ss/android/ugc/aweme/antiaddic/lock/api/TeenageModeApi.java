package com.ss.android.ugc.aweme.antiaddic.lock.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u0006H'J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH'¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/api/TeenageModeApi;", "", "checkTeenagePassword", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "password", "", "setMinorSettings", "settings", "syncMinorSettings", "teenMode", "", "timeLock", "passwordCreateTime", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface TeenageModeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33427a = a.f33429b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/api/TeenageModeApi$Companion;", "", "()V", "CHECK_TEENAGE_PASSWORD", "", "SET_MINOR_SETTINGS", "SYNC_MINOR_SETTINGS", "create", "Lcom/ss/android/ugc/aweme/antiaddic/lock/api/TeenageModeApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33428a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f33429b = new a();

        private a() {
        }
    }

    @FormUrlEncoded
    @NotNull
    @POST(a = "/aweme/v1/minor/user/check/password/")
    Observable<BaseResponse> checkTeenagePassword(@NotNull @Field(a = "password") String str);

    @FormUrlEncoded
    @NotNull
    @POST(a = "/aweme/v1/minor/user/set/settings/")
    Observable<BaseResponse> setMinorSettings(@NotNull @Field(a = "settings") String str);

    @FormUrlEncoded
    @NotNull
    @POST(a = "/aweme/v1/minor/user/sync/settings/")
    Observable<BaseResponse> syncMinorSettings(@Field(a = "teen_mode") int i, @Field(a = "screen_time_management") int i2, @NotNull @Field(a = "password") String str, @Field(a = "password_create_time") long j);
}
