package com.ss.android.ugc.aweme.detail.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

public final class h extends a<Aweme> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41187a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f41187a, false, 35020, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f41187a, false, 35020, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            final String str = objArr[0];
            final String str2 = "";
            if (objArr.length > 1 && objArr[1] != null) {
                str2 = objArr[1];
            }
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41188a;

                public final Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, f41188a, false, 35021, new Class[0], Object.class)) {
                        return DetailApi.a(str, str2);
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f41188a, false, 35021, new Class[0], Object.class);
                }
            }, 0);
            return true;
        }
    }
}
