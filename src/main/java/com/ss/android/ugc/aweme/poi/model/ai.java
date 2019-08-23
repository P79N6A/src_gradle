package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.poi.api.PoiFeedApi;

public final class ai extends a<s> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59877a;

    /* renamed from: b  reason: collision with root package name */
    static final PoiFeedApi f59878b = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiFeedApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        int i;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59877a, false, 65131, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f59877a, false, 65131, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        try {
            String str = objArr[0];
            if (TextUtils.isEmpty(str)) {
                i = 0;
                f59878b.getPoiCommonBanner((long) i, 54, "").a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
                return true;
            }
            i = Integer.parseInt(str);
            f59878b.getPoiCommonBanner((long) i, 54, "").a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
            return true;
        } catch (Exception unused) {
        }
    }
}
