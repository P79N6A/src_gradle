package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.LinkedHashMap;

public final /* synthetic */ class ap implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65651a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap f65652b;

    ap(LinkedHashMap linkedHashMap) {
        this.f65652b = linkedHashMap;
    }

    public final q a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f65651a, false, 74033, new Class[]{Object.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj}, this, f65651a, false, 74033, new Class[]{Object.class}, q.class);
        }
        return a.t.a((String) null, this.f65652b);
    }
}
