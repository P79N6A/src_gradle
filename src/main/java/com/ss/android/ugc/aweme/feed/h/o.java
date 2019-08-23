package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;

public final class o extends a<PrivateUrlModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45513a;

    /* renamed from: b  reason: collision with root package name */
    public static final FeedStatsApi f45514b = ((FeedStatsApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FeedStatsApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45513a, false, 42053, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45513a, false, 42053, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45515a;

                public final Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, f45515a, false, 42054, new Class[0], Object.class)) {
                        return o.f45514b.feedStats((String) objArr[0], ((Integer) objArr[1]).intValue()).execute().body();
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f45515a, false, 42054, new Class[0], Object.class);
                }
            }, 0);
            return true;
        }
    }
}
