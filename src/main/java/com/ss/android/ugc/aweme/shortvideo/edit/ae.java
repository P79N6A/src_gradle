package com.ss.android.ugc.aweme.shortvideo.edit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.v;

public final /* synthetic */ class ae implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66957a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66958b;

    ae(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66958b = vEVideoPublishEditActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66957a, false, 76455, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66957a, false, 76455, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66958b.b((v) obj);
    }
}
