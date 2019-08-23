package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cw;
import com.ss.android.ugc.gamora.recorder.RecordViewModel;

public final /* synthetic */ class cy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66723a;

    /* renamed from: b  reason: collision with root package name */
    private final cw.AnonymousClass1 f66724b;

    /* renamed from: c  reason: collision with root package name */
    private final RecordViewModel f66725c;

    cy(cw.AnonymousClass1 r1, RecordViewModel recordViewModel) {
        this.f66724b = r1;
        this.f66725c = recordViewModel;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66723a, false, 74241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66723a, false, 74241, new Class[0], Void.TYPE);
            return;
        }
        cw.AnonymousClass1 r1 = this.f66724b;
        RecordViewModel recordViewModel = this.f66725c;
        cw.this.f66711b.d(false);
        recordViewModel.g.setValue(0);
    }
}
