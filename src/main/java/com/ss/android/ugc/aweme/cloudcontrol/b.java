package com.ss.android.ugc.aweme.cloudcontrol;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.a;
import com.monitor.cloudmessage.callback.ITemplateConsumer;
import com.monitor.cloudmessage.callback.d;
import com.monitor.cloudmessage.callback.g;
import com.monitor.cloudmessage.callback.h;
import com.monitor.cloudmessage.callback.i;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.cloudcontrol.a.c;
import com.ss.android.ugc.aweme.cloudcontrol.a.e;
import com.ss.android.ugc.aweme.cloudcontrol.a.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36224a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f36225b;

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f36224a, true, 27034, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f36224a, true, 27034, new Class[0], b.class);
        }
        if (f36225b == null) {
            synchronized (b.class) {
                if (f36225b == null) {
                    f36225b = new b();
                }
            }
        }
        return f36225b;
    }

    private b() {
        a.a(k.g());
        a a2 = a.a();
        a.b(com.ss.android.ugc.aweme.account.d.a().getCurUserId());
        a.c(com.ss.android.f.a.a().getAbsolutePath() + "/dump.xzip");
        a2.g = new WeakReference<>(this);
        a.a((com.monitor.cloudmessage.callback.a) new com.ss.android.ugc.aweme.cloudcontrol.a.a());
        a.a((g) new c());
        a.a((h) new com.ss.android.ugc.aweme.cloudcontrol.a.d());
        a.a((i) new e());
        a.a((com.monitor.cloudmessage.callback.c) new com.ss.android.ugc.aweme.cloudcontrol.a.b());
        f fVar = new f();
        fVar.a(new com.ss.android.ugc.aweme.cloudcontrol.c.a.a());
        fVar.a(new com.ss.android.ugc.aweme.cloudcontrol.c.a.b());
        fVar.a(new com.ss.android.ugc.aweme.cloudcontrol.c.a.e());
        fVar.a(new com.ss.android.ugc.aweme.cloudcontrol.c.a.g());
        a.a((ITemplateConsumer) fVar);
    }

    public final void a(com.monitor.cloudmessage.entity.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f36224a, false, 27036, new Class[]{com.monitor.cloudmessage.entity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f36224a, false, 27036, new Class[]{com.monitor.cloudmessage.entity.a.class}, Void.TYPE);
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        NetUtil.putCommonParams(hashMap, false);
        a.a().f27306f = hashMap;
    }
}
