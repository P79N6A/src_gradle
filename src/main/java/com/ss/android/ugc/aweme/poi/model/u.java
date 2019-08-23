package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.poi.api.PoiCouponApi;

public final class u extends a<af> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59944a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        i iVar;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59944a, false, 65041, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f59944a, false, 65041, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        String str = objArr[0];
        int intValue = objArr[1].intValue();
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(intValue)}, null, PoiCouponApi.f59713a, true, 64919, new Class[]{String.class, Integer.TYPE}, i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(intValue)}, null, PoiCouponApi.f59713a, true, 64919, new Class[]{String.class, Integer.TYPE}, i.class);
        } else {
            iVar = PoiCouponApi.f59714b.getJoinPoiActivity(str, intValue);
        }
        iVar.a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
        return true;
    }
}
