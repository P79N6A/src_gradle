package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class ad implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54319a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f54320b;

    ad(MainFragment mainFragment) {
        this.f54320b = mainFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54319a, false, 57336, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54319a, false, 57336, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = (a) obj;
        this.f54320b.a(false, aVar != null ? ((Integer) aVar.a()).intValue() : 0);
    }
}
