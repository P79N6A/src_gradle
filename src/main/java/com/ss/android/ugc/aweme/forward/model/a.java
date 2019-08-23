package com.ss.android.ugc.aweme.forward.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.forward.api.ForwardApi;
import com.ss.android.ugc.aweme.net.m;

public final class a extends com.ss.android.ugc.aweme.common.a<BaseResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48314a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        i iVar;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f48314a, false, 45366, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f48314a, false, 45366, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        String str = objArr[0];
        if (PatchProxy.isSupport(new Object[]{str}, null, ForwardApi.f48265a, true, 45361, new Class[]{String.class}, i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[]{str}, null, ForwardApi.f48265a, true, 45361, new Class[]{String.class}, i.class);
        } else {
            iVar = ForwardApi.f48266b.deleteForward(str);
        }
        iVar.a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }
}
