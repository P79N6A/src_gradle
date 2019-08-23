package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.message.b.k;
import com.ss.android.newmedia.redbadge.b.a;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77022a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f77023b;

    i(Context context) {
        this.f77023b = context;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77022a, false, 90211, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77022a, false, 90211, new Class[0], Void.TYPE);
            return;
        }
        Context context = this.f77023b;
        AwemeRedBadgerManager a2 = AwemeRedBadgerManager.a();
        if (PatchProxy.isSupport(new Object[]{context}, a2, AwemeRedBadgerManager.f77048a, false, 90305, new Class[]{Context.class}, Void.TYPE)) {
            AwemeRedBadgerManager awemeRedBadgerManager = a2;
            PatchProxy.accessDispatch(new Object[]{context}, awemeRedBadgerManager, AwemeRedBadgerManager.f77048a, false, 90305, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            if (!StringUtils.isEmpty(AppLog.getClientId()) && !StringUtils.isEmpty(AppLog.getServerDeviceId())) {
                a.a(context).c(j.a().getSessionKey());
                a.a(context).d(k.b());
            }
        } catch (Throwable unused) {
        }
    }
}
