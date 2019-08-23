package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class bi implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54588a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54589b;

    bi(MainPageFragment mainPageFragment) {
        this.f54589b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54588a, false, 57560, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54588a, false, 57560, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54589b.lambda$initDataCenter$9$MainPageFragment((a) obj);
    }
}
