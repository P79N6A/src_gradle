package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.u;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;

public final /* synthetic */ class bq implements bg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65824a;

    /* renamed from: b  reason: collision with root package name */
    private final bp f65825b;

    bq(bp bpVar) {
        this.f65825b = bpVar;
    }

    public final void a(Object obj, bc bcVar) {
        if (PatchProxy.isSupport(new Object[]{obj, bcVar}, this, f65824a, false, 74121, new Class[]{Object.class, bc.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, bcVar}, this, f65824a, false, 74121, new Class[]{Object.class, bc.class}, Void.TYPE);
            return;
        }
        bp bpVar = this.f65825b;
        if (bpVar.f65823c == null) {
            bpVar.f65823c = (RecordToolbarViewModel) ViewModelProviders.of(bpVar.f65822b.getActivity()).get(RecordToolbarViewModel.class);
        }
        bpVar.f65823c.f77616f.setValue((u) bcVar);
    }
}
