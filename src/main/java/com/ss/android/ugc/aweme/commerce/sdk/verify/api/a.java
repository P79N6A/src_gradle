package com.ss.android.ugc.aweme.commerce.sdk.verify.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/api/VerifyApiImpl;", "", "()V", "verifyApi", "Lcom/ss/android/ugc/aweme/commerce/sdk/verify/api/VerifyApi;", "acquireUserInfo", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/sdk/verify/dto/VerifyStatusDTO;", "ensureApi", "", "uploadReadLicense", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37939a;

    /* renamed from: b  reason: collision with root package name */
    public static VerifyApi f37940b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f37941c = new a();

    private a() {
    }

    @Nullable
    public final i<com.ss.android.ugc.aweme.commerce.sdk.verify.a.a> b() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f37939a, false, 29622, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f37939a, false, 29622, new Class[0], i.class);
        }
        a();
        VerifyApi verifyApi = f37940b;
        if (verifyApi != null) {
            return verifyApi.acquireUserInfo();
        }
        return null;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37939a, false, 29620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37939a, false, 29620, new Class[0], Void.TYPE);
            return;
        }
        if (f37940b == null) {
            IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
            if (iRetrofitService != null) {
                f37940b = (VerifyApi) iRetrofitService.createNewRetrofit("https://aweme.snssdk.com/").create(VerifyApi.class);
            }
        }
    }
}
