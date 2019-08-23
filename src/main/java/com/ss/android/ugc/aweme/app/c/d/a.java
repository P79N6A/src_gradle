package com.ss.android.ugc.aweme.app.c.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.api.c.g;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.downloadad.api.a.c;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34068a;

    public final b a(b.a aVar, String str) {
        b.a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2}, this, f34068a, false, 23455, new Class[]{b.a.class, String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{aVar2, str2}, this, f34068a, false, 23455, new Class[]{b.a.class, String.class}, b.class);
        }
        aVar2.A = str2;
        return aVar.a();
    }

    public final c a(c.a aVar, String str) {
        c.a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2}, this, f34068a, false, 23454, new Class[]{c.a.class, String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{aVar2, str2}, this, f34068a, false, 23454, new Class[]{c.a.class, String.class}, c.class);
        }
        g.a aVar3 = new g.a();
        aVar3.f28498a = str2;
        aVar2.w = new g(aVar3);
        return aVar.a();
    }
}
