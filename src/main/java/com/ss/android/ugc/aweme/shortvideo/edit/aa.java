package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.VEListener;

public final /* synthetic */ class aa implements VEListener.i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66949a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66950b;

    aa(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66950b = vEVideoPublishEditActivity;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f66949a, false, 76451, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f66949a, false, 76451, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f66950b.b(0);
    }
}
