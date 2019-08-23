package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class bg implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54584a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54585b;

    bg(MainPageFragment mainPageFragment) {
        this.f54585b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54584a, false, 57558, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54584a, false, 57558, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54585b.lambda$initDataCenter$7$MainPageFragment((a) obj);
    }
}
