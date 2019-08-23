package com.ss.android.ugc.aweme.report.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.report.api.ReportApi;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63558a;

    /* renamed from: b  reason: collision with root package name */
    public ReportApi f63559b = ((ReportApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ReportApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f63558a, false, 70697, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f63558a, false, 70697, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63560a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f63560a, false, 70698, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f63560a, false, 70698, new Class[0], Object.class);
                    }
                    a.this.f63559b.voteForCommunityDiscipline((String) objArr[0], ((Integer) objArr[1]).intValue()).execute();
                    return null;
                }
            }, 0);
            return true;
        }
    }
}
