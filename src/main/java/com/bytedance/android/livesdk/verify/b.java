package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.verify.model.ZhimaPollingResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17688a;

    /* renamed from: b  reason: collision with root package name */
    private final VerifyBrowserFragment f17689b;

    b(VerifyBrowserFragment verifyBrowserFragment) {
        this.f17689b = verifyBrowserFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17688a, false, 13839, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17688a, false, 13839, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VerifyBrowserFragment verifyBrowserFragment = this.f17689b;
        if (((ZhimaPollingResponse) ((d) obj).f7871b).isVerified) {
            verifyBrowserFragment.getActivity().setResult(-1);
            verifyBrowserFragment.getActivity().finish();
            return;
        }
        verifyBrowserFragment.W.a();
    }
}
