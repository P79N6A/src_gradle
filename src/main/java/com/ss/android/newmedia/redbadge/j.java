package com.ss.android.newmedia.redbadge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.e;
import com.ss.android.pushmanager.app.d;

public final class j implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30353a;

    /* renamed from: b  reason: collision with root package name */
    private d f30354b;

    public final void a() {
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f30353a, false, 18780, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f30353a, false, 18780, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            try {
                this.f30354b = d.a(d.b().a());
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }

    public final void a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f30353a, false, 18781, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f30353a, false, 18781, new Class[]{Intent.class}, Void.TYPE);
        } else if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras.getBoolean("app_entrance")) {
                Logger.debug();
                if (this.f30354b != null) {
                    d dVar = this.f30354b;
                    if (PatchProxy.isSupport(new Object[0], dVar, d.f30330a, false, 18746, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], dVar, d.f30330a, false, 18746, new Class[0], Void.TYPE);
                    } else if (dVar.f30335f) {
                        dVar.f30334e.sendEmptyMessage(1);
                    }
                }
            } else if (extras.getBoolean("app_exit")) {
                Logger.debug();
                if (this.f30354b != null) {
                    d dVar2 = this.f30354b;
                    if (PatchProxy.isSupport(new Object[0], dVar2, d.f30330a, false, 18747, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], dVar2, d.f30330a, false, 18747, new Class[0], Void.TYPE);
                    } else if (dVar2.f30335f) {
                        dVar2.f30334e.sendEmptyMessage(2);
                    }
                }
            }
        }
    }
}
