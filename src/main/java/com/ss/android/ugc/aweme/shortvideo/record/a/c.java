package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69072a;

    /* renamed from: b  reason: collision with root package name */
    private final b f69073b;

    c(b bVar) {
        this.f69073b = bVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f69072a, false, 78423, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f69072a, false, 78423, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f69073b.a((Boolean) obj);
    }
}
