package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.s;
import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71307a;

    public static <V> e<a, V> a(s<q<V>> sVar) {
        s<q<V>> sVar2 = sVar;
        if (!PatchProxy.isSupport(new Object[]{sVar2}, null, f71307a, true, 73943, new Class[]{s.class}, e.class)) {
            return new x(sVar2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{sVar2}, null, f71307a, true, 73943, new Class[]{s.class}, e.class);
    }
}
