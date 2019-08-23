package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.v;
import com.ss.android.ugc.aweme.tools.w;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;

public final /* synthetic */ class bs implements bg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65829a;

    /* renamed from: b  reason: collision with root package name */
    private final br f65830b;

    bs(br brVar) {
        this.f65830b = brVar;
    }

    public final void a(Object obj, bc bcVar) {
        if (PatchProxy.isSupport(new Object[]{obj, bcVar}, this, f65829a, false, 74123, new Class[]{Object.class, bc.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, bcVar}, this, f65829a, false, 74123, new Class[]{Object.class, bc.class}, Void.TYPE);
            return;
        }
        br brVar = this.f65830b;
        v vVar = (v) bcVar;
        if (brVar.f65828c == null) {
            brVar.f65828c = (RecordToolbarViewModel) ViewModelProviders.of(brVar.f65827b.getActivity()).get(RecordToolbarViewModel.class);
        }
        brVar.f65828c.l.setValue(new w(vVar.f74942b, vVar.f74943c, brVar.f65827b.Y.f69149b.b(vVar.f74942b), brVar.f65827b.s()));
        if (!vVar.f74942b) {
            ((VideoRecordNewActivity) brVar.f65827b.getActivity()).m.c(0);
        }
    }
}
