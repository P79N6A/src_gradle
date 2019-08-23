package com.ss.android.ugc.aweme.music.ui;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class w implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56779a;

    /* renamed from: b  reason: collision with root package name */
    private final View f56780b;

    w(View view) {
        this.f56780b = view;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f56779a, false, 60434, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f56779a, false, 60434, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56779a, false, 60433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56779a, false, 60433, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f56780b;
        if (view != null) {
            view.performLongClick();
        }
    }
}
