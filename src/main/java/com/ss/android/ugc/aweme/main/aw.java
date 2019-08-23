package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class aw implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54360a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54361b;

    aw(MainPageFragment mainPageFragment) {
        this.f54361b = mainPageFragment;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f54360a, false, 57548, new Class[0], Object.class)) {
            return this.f54361b.lambda$checkLiveLabelShowLimit$19$MainPageFragment();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f54360a, false, 57548, new Class[0], Object.class);
    }
}
