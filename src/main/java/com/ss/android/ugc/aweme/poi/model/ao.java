package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankBannerResponse;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.poi.api.PoiFilterApi;

public final class ao extends a<PoiRankBannerResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59879a;

    /* renamed from: b  reason: collision with root package name */
    private String f59880b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f59881c = "";

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        i<PoiRankBannerResponse> iVar;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59879a, false, 65144, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f59879a, false, 65144, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.poi.a f2 = af.a(d.a()).f();
        if (f2 != null) {
            this.f59881c = String.valueOf(f2.longitude);
            this.f59880b = String.valueOf(f2.latitude);
        }
        String str = this.f59881c;
        String str2 = this.f59880b;
        String str3 = objArr[0];
        String str4 = objArr[1];
        String str5 = objArr[2];
        String str6 = objArr[3];
        int intValue = objArr[4].intValue();
        String str7 = objArr[5];
        Object[] objArr2 = {1, 0L, str, str2, str3, str4, str5, str6, Integer.valueOf(intValue), str7};
        if (PatchProxy.isSupport(objArr2, null, PoiFilterApi.f59715a, true, 64923, new Class[]{Integer.TYPE, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class}, i.class)) {
            Object[] objArr3 = {1, 0L, str, str2, str3, str4, str5, str6, Integer.valueOf(intValue), str7};
            Object[] objArr4 = objArr3;
            iVar = (i) PatchProxy.accessDispatch(objArr4, null, PoiFilterApi.f59715a, true, 64923, new Class[]{Integer.TYPE, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class}, i.class);
        } else {
            iVar = PoiFilterApi.f59716b.getPoiRankBanner(1, 0, str, str2, str3, str4, str5, str6, intValue, str7);
        }
        iVar.a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
        return true;
    }
}
