package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class al implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54338a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54339b;

    al(MainPageFragment mainPageFragment) {
        this.f54339b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54338a, false, 57537, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54338a, false, 57537, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54339b.lambda$initDataCenter$0$MainPageFragment((a) obj);
    }
}
