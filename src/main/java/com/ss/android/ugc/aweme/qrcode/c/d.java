package com.ss.android.ugc.aweme.qrcode.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.qrcode.api.RiskApi;
import com.ss.android.ugc.aweme.w.a.a;
import java.util.concurrent.Callable;

public final class d extends a<c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63371a;

    public final /* synthetic */ void handleData(Object obj) {
        c cVar = (c) obj;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f63371a, false, 70416, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f63371a, false, 70416, new Class[]{c.class}, Void.TYPE);
            return;
        }
        super.handleData(cVar);
        this.mData = cVar;
    }

    public final void a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f63371a, false, 70415, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f63371a, false, 70415, new Class[]{String.class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63372a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f63372a, false, 70417, new Class[0], Object.class)) {
                    return RiskApi.a(str);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f63372a, false, 70417, new Class[0], Object.class);
            }
        }, 0);
    }
}
