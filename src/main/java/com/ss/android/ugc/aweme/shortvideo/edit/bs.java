package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper;

public final /* synthetic */ class bs implements VolumeHelper.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67141a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67142b;

    bs(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67142b = vEVideoPublishEditActivity;
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67141a, false, 76495, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67141a, false, 76495, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f67142b.a(f2, f3);
    }
}
