package com.ss.android.ugc.aweme.commerce.setting;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.a.b;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38321a;

    public static void a(String str, b bVar) {
        String str2 = str;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str2, bVar2}, null, f38321a, true, 30126, new Class[]{String.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bVar2}, null, f38321a, true, 30126, new Class[]{String.class, b.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new d<TResult>((CheckShoppingAssistantApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CheckShoppingAssistantApi.class), str2)).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(bVar2), i.f1052b);
    }
}
