package com.ss.android.ugc.aweme.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.message.d.f;
import com.ss.android.ugc.aweme.message.d.g;
import com.ss.android.websocket.b.a.d;
import com.ss.android.websocket.b.a.e;
import java.util.HashMap;
import org.greenrobot.eventbus.c;

public final class a implements com.bytedance.ies.geckoclient.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52927a;

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f52927a, false, 47522, new Class[0], Boolean.TYPE)) {
            return f.d().f3573c;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52927a, false, 47522, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f52927a, false, 47524, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52927a, false, 47524, new Class[0], Integer.TYPE)).intValue();
        }
        if (g.g.a().f3578b) {
            i = 1239108;
        }
        return i;
    }

    public final boolean a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f52927a, false, 47523, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) SharePrefCache.inst().getUseNewPackageNow().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f52927a, false, 47523, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f52927a, false, 47521, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f52927a, false, 47521, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (f.d().f3573c) {
            String e2 = f.d().e();
            e eVar = new e(e2, 1012, 0, 0, i, str.getBytes(), "", "", new HashMap());
            c.a().d(new d(e2, eVar));
        }
    }
}
