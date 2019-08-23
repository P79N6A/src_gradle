package com.ss.android.ugc.aweme.commerce.service.logs;

import a.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/RealApi;", "", "post", "Lbolts/Task;", "data", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public interface RealApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38052a = a.f38053a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/RealApi$Companion;", "", "()V", "BEHAVIOR_API", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f38053a = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "/aweme/v2/shop/user/behavior")
    i<Object> post(@NotNull @Query(a = "data") String str);
}
