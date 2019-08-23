package com.ss.android.ugc.aweme.poi.ui.accelerate;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.ss.android.ugc.aweme.poi.b;
import com.ss.android.ugc.aweme.poi.model.an;

public final class d extends a<an> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60525a;

    /* renamed from: b  reason: collision with root package name */
    static final PoiFeedApi f60526b = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiFeedApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f60525a, false, 66223, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f60525a, false, 66223, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        b bVar = objArr[0];
        f60526b.getQRDetail(bVar.f59732a, bVar.g, bVar.h).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
        return true;
    }
}
