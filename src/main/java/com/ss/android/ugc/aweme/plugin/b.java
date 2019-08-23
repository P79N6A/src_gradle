package com.ss.android.ugc.aweme.plugin;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59219a;

    /* renamed from: b  reason: collision with root package name */
    private static b f59220b = new b();

    public interface a {
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59219a, false, 64514, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f59219a, false, 64514, new Class[]{a.class}, Void.TYPE);
        }
    }

    private b() {
    }

    public static b a() {
        return f59220b;
    }

    public final void a(Context context, String str, boolean z, a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, str, (byte) 0, null}, this, f59219a, false, 64513, new Class[]{Context.class, String.class, Boolean.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, (byte) 0, null}, this, f59219a, false, 64513, new Class[]{Context.class, String.class, Boolean.TYPE, a.class}, Void.TYPE);
            return;
        }
        final IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null) {
            iPluginService.check(context, str, "com.ss.android.ugc.aweme.livestream_so", false, new IPluginService.a(null) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59221a;

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f59221a, false, 64516, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f59221a, false, 64516, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    iPluginService.loadLibrary("com.ss.android.ugc.aweme.livestream_so", "livestream");
                    b.this.a(null);
                }

                public final void b(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f59221a, false, 64517, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f59221a, false, 64517, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    b bVar = b.this;
                    a aVar = null;
                    if (PatchProxy.isSupport(new Object[]{aVar}, bVar, b.f59219a, false, 64515, new Class[]{a.class}, Void.TYPE)) {
                        Object[] objArr = {aVar};
                        b bVar2 = bVar;
                        ChangeQuickRedirect changeQuickRedirect = b.f59219a;
                        PatchProxy.accessDispatch(objArr, bVar2, changeQuickRedirect, false, 64515, new Class[]{a.class}, Void.TYPE);
                    }
                }
            });
            return;
        }
        a(null);
    }
}
