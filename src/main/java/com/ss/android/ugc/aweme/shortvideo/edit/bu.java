package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.n;

public final /* synthetic */ class bu implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67145a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67146b;

    bu(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67146b = vEVideoPublishEditActivity;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67145a, false, 76497, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67145a, false, 76497, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f67146b.c(i);
    }
}
