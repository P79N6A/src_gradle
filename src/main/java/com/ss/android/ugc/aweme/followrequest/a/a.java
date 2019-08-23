package com.ss.android.ugc.aweme.followrequest.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.a<FollowRequestResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48236a;

    /* renamed from: b  reason: collision with root package name */
    public long f48237b;

    /* renamed from: c  reason: collision with root package name */
    public long f48238c = 1;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f48236a, false, 45319, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f48236a, false, 45319, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48239a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f48239a, false, 45320, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f48239a, false, 45320, new Class[0], Object.class);
                    }
                    a.this.f48237b = System.currentTimeMillis() / 1000;
                    return FollowRequestApiManager.a(a.this.f48237b, a.this.f48238c, 0);
                }
            }, 0);
            return true;
        }
    }
}
