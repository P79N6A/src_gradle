package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.LinkedHashMap;

public final /* synthetic */ class fq implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67775a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap f67776b;

    fq(LinkedHashMap linkedHashMap) {
        this.f67776b = linkedHashMap;
    }

    public final q a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67775a, false, 74655, new Class[]{Object.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj}, this, f67775a, false, 74655, new Class[]{Object.class}, q.class);
        }
        return a.t.a((String) null, this.f67776b);
    }
}
