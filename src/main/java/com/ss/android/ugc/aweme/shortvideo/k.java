package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.support.v4.os.CancellationSignal;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public abstract class k {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f68273b;

    public abstract q<VideoCreation> a(Object obj, SynthetiseResult synthetiseResult);

    public abstract q<? extends at> a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult);

    public abstract ei<SynthetiseResult> a(Object obj);

    public abstract ei<VideoCreation> a(Object obj, VideoCreation videoCreation);

    public abstract long b(Object obj);

    public Bitmap c(Object obj) {
        return null;
    }

    public boolean d(Object obj) {
        return false;
    }

    public ei<SynthetiseResult> a(Object obj, CancellationSignal cancellationSignal) {
        if (!PatchProxy.isSupport(new Object[]{obj, cancellationSignal}, this, f68273b, false, 73903, new Class[]{Object.class, CancellationSignal.class}, ei.class)) {
            return a(obj);
        }
        return (ei) PatchProxy.accessDispatch(new Object[]{obj, cancellationSignal}, this, f68273b, false, 73903, new Class[]{Object.class, CancellationSignal.class}, ei.class);
    }
}
