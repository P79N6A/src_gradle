package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankFilterResponse;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.poi.api.PoiRankApi;

public final class ap extends a<PoiRankFilterResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59882a;

    /* renamed from: b  reason: collision with root package name */
    private int f59883b;

    /* renamed from: c  reason: collision with root package name */
    private String f59884c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f59885d = "";

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        i<PoiRankFilterResponse> iVar;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59882a, false, 65145, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f59882a, false, 65145, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.poi.a f2 = af.a(d.a()).f();
        if (f2 != null) {
            this.f59885d = String.valueOf(f2.longitude);
            this.f59884c = String.valueOf(f2.latitude);
        }
        long j = (long) this.f59883b;
        String str = this.f59885d;
        String str2 = this.f59884c;
        String str3 = objArr[0];
        String str4 = objArr[1];
        String str5 = objArr[2];
        int intValue = objArr[3].intValue();
        String str6 = objArr[4];
        Object[] objArr2 = {10, new Long(j), str, str2, str3, str4, str5, Integer.valueOf(intValue), str6};
        if (PatchProxy.isSupport(objArr2, null, PoiRankApi.f59725a, true, 64930, new Class[]{Integer.TYPE, Long.TYPE, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class}, i.class)) {
            Object[] objArr3 = {10, new Long(j), str, str2, str3, str4, str5, Integer.valueOf(intValue), str6};
            Object[] objArr4 = objArr3;
            iVar = (i) PatchProxy.accessDispatch(objArr4, null, PoiRankApi.f59725a, true, 64930, new Class[]{Integer.TYPE, Long.TYPE, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class}, i.class);
        } else {
            iVar = PoiRankApi.f59726b.getPoiRankFilter(10, j, str, str2, str3, str4, str5, intValue, str6);
        }
        iVar.a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
        return true;
    }
}
