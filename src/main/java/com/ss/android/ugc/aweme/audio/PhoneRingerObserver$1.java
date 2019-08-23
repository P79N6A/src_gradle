package com.ss.android.ugc.aweme.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.audio.b;

class PhoneRingerObserver$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34392a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f34393b;

    PhoneRingerObserver$1(b bVar) {
        this.f34393b = bVar;
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f34392a, false, 23890, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f34392a, false, 23890, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context}, null, a.f34394a, true, 23878, new Class[]{Context.class}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, a.f34394a, true, 23878, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (a.f(context)) {
            i = -1;
        } else {
            i = a.f34395b.getRingerMode();
        }
        if (this.f34393b.f34402e != i) {
            this.f34393b.f34402e = i;
            b bVar = this.f34393b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, bVar, b.f34397a, false, 23889, new Class[]{Integer.TYPE}, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, bVar2, b.f34397a, false, 23889, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            synchronized (bVar.f34399b) {
                for (b.a a2 : bVar.f34399b) {
                    a2.a(i);
                }
            }
        }
    }
}
