package com.ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.b;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77014a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f77015b;

    e(Activity activity) {
        this.f77015b = activity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77014a, false, 90207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77014a, false, 90207, new Class[0], Void.TYPE);
            return;
        }
        b a2 = b.a((Context) this.f77015b);
        if (PatchProxy.isSupport(new Object[0], a2, b.f30305a, false, 18729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, b.f30305a, false, 18729, new Class[0], Void.TYPE);
            return;
        }
        if (a2.f30306b != null) {
            if (!a2.f30310f) {
                a2.f30310f = true;
                a2.f30307c.sendEmptyMessage(0);
            } else if (a2.f30309e) {
                a2.f30309e = false;
                a2.f30307c.sendEmptyMessage(3);
            }
            Logger.debug();
            a2.f30307c.removeCallbacks(a2.g);
        }
    }
}
