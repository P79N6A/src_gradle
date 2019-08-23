package com.ss.android.ugc.aweme.filter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47585a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectFilterAdapter f47586b;

    /* renamed from: c  reason: collision with root package name */
    private final int f47587c;

    e(EffectFilterAdapter effectFilterAdapter, int i) {
        this.f47586b = effectFilterAdapter;
        this.f47587c = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f47585a, false, 44043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47585a, false, 44043, new Class[0], Void.TYPE);
            return;
        }
        EffectFilterAdapter effectFilterAdapter = this.f47586b;
        int i = this.f47587c;
        if (effectFilterAdapter.f47315e != null) {
            effectFilterAdapter.f47315e.scrollToPosition(i);
        }
    }
}
