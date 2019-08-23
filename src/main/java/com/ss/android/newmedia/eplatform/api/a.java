package com.ss.android.newmedia.eplatform.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/newmedia/eplatform/api/EPlatformApiImpl;", "", "()V", "safeApi", "Lcom/ss/android/newmedia/eplatform/api/EPlatformApi;", "verifyHost", "Lbolts/Task;", "Lcom/ss/android/newmedia/eplatform/api/EPlatformSafetyResponse;", "schema", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30200a;

    /* renamed from: b  reason: collision with root package name */
    public static final EPlatformApi f30201b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f30202c = new a();

    private a() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com/").create(EPlatformApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…EPlatformApi::class.java)");
        f30201b = (EPlatformApi) create;
    }
}
