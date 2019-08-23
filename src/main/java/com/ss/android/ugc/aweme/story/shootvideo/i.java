package com.ss.android.ugc.aweme.story.shootvideo;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73626a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoStoryEditPublishActivity f73627b;

    i(VideoStoryEditPublishActivity videoStoryEditPublishActivity) {
        this.f73627b = videoStoryEditPublishActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73626a, false, 85152, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73626a, false, 85152, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f73627b.f73387e.e();
    }
}
