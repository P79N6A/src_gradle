package com.ss.android.ugc.aweme.commerce.sdk.verify.api;

import a.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H'¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/api/VerifyApi;", "", "acquireUserInfo", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/sdk/verify/dto/VerifyStatusDTO;", "uploadReadLicense", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public interface VerifyApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37937a = a.f37938a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/api/VerifyApi$Companion;", "", "()V", "API_ACQUIRE_USER_INFO", "", "API_UPLOAD_READ_LICENSE", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f37938a = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/user/")
    i<com.ss.android.ugc.aweme.commerce.sdk.verify.a.a> acquireUserInfo();

    @NotNull
    @POST(a = "https://aweme.snssdk.com/aweme/v2/shop/license/")
    i<com.ss.android.ugc.aweme.commerce.service.d.a> uploadReadLicense();
}
