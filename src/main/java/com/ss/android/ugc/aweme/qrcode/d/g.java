package com.ss.android.ugc.aweme.qrcode.d;

import android.content.Context;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63431a;

    /* renamed from: b  reason: collision with root package name */
    private final f f63432b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63433c;

    g(f fVar, boolean z) {
        this.f63432b = fVar;
        this.f63433c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f63431a, false, 70467, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63431a, false, 70467, new Class[0], Void.TYPE);
            return;
        }
        UIUtils.displayToast((Context) this.f63432b.f63408b, this.f63433c ? C0906R.string.b21 : C0906R.string.bke);
    }
}
