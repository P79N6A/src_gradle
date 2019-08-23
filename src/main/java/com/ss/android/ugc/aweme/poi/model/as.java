package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.poi.a.k;
import com.ss.android.ugc.aweme.poi.api.PoiSameCityActiveApi;

public final class as extends a<k> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59887a;

    /* renamed from: b  reason: collision with root package name */
    private String f59888b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f59889c = "";

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        i iVar;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59887a, false, 65149, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f59887a, false, 65149, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.poi.a f2 = af.a(d.a()).f();
        if (f2 != null) {
            this.f59889c = String.valueOf(f2.longitude);
            this.f59888b = String.valueOf(f2.latitude);
        }
        String str = this.f59889c;
        String str2 = this.f59888b;
        if (PatchProxy.isSupport(new Object[]{str, str2}, null, PoiSameCityActiveApi.f59727a, true, 64931, new Class[]{String.class, String.class}, i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[]{str, str2}, null, PoiSameCityActiveApi.f59727a, true, 64931, new Class[]{String.class, String.class}, i.class);
        } else {
            iVar = PoiSameCityActiveApi.f59728b.getPoiSameCiteActive(str, str2, com.ss.android.ugc.aweme.utils.permission.a.a(d.a(), af.f2626c) ? 1 : 0);
        }
        iVar.a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
        return super.sendRequest(objArr);
    }
}
