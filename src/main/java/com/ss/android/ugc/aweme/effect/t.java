package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.s;

public final /* synthetic */ class t implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43776a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43777b;

    t(VEEffectHelper vEEffectHelper) {
        this.f43777b = vEEffectHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43776a, false, 38721, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43776a, false, 38721, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f43777b.f3090f.setValue(s.a(((Long) obj).longValue()));
    }
}
