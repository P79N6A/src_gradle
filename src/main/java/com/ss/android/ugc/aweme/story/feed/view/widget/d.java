package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.a.a;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72970a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryAuthorWidget f72971b;

    public d(StoryAuthorWidget storyAuthorWidget) {
        this.f72971b = storyAuthorWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72970a, false, 84262, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72970a, false, 84262, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        StoryAuthorWidget storyAuthorWidget = this.f72971b;
        a.a().a("dismiss_sticker_pop_up_window", Boolean.class).setValue(Boolean.TRUE);
        ChangeUserModeViewModel.a((FragmentActivity) storyAuthorWidget.c()).setValue("click_close");
        ((FragmentActivity) storyAuthorWidget.c()).supportFinishAfterTransition();
    }
}
