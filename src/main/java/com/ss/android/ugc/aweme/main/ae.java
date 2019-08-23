package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class ae implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54321a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f54322b;

    ae(MainFragment mainFragment) {
        this.f54322b = mainFragment;
    }

    public final void onChanged(Object obj) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54321a, false, 57337, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54321a, false, 57337, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        MainFragment mainFragment = this.f54322b;
        a aVar = (a) obj;
        if (aVar != null) {
            z = ((Boolean) aVar.a()).booleanValue();
        }
        mainFragment.e(z);
    }
}
