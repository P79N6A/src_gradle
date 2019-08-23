package com.ss.android.ugc.aweme.festival.christmas.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.festival.christmas.view.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47276a;

    /* renamed from: b  reason: collision with root package name */
    private final c f47277b;

    /* renamed from: c  reason: collision with root package name */
    private final String f47278c;

    h(c cVar, String str) {
        this.f47277b = cVar;
        this.f47278c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f47276a, false, 43933, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f47276a, false, 43933, new Class[0], Object.class);
        }
        c cVar = this.f47277b;
        String str = this.f47278c;
        if (cVar.f2979f != null) {
            ((b) cVar.f2979f).a(str);
        }
        return null;
    }
}
