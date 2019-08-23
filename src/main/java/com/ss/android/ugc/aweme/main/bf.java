package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class bf implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54582a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54583b;

    bf(MainPageFragment mainPageFragment) {
        this.f54583b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54582a, false, 57557, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54582a, false, 57557, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54583b.lambda$initDataCenter$6$MainPageFragment((a) obj);
    }
}
