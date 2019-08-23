package com.ss.android.ugc.aweme.crossplatform.business;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.d;
import com.ss.android.ugc.aweme.crossplatform.base.c;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;

public interface j extends d {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40791a;

        public static j a(@NonNull c cVar) {
            c cVar2 = cVar;
            if (!PatchProxy.isSupport(new Object[]{cVar2}, null, f40791a, true, 34268, new Class[]{c.class}, j.class)) {
                return new d(cVar2);
            }
            return (j) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f40791a, true, 34268, new Class[]{c.class}, j.class);
        }
    }

    <T extends BusinessService.Business> T a(Class<T> cls);

    void a();

    void a(com.ss.android.ugc.aweme.crossplatform.params.base.a aVar);
}
