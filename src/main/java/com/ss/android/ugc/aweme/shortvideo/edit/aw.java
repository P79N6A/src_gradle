package com.ss.android.ugc.aweme.shortvideo.edit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aw implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67081a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67082b;

    aw(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67082b = vEVideoPublishEditActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67081a, false, 76473, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67081a, false, 76473, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f67082b.a((Integer) obj);
    }
}
