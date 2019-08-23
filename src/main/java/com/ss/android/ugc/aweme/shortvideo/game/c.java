package com.ss.android.ugc.aweme.shortvideo.game;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67865a;

    /* renamed from: b  reason: collision with root package name */
    private final a f67866b;

    c(a aVar) {
        this.f67866b = aVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67865a, false, 77357, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67865a, false, 77357, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f67866b.f67854c.b();
    }
}
