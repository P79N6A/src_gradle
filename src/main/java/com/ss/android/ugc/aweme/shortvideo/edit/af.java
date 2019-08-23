package com.ss.android.ugc.aweme.shortvideo.edit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.w;

public final /* synthetic */ class af implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66959a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66960b;

    af(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66960b = vEVideoPublishEditActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66959a, false, 76456, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66959a, false, 76456, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66960b.b((w) obj);
    }
}
