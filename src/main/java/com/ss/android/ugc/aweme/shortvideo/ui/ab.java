package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Build;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70739a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f70740b;

    ab(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f70740b = vEVideoPublishPreviewActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70739a, false, 80355, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70739a, false, 80355, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f70740b;
        if (Build.VERSION.SDK_INT >= 21) {
            vEVideoPublishPreviewActivity.finishAfterTransition();
        } else {
            vEVideoPublishPreviewActivity.finish();
        }
    }
}
