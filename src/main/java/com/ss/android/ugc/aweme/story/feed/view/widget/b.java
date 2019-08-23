package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72966a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryAuthorWidget f72967b;

    public b(StoryAuthorWidget storyAuthorWidget) {
        this.f72967b = storyAuthorWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72966a, false, 84260, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72966a, false, 84260, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f72967b.f();
    }
}
