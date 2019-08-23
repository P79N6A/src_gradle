package com.ss.android.ugc.aweme.festival.christmas.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.festival.christmas.view.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47279a;

    /* renamed from: b  reason: collision with root package name */
    private final c f47280b;

    i(c cVar) {
        this.f47280b = cVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f47279a, false, 43934, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f47279a, false, 43934, new Class[0], Object.class);
        }
        c cVar = this.f47280b;
        if (cVar.f2979f != null) {
            ((b) cVar.f2979f).a();
        }
        return null;
    }
}
