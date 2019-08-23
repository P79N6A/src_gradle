package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74262a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryTextRecordLayout f74263b;

    l(StoryTextRecordLayout storyTextRecordLayout) {
        this.f74263b = storyTextRecordLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74262a, false, 86235, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74262a, false, 86235, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        StoryTextRecordLayout storyTextRecordLayout = this.f74263b;
        j.a().b();
        storyTextRecordLayout.a(false);
    }
}
