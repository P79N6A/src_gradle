package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeUnlockFragment;
import com.ss.android.ugc.aweme.app.api.a.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33532a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeUnlockFragment.AnonymousClass2 f33533b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f33534c;

    i(TimeUnlockFragment.AnonymousClass2 r1, Throwable th) {
        this.f33533b = r1;
        this.f33534c = th;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f33532a, false, 22003, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f33532a, false, 22003, new Class[0], Object.class);
        }
        TimeUnlockFragment.AnonymousClass2 r0 = this.f33533b;
        a.a(TimeUnlockFragment.this.getContext(), this.f33534c);
        return null;
    }
}
