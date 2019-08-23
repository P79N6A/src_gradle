package com.ss.android.ugc.aweme.commerce.billshare.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/api/BillShareApiImpl;", "", "()V", "API_URL_PREFIX_SI", "", "portfolioApi", "Lcom/ss/android/ugc/aweme/commerce/billshare/api/BillShareApi;", "billShare", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/billshare/api/vo/BillShareResponse;", "promotionId", "page", "", "size", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36738a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f36739b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final BillShareApi f36740c;

    private a() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com/").create(BillShareApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…BillShareApi::class.java)");
        f36740c = (BillShareApi) create;
    }

    @NotNull
    public final i<com.ss.android.ugc.aweme.commerce.billshare.api.a.a> a(@NotNull String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), 10}, this, f36738a, false, 28007, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), 10}, this, f36738a, false, 28007, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "promotionId");
        return f36740c.billShare(str2, i, 10);
    }
}
