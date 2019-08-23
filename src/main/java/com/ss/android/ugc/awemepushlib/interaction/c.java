package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.pushmanager.client.e;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.ugc.awemepushlib.manager.a;
import java.util.Map;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77010a;

    /* renamed from: b  reason: collision with root package name */
    private final b f77011b;

    c(b bVar) {
        this.f77011b = bVar;
    }

    public final void run() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f77010a, false, 90205, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77010a, false, 90205, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.f77011b;
        a a2 = a.a();
        Context context = bVar.f77009b;
        if (PatchProxy.isSupport(new Object[]{context}, a2, a.f77064a, false, 90293, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, a2, a.f77064a, false, 90293, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, k.f77027a, true, 90222, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, k.f77027a, true, 90222, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = !StringUtils.isEmpty(AppLog.getClientId()) && !StringUtils.isEmpty(AppLog.getServerDeviceId());
        }
        if (z) {
            e.a().a(context, a2.c());
            e.a().b(context, a2.a(context));
            e a3 = e.a();
            boolean o = b.a().o();
            if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(o ? (byte) 1 : 0)}, a3, e.f30552a, false, 19091, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(o)}, a3, e.f30552a, false, 19091, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            } else {
                b.a().a(o);
            }
            com.ss.android.http.c.a(context).f29159a.a().a("http_monitor_port", AppLog.getHttpMonitorPort()).a();
            Map<String, String> a4 = k.a();
            if (!com.ss.android.ugc.awemepushlib.c.a.a((Map) a4)) {
                com.ss.android.ugc.awemepushlib.c.a.a((Runnable) new com.ss.android.ugc.awemepushlib.manager.c(context, a4));
            }
            com.ss.android.pushmanager.client.b.a(context);
            com.ss.android.newmedia.redbadge.b.a(context).b();
        }
    }
}
