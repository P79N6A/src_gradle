package com.ss.android.ugc.aweme.shortvideo.cut;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.view.d;

public final /* synthetic */ class ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66340a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity.AnonymousClass5 f66341b;

    /* renamed from: c  reason: collision with root package name */
    private final d f66342c;

    /* renamed from: d  reason: collision with root package name */
    private final int f66343d;

    ab(CutMultiVideoActivity.AnonymousClass5 r1, d dVar, int i) {
        this.f66341b = r1;
        this.f66342c = dVar;
        this.f66343d = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66340a, false, 75474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66340a, false, 75474, new Class[0], Void.TYPE);
            return;
        }
        CutMultiVideoActivity.AnonymousClass5 r0 = this.f66341b;
        d dVar = this.f66342c;
        int i = this.f66343d;
        if (CutMultiVideoActivity.this.isViewValid() && dVar != null && dVar.isShowing()) {
            dVar.setProgress(i);
        }
    }
}
