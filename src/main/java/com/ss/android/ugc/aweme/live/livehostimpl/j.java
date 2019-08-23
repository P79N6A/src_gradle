package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53444a;

    public j() {
        b.a(g.class, this);
    }

    public final void a(String str, Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, this, f53444a, false, 55784, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, this, f53444a, false, 55784, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        r.a(str, (Map) map);
    }
}
