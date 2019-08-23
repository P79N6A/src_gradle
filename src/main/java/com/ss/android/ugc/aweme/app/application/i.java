package com.ss.android.ugc.aweme.app.application;

import com.crashlytics.android.Crashlytics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.h.b;
import com.ss.android.ugc.common.a.a;

public final class i extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33946a;

    public final void p_() {
        if (PatchProxy.isSupport(new Object[0], this, f33946a, false, 23220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33946a, false, 23220, new Class[0], Void.TYPE);
            return;
        }
        super.p_();
        if (b.a()) {
            if (PatchProxy.isSupport(new Object[0], this, f33946a, false, 23221, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33946a, false, 23221, new Class[0], Void.TYPE);
                return;
            }
            try {
                String channel = com.ss.android.ugc.aweme.app.i.a().getChannel();
                Crashlytics.setString("git_sha", "70269d3c718");
                Crashlytics.setString("git_branch", "HEAD");
                Crashlytics.setString("device_id", AppLog.getServerDeviceId());
                Crashlytics.setString("channel", channel);
            } catch (Throwable unused) {
            }
        }
    }

    public i(k kVar) {
        super(kVar);
    }
}
