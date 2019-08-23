package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class ac implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54317a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f54318b;

    ac(MainFragment mainFragment) {
        this.f54318b = mainFragment;
    }

    public final void onChanged(Object obj) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54317a, false, 57335, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54317a, false, 57335, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        MainFragment mainFragment = this.f54318b;
        a aVar = (a) obj;
        if (aVar != null) {
            i = ((Integer) aVar.a()).intValue();
        }
        mainFragment.a(true, i);
    }
}
