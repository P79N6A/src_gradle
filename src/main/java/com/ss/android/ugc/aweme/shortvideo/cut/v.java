package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66520a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66521b;

    v(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66521b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66520a, false, 75461, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66520a, false, 75461, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66521b.z = ((Integer) obj).intValue();
    }
}
