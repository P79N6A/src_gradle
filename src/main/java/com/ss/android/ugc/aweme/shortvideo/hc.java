package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel;

public final /* synthetic */ class hc implements RecordToolBarModel.OnAnimateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68076a;

    /* renamed from: b  reason: collision with root package name */
    static final RecordToolBarModel.OnAnimateListener f68077b = new hc();

    private hc() {
    }

    public final void onAnimate(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f68076a, false, 74821, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f68076a, false, 74821, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new hd(view2)).withEndAction(new he(view2));
    }
}
