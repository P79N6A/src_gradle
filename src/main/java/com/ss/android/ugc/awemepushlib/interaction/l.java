package com.ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77028a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f77029b = new l();

    private l() {
    }

    public final void run() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f77028a, false, 90233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77028a, false, 90233, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, a.f77007a, true, 90197, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, a.f77007a, true, 90197, new Class[0], Integer.TYPE)).intValue();
        } else {
            i = j.a().getPushDelayDuration();
        }
        new Handler(Looper.getMainLooper()).postDelayed(p.f77041b, (long) i);
    }
}
