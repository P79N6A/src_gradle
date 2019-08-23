package com.ss.android.newmedia.eplatform.api;

import a.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/ss/android/newmedia/eplatform/api/EPlatformApi;", "", "hostVerify", "Lbolts/Task;", "Lcom/ss/android/newmedia/eplatform/api/EPlatformSafetyResponse;", "target", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface EPlatformApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30198a = a.f30199a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/newmedia/eplatform/api/EPlatformApi$Companion;", "", "()V", "API_E_PLATFORM_VERIFY", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f30199a = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v1/commerce/seclink/verify/")
    i<b> hostVerify(@NotNull @Query(a = "target") String str);
}
