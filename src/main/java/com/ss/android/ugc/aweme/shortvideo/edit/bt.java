package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper;

public final /* synthetic */ class bt implements VolumeHelper.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67143a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67144b;

    bt(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67144b = vEVideoPublishEditActivity;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67143a, false, 76496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67143a, false, 76496, new Class[0], Void.TYPE);
            return;
        }
        this.f67144b.al();
    }
}
