package com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73422a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryBrushLayout f73423b;

    a(StoryBrushLayout storyBrushLayout) {
        this.f73423b = storyBrushLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73422a, false, 85188, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73422a, false, 85188, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f73423b.a();
    }
}
