package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import java.util.concurrent.Callable;

public final class y extends a<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45534a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45534a, false, 42080, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45534a, false, 42080, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45535a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f45535a, false, 42081, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f45535a, false, 42081, new Class[0], Object.class);
                    }
                    String str = (String) objArr[0];
                    if (PatchProxy.isSupport(new Object[]{str}, null, FeedApi.f45052a, true, 40880, new Class[]{String.class}, String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[]{str}, null, FeedApi.f45052a, true, 40880, new Class[]{String.class}, String.class);
                    }
                    FeedApi.f45054c.deleteItem(str).get();
                    return str;
                }
            }, 0);
            return true;
        }
    }
}
