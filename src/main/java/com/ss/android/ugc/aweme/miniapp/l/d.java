package com.ss.android.ugc.aweme.miniapp.l;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55819a;

    /* renamed from: b  reason: collision with root package name */
    private static d f55820b = new d();

    public interface a {
        void a();
    }

    private d() {
    }

    public static d a() {
        return f55820b;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f55819a, false, 59543, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f55819a, false, 59543, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(Context context, String str, boolean z, a aVar) {
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, str, Byte.valueOf(z ? (byte) 1 : 0), aVar2}, this, f55819a, false, 59542, new Class[]{Context.class, String.class, Boolean.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, Byte.valueOf(z), aVar2}, this, f55819a, false, 59542, new Class[]{Context.class, String.class, Boolean.TYPE, a.class}, Void.TYPE);
            return;
        }
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null) {
            iPluginService.check(context, str, "com.ss.android.ugc.aweme.miniappplugin", z, new IPluginService.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55821a;

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f55821a, false, 59545, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f55821a, false, 59545, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    d.this.a(aVar2);
                }

                public final void b(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f55821a, false, 59546, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f55821a, false, 59546, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    d dVar = d.this;
                    a aVar = aVar2;
                    if (PatchProxy.isSupport(new Object[]{aVar}, dVar, d.f55819a, false, 59544, new Class[]{a.class}, Void.TYPE)) {
                        Object[] objArr = {aVar};
                        d dVar2 = dVar;
                        ChangeQuickRedirect changeQuickRedirect = d.f55819a;
                        PatchProxy.accessDispatch(objArr, dVar2, changeQuickRedirect, false, 59544, new Class[]{a.class}, Void.TYPE);
                    }
                }
            });
            return;
        }
        a(aVar2);
    }
}
