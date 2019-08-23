package com.ss.android.ugc.aweme.shortvideo.edit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.v;

public final /* synthetic */ class aj implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66967a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66968b;

    aj(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66968b = vEVideoPublishEditActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66967a, false, 76460, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66967a, false, 76460, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66968b.a((v) obj);
    }
}
