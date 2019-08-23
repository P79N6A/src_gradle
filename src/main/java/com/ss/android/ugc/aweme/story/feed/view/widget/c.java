package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72968a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryAuthorWidget f72969b;

    public c(StoryAuthorWidget storyAuthorWidget) {
        this.f72969b = storyAuthorWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72968a, false, 84261, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72968a, false, 84261, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f72969b.f();
    }
}
