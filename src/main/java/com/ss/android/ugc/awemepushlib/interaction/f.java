package com.ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.h;
import com.ss.android.newmedia.redbadge.b;
import com.ss.android.ugc.aweme.i18n.c;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77016a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f77017b;

    f(Activity activity) {
        this.f77017b = activity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77016a, false, 90208, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77016a, false, 90208, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.f77017b;
        if (!j.a().isSplashActivity(activity) || c.a() || j.a().getAllowNetwork()) {
            if (PatchProxy.isSupport(new Object[]{activity}, null, h.f30010a, true, 17904, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity}, null, h.f30010a, true, 17904, new Class[]{Context.class}, Void.TYPE);
            } else {
                try {
                    Intent b2 = h.b(activity);
                    b2.putExtra("do_schedule_pause", true);
                    activity.startService(b2);
                } catch (Exception unused) {
                }
            }
        }
        b a2 = b.a((Context) activity);
        if (PatchProxy.isSupport(new Object[0], a2, b.f30305a, false, 18730, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, b.f30305a, false, 18730, new Class[0], Void.TYPE);
            return;
        }
        if (a2.f30306b != null) {
            if (a2.f30310f) {
                a2.f30307c.postDelayed(a2.g, 30000);
                a2.f30307c.sendEmptyMessage(2);
            }
            Logger.debug();
        }
    }
}
