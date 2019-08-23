package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.ba;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.u;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;

public final /* synthetic */ class go implements bg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67952a;

    /* renamed from: b  reason: collision with root package name */
    private final gn f67953b;

    go(gn gnVar) {
        this.f67953b = gnVar;
    }

    public final void a(Object obj, bc bcVar) {
        if (PatchProxy.isSupport(new Object[]{obj, bcVar}, this, f67952a, false, 74748, new Class[]{Object.class, bc.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, bcVar}, this, f67952a, false, 74748, new Class[]{Object.class, bc.class}, Void.TYPE);
            return;
        }
        gn gnVar = this.f67953b;
        ba baVar = (ba) bcVar;
        if (gnVar.f67951c == null) {
            gnVar.f67951c = (RecordToolbarViewModel) ViewModelProviders.of(gnVar.f67950b.getActivity()).get(RecordToolbarViewModel.class);
        }
        gnVar.f67951c.f77614d.setValue(Boolean.valueOf(baVar.f74650b));
        if (gnVar.f67950b.Y.f69149b.f69128b) {
            gnVar.f67951c.f77616f.setValue(new u(baVar.f74650b ? 5 : 6));
        }
    }
}
