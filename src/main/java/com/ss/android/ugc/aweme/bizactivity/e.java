package com.ss.android.ugc.aweme.bizactivity;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35226a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityFloatDialogHelper f35227b;

    e(BizActivityFloatDialogHelper bizActivityFloatDialogHelper) {
        this.f35227b = bizActivityFloatDialogHelper;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f35226a, false, 25689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35226a, false, 25689, new Class[0], Void.TYPE);
            return;
        }
        i.a(3000).a((g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(this.f35227b));
    }
}
