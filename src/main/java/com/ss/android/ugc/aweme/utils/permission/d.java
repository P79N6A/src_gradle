package com.ss.android.ugc.aweme.utils.permission;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter;

public abstract /* synthetic */ class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75939a;

    public static PermissionStateReporter.ReportPermissionApi a() {
        if (PatchProxy.isSupport(new Object[0], null, f75939a, true, 88785, new Class[0], PermissionStateReporter.ReportPermissionApi.class)) {
            return (PermissionStateReporter.ReportPermissionApi) PatchProxy.accessDispatch(new Object[0], null, f75939a, true, 88785, new Class[0], PermissionStateReporter.ReportPermissionApi.class);
        }
        return (PermissionStateReporter.ReportPermissionApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PermissionStateReporter.ReportPermissionApi.class);
    }
}
