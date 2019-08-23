package com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73424a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryBrushLayout f73425b;

    b(StoryBrushLayout storyBrushLayout) {
        this.f73425b = storyBrushLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73424a, false, 85189, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73424a, false, 85189, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        StoryBrushLayout storyBrushLayout = this.f73425b;
        if (PatchProxy.isSupport(new Object[0], storyBrushLayout, StoryBrushLayout.f73409a, false, 85186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], storyBrushLayout, StoryBrushLayout.f73409a, false, 85186, new Class[0], Void.TYPE);
            return;
        }
        if (storyBrushLayout.g == 2) {
            storyBrushLayout.g = 1;
            storyBrushLayout.f73411c.setImageResource(2130840324);
            if (storyBrushLayout.f73414f != null) {
                storyBrushLayout.f73414f.a(32.0f);
            }
        } else if (storyBrushLayout.g == 3) {
            storyBrushLayout.g = 2;
            storyBrushLayout.f73411c.setImageResource(2130840326);
            if (storyBrushLayout.f73414f != null) {
                storyBrushLayout.f73414f.a(16.0f);
            }
        } else if (storyBrushLayout.g == 1) {
            storyBrushLayout.g = 3;
            storyBrushLayout.f73411c.setImageResource(2130840325);
            if (storyBrushLayout.f73414f != null) {
                storyBrushLayout.f73414f.a(8.0f);
            }
        }
    }
}
