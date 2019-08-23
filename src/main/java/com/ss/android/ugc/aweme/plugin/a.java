package com.ss.android.ugc.aweme.plugin;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59214a;

    /* renamed from: b  reason: collision with root package name */
    private static a f59215b = new a();

    /* renamed from: com.ss.android.ugc.aweme.plugin.a$a  reason: collision with other inner class name */
    public interface C0663a {
        void a();
    }

    private a() {
    }

    public static a a() {
        return f59215b;
    }

    public final void a(C0663a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59214a, false, 64508, new Class[]{C0663a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f59214a, false, 64508, new Class[]{C0663a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(Context context, String str, boolean z, C0663a aVar) {
        final C0663a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, str, (byte) 0, aVar2}, this, f59214a, false, 64507, new Class[]{Context.class, String.class, Boolean.TYPE, C0663a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, (byte) 0, aVar2}, this, f59214a, false, 64507, new Class[]{Context.class, String.class, Boolean.TYPE, C0663a.class}, Void.TYPE);
            return;
        }
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null) {
            iPluginService.check(context, str, "com.ss.android.ugc.aweme.fusionfuelplugin", false, new IPluginService.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59216a;

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f59216a, false, 64510, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f59216a, false, 64510, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    a.this.a(aVar2);
                }

                public final void b(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f59216a, false, 64511, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f59216a, false, 64511, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    a aVar = a.this;
                    C0663a aVar2 = aVar2;
                    if (PatchProxy.isSupport(new Object[]{aVar2}, aVar, a.f59214a, false, 64509, new Class[]{C0663a.class}, Void.TYPE)) {
                        Object[] objArr = {aVar2};
                        a aVar3 = aVar;
                        ChangeQuickRedirect changeQuickRedirect = a.f59214a;
                        PatchProxy.accessDispatch(objArr, aVar3, changeQuickRedirect, false, 64509, new Class[]{C0663a.class}, Void.TYPE);
                    }
                }
            });
            return;
        }
        a(aVar2);
    }
}
