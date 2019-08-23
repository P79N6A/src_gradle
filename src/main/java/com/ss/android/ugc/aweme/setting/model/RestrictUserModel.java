package com.ss.android.ugc.aweme.setting.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.setting.api.RestrictApi;
import com.ss.android.ugc.aweme.w.a.a;
import java.util.concurrent.Callable;

public class RestrictUserModel extends a<CommonResponse> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void restricUser(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 72247, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 72247, new Class[]{String.class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72248, new Class[0], Object.class)) {
                    return RestrictApi.c(str);
                }
                return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72248, new Class[0], Object.class);
            }
        }, 0);
    }
}
