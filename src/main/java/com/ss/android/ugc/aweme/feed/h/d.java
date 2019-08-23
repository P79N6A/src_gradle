package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.api.CityListApiManager;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import java.util.concurrent.Callable;

public final class d extends a<NearbyCities> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45479a;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45479a, false, 42017, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45479a, false, 42017, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45480a;

                public final Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, f45480a, false, 42018, new Class[0], Object.class)) {
                        return CityListApiManager.a();
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f45480a, false, 42018, new Class[0], Object.class);
                }
            }, 0);
            return true;
        }
    }
}
