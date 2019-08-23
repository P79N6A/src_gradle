package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;

public final /* synthetic */ class gl implements bg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67942a;

    /* renamed from: b  reason: collision with root package name */
    private final gk f67943b;

    gl(gk gkVar) {
        this.f67943b = gkVar;
    }

    public final void a(Object obj, bc bcVar) {
        if (PatchProxy.isSupport(new Object[]{obj, bcVar}, this, f67942a, false, 74744, new Class[]{Object.class, bc.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, bcVar}, this, f67942a, false, 74744, new Class[]{Object.class, bc.class}, Void.TYPE);
            return;
        }
        gk gkVar = this.f67943b;
        az azVar = (az) bcVar;
        if (gkVar.f67941c == null) {
            gkVar.f67941c = (RecordToolbarViewModel) ViewModelProviders.of(gkVar.f67940b.getActivity()).get(RecordToolbarViewModel.class);
        }
        gkVar.f67941c.f77613c.setValue(azVar);
        gkVar.f67940b.r().f65401b.U = !azVar.f74643b;
    }
}
