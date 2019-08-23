package com.ss.android.ugc.aweme.hotsearch.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.c;
import com.ss.android.ugc.b.b.a;

public final /* synthetic */ class e implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49731a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49732b;

    /* renamed from: c  reason: collision with root package name */
    private final a f49733c;

    e(c cVar, a aVar) {
        this.f49732b = cVar;
        this.f49733c = aVar;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f49731a, false, 49818, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f49731a, false, 49818, new Class[]{String.class}, Void.TYPE);
            return;
        }
        c cVar = this.f49732b;
        a aVar = this.f49733c;
        aVar.f77131a = str;
        cVar.f49727c.a(aVar);
    }
}
