package com.ss.android.ugc.aweme.story.shootvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73511a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryEditLayout f73512b;

    s(StoryEditLayout storyEditLayout) {
        this.f73512b = storyEditLayout;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73511a, false, 85294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73511a, false, 85294, new Class[0], Void.TYPE);
            return;
        }
        this.f73512b.f73431b = false;
    }
}
