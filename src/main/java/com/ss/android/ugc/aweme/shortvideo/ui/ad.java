package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class ad implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70746a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishActivity f70747b;

    ad(VideoPublishActivity videoPublishActivity) {
        this.f70747b = videoPublishActivity;
    }

    public final void onClick(View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, f70746a, false, 80413, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70746a, false, 80413, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoPublishActivity videoPublishActivity = this.f70747b;
        if (PatchProxy.isSupport(new Object[0], videoPublishActivity, VideoPublishActivity.f70590a, false, 80403, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], videoPublishActivity, VideoPublishActivity.f70590a, false, 80403, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = ((VideoPublishFragment) videoPublishActivity.getSupportFragmentManager().findFragmentById(C0906R.id.aic)).o;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[0], videoPublishActivity, VideoPublishActivity.f70590a, false, 80402, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], videoPublishActivity, VideoPublishActivity.f70590a, false, 80402, new Class[0], Void.TYPE);
            } else {
                new a.C0185a(videoPublishActivity).b((int) C0906R.string.bux).a((int) C0906R.string.aja, (DialogInterface.OnClickListener) new ae(videoPublishActivity)).b((int) C0906R.string.pm, af.f70751b).a().a();
            }
        } else {
            videoPublishActivity.c();
        }
        r.a("video_post_page_cancel", (Map) d.a().a("creation_id", videoPublishActivity.f70594e.creationId).a("shoot_way", videoPublishActivity.f70594e.mShootWay).a("draft_id", videoPublishActivity.f70594e.draftId).f34114b);
    }
}
