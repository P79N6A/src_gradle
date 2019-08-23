package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeUnlockFragment;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33530a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f33531b = new h();

    private h() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f33530a, false, 22002, new Class[0], Object.class)) {
            return TimeUnlockFragment.AnonymousClass2.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f33530a, false, 22002, new Class[0], Object.class);
    }
}
