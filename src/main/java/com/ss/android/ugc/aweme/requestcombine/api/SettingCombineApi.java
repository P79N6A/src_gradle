package com.ss.android.ugc.aweme.requestcombine.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H'¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/api/SettingCombineApi;", "", "request", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineModel;", "params", "", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface SettingCombineApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63586a = a.f63588b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/api/SettingCombineApi$Companion;", "", "()V", "API_URL_PREFIX_SI", "", "create", "Lcom/ss/android/ugc/aweme/requestcombine/api/SettingCombineApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63587a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f63588b = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "tfe/api/request_combine/v1/")
    Observable<SettingCombineModel> request(@NotNull @QueryMap Map<String, String> map);
}
