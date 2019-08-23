package com.ss.android.ugc.aweme.setting.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class k extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63947a;

    /* renamed from: b  reason: collision with root package name */
    public CommonApi f63948b = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CommonApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f63947a, false, 72280, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f63947a, false, 72280, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63949a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f63949a, false, 72281, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f63949a, false, 72281, new Class[0], Object.class);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", String.valueOf(objArr[0]));
                    String str = (String) k.this.f63948b.doGet("https://aweme.snssdk.com/aweme/v1/contact/shield/", (Map<String, String>) hashMap).execute().body();
                    com.ss.android.ugc.aweme.app.api.a.b(str, "https://aweme.snssdk.com/aweme/v1/contact/shield/");
                    return str;
                }
            }, 0);
            return true;
        }
    }
}
