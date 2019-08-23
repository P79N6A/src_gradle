package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class gp implements k<SynthetiseResult> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67954a;

    public final void onFailure(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f67954a, false, 74750, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f67954a, false, 74750, new Class[]{Throwable.class}, Void.TYPE);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f67954a, false, 74749, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f67954a, false, 74749, new Class[]{SynthetiseResult.class}, Void.TYPE);
        }
    }
}
