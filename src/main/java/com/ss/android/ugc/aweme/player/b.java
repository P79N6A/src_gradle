package com.ss.android.ugc.aweme.player;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.plugin.a.a;
import com.ss.android.ugc.aweme.plugin.a.b;
import com.ss.android.ugc.aweme.plugin.b.f;
import com.ss.android.ugc.aweme.plugin.d.e;
import com.ss.android.ugc.aweme.plugin.e.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59105a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f59106b;

    public static void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f59105a, true, 64190, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f59105a, true, 64190, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (a.a()) {
            f.a(context).a((a.C0664a) new a.C0664a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59107a;

                public final void a(com.ss.android.ugc.aweme.plugin.e.b bVar) {
                    String str;
                    com.ss.android.ugc.aweme.plugin.e.b bVar2 = bVar;
                    if (PatchProxy.isSupport(new Object[]{bVar2}, this, f59107a, false, 64194, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar2}, this, f59107a, false, 64194, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE);
                        return;
                    }
                    c cVar = bVar2.f59319b;
                    StringBuilder sb = new StringBuilder("download onStateChange ");
                    if (cVar != null) {
                        str = cVar.f59324a;
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                }

                public final void b(com.ss.android.ugc.aweme.plugin.e.b bVar) {
                    String str;
                    com.ss.android.ugc.aweme.plugin.e.b bVar2 = bVar;
                    if (PatchProxy.isSupport(new Object[]{bVar2}, this, f59107a, false, 64195, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar2}, this, f59107a, false, 64195, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE);
                        return;
                    }
                    c cVar = bVar2.f59319b;
                    StringBuilder sb = new StringBuilder("download onTaskProgress ");
                    if (cVar != null) {
                        str = cVar.f59324a;
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                }
            });
            e.a().a(new b.a() {
                public final void a(String str, boolean z) {
                }
            });
            com.ss.android.ugc.aweme.plugin.g.b.a("com.ss.android.ugc.aweme.player_pluginv3");
            com.bytedance.frameworks.plugin.pm.c.b("com.ss.android.ugc.aweme.player_pluginv3");
            try {
                Class.forName("com.ss.android.ugc.aweme.player.sdk.plugin.impl.TTPlayerVP").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            } catch (Throwable unused) {
            }
        }
    }
}
