package com.ss.android.ugc.aweme.story.feed.view;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72752a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryHomeFeedFragment f72753b;

    d(StoryHomeFeedFragment storyHomeFeedFragment) {
        this.f72753b = storyHomeFeedFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72752a, false, 83891, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72752a, false, 83891, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).launchRecord(this.f72753b.getActivity(), new Intent());
    }
}
