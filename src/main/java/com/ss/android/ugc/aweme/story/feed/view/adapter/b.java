package com.ss.android.ugc.aweme.story.feed.view.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72717a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryImageViewHolder f72718b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.story.api.model.b f72719c;

    b(StoryImageViewHolder storyImageViewHolder, com.ss.android.ugc.aweme.story.api.model.b bVar) {
        this.f72718b = storyImageViewHolder;
        this.f72719c = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f72717a, false, 83940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72717a, false, 83940, new Class[0], Void.TYPE);
            return;
        }
        this.f72718b.c(this.f72719c);
    }
}
