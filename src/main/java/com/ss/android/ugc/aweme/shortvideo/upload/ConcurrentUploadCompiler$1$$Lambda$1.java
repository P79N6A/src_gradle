package com.ss.android.ugc.aweme.shortvideo.upload;

import android.support.v4.os.CancellationSignal;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.gq;
import com.ss.android.ugc.aweme.shortvideo.upload.a;
import com.ss.android.vesdk.VEWatermarkParam;
import dmt.av.video.ad;
import java.io.File;

public final /* synthetic */ class ConcurrentUploadCompiler$1$$Lambda$1 implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70941a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass1 f70942b;

    /* renamed from: c  reason: collision with root package name */
    private final SynthetiseResult f70943c;

    /* renamed from: d  reason: collision with root package name */
    private final ad f70944d;

    /* renamed from: e  reason: collision with root package name */
    private final VEWatermarkParam f70945e;

    ConcurrentUploadCompiler$1$$Lambda$1(a.AnonymousClass1 r1, SynthetiseResult synthetiseResult, ad adVar, VEWatermarkParam vEWatermarkParam) {
        this.f70942b = r1;
        this.f70943c = synthetiseResult;
        this.f70944d = adVar;
        this.f70945e = vEWatermarkParam;
    }

    public final void onCancel() {
        if (PatchProxy.isSupport(new Object[0], this, f70941a, false, 80767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70941a, false, 80767, new Class[0], Void.TYPE);
            return;
        }
        a.AnonymousClass1 r0 = this.f70942b;
        SynthetiseResult synthetiseResult = this.f70943c;
        ad adVar = this.f70944d;
        VEWatermarkParam vEWatermarkParam = this.f70945e;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = -66666;
        if (r0.a((Throwable) new gq("VECompiler canceled.", clone))) {
            a.this.f70947b.c();
            adVar.q.k();
        }
        if (synthetiseResult.outputFile != null) {
            File file = new File(synthetiseResult.outputFile);
            if (file.exists()) {
                file.delete();
            }
            if (vEWatermarkParam != null) {
                File file2 = new File(vEWatermarkParam.extFile);
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }
}
