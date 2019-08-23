package com.ss.android.ugc.aweme.story.live;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73130a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f73131b = new d();

    private d() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73130a, false, 84717, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f73130a, false, 84717, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Throwable th = (Throwable) obj;
        if (th == null) {
            th = new IllegalStateException("unknown error");
        }
        a.a("Live", Log.getStackTraceString(th));
    }
}
