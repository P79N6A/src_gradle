package com.ss.android.ugc.aweme.shortvideo.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.gq;
import com.ss.android.ugc.aweme.shortvideo.upload.a;
import com.ss.android.vesdk.m;
import dmt.av.video.ad;

public final /* synthetic */ class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71000a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass1 f71001b;

    /* renamed from: c  reason: collision with root package name */
    private final SynthetiseResult f71002c;

    /* renamed from: d  reason: collision with root package name */
    private final ad f71003d;

    b(a.AnonymousClass1 r1, SynthetiseResult synthetiseResult, ad adVar) {
        this.f71001b = r1;
        this.f71002c = synthetiseResult;
        this.f71003d = adVar;
    }

    public final void a(int i, int i2, float f2, String str) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str2}, this, f71000a, false, 80766, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str2}, this, f71000a, false, 80766, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
            return;
        }
        a.AnonymousClass1 r0 = this.f71001b;
        SynthetiseResult synthetiseResult = this.f71002c;
        ad adVar = this.f71003d;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = i3;
        if (r0.a((Throwable) new gq("VECompiler failed. type = " + i3 + " ext = " + i4 + " f = " + f2 + " msg = " + str2, clone))) {
            if (i4 == -214) {
                f.a(true);
            }
            adVar.q.k();
        }
    }
}
