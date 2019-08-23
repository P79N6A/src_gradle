package com.ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.utils.bc;

public final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66344a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity.AnonymousClass6 f66345b;

    /* renamed from: c  reason: collision with root package name */
    private final d f66346c;

    /* renamed from: d  reason: collision with root package name */
    private final int f66347d;

    ac(CutMultiVideoActivity.AnonymousClass6 r1, d dVar, int i) {
        this.f66345b = r1;
        this.f66346c = dVar;
        this.f66347d = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66344a, false, 75477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66344a, false, 75477, new Class[0], Void.TYPE);
            return;
        }
        CutMultiVideoActivity.AnonymousClass6 r1 = this.f66345b;
        d dVar = this.f66346c;
        int i = this.f66347d;
        bc.b(dVar);
        if (i == -1) {
            a.b((Context) CutMultiVideoActivity.this, CutMultiVideoActivity.this.getString(C0906R.string.dr8, new Object[]{Long.valueOf(CutMultiVideoActivity.this.E / 1000)})).a();
            return;
        }
        if (i == -2) {
            a.b((Context) CutMultiVideoActivity.this, (int) C0906R.string.bcy).a();
        }
    }
}
