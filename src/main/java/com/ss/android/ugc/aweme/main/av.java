package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class av implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54358a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54359b;

    av(MainPageFragment mainPageFragment) {
        this.f54359b = mainPageFragment;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f54358a, false, 57547, new Class[0], Object.class)) {
            return this.f54359b.lambda$checkLiveLabelShowLimit$18$MainPageFragment();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f54358a, false, 57547, new Class[0], Object.class);
    }
}
