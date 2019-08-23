package com.ss.android.ugc.aweme.follow.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.follow.api.FollowingAwemeCountApi;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;

public final class g extends a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47792a;

    /* renamed from: b  reason: collision with root package name */
    public static final FollowingAwemeCountApi f47793b = ((FollowingAwemeCountApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FollowingAwemeCountApi.class));

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f47792a, false, 44688, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f47792a, false, 44688, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47794a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f47794a, false, 44689, new Class[0], Object.class)) {
                    return g.f47793b.getFollowingsLatestAwemePublishCount(((Integer) objArr[0]).intValue()).get();
                }
                return PatchProxy.accessDispatch(new Object[0], this, f47794a, false, 44689, new Class[0], Object.class);
            }
        }, 0);
        return super.sendRequest(objArr);
    }
}
