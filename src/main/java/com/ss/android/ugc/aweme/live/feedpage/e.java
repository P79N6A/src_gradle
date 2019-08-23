package com.ss.android.ugc.aweme.live.feedpage;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.live.feedpage.c;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53398a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a f53399b;

    e(c.a aVar) {
        this.f53399b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53398a, false, 55672, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53398a, false, 55672, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c.a aVar = this.f53399b;
        Throwable th = (Throwable) obj;
        if (PatchProxy.isSupport(new Object[]{th}, aVar, c.a.f53389a, false, 55666, new Class[]{Throwable.class}, Void.TYPE)) {
            c.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{th}, aVar2, c.a.f53389a, false, 55666, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        a.a("LiveStateManager", "refresh net:" + Log.getStackTraceString(th));
        aVar.f53390b = false;
        c.this.b();
    }
}
