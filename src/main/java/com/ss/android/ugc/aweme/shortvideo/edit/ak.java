package com.ss.android.ugc.aweme.shortvideo.edit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.w;

public final /* synthetic */ class ak implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66969a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66970b;

    ak(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66970b = vEVideoPublishEditActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66969a, false, 76461, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66969a, false, 76461, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66970b.a((w) obj);
    }
}
