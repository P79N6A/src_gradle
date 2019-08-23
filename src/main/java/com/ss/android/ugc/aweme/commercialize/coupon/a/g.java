package com.ss.android.ugc.aweme.commercialize.coupon.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.profile.api.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w.a.a;
import java.util.concurrent.Callable;

public final class g extends a<User> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38555a;

    public final void a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38555a, false, 30462, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38555a, false, 30462, new Class[]{String.class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38556a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f38556a, false, 30463, new Class[0], Object.class)) {
                    return d.a(com.ss.android.ugc.aweme.app.api.a.a(str), false, null);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f38556a, false, 30463, new Class[0], Object.class);
            }
        }, 0);
    }
}
