package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigureExtension;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.util.concurrent.Callable;

public final /* synthetic */ class aj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70758a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70759b;

    /* renamed from: c  reason: collision with root package name */
    private final c f70760c;

    aj(VideoPublishFragment videoPublishFragment, c cVar) {
        this.f70759b = videoPublishFragment;
        this.f70760c = cVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f70758a, false, 80472, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f70758a, false, 80472, new Class[0], Object.class);
        }
        VideoPublishFragment videoPublishFragment = this.f70759b;
        c cVar = this.f70760c;
        if (videoPublishFragment.n.mIsFromDraft) {
            if ((videoPublishFragment.n.previewConfigure == null || cVar.T() != null) && !cVar.T().isEmpty()) {
                ai.a("don't copy draft dir");
            } else {
                ai.a("draftOpt==>try copy video data when the copySegment is empty for old draft created by fast import");
                VEPreviewConfigureExtension.copy2Draft(videoPublishFragment.n.previewConfigure, cVar);
            }
            return null;
        }
        ai.a("copy draft dir");
        com.ss.android.ugc.aweme.shortvideo.a.c.f65441b.a(videoPublishFragment.n).a(al.f70767b);
        if (videoPublishFragment.n.previewConfigure != null) {
            VEPreviewConfigureExtension.copy2Draft(videoPublishFragment.n.previewConfigure, cVar);
        }
        return null;
    }
}
