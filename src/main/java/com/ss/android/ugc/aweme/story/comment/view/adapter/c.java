package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72286a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoListAdapter f72287b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72288c;

    c(VideoListAdapter videoListAdapter, int i) {
        this.f72287b = videoListAdapter;
        this.f72288c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72286a, false, 82990, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72286a, false, 82990, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoListAdapter videoListAdapter = this.f72287b;
        videoListAdapter.f72257b.a(this.f72288c);
    }
}
