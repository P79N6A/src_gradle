package com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout;

public final /* synthetic */ class c implements ColorSelectLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73426a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryBrushLayout f73427b;

    c(StoryBrushLayout storyBrushLayout) {
        this.f73427b = storyBrushLayout;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73426a, false, 85190, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73426a, false, 85190, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        StoryBrushLayout storyBrushLayout = this.f73427b;
        if (storyBrushLayout.f73414f != null) {
            storyBrushLayout.f73414f.a(i);
        }
    }
}
