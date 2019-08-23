package com.ss.android.ugc.aweme.shortvideo.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;

public final /* synthetic */ class am implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70768a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70769b;

    am(VideoPublishFragment videoPublishFragment) {
        this.f70769b = videoPublishFragment;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f70768a, false, 80477, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f70768a, false, 80477, new Class[]{i.class}, Object.class);
        }
        VideoPublishFragment videoPublishFragment = this.f70769b;
        if (PatchProxy.isSupport(new Object[0], videoPublishFragment, VideoPublishFragment.f70600a, false, 80422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], videoPublishFragment, VideoPublishFragment.f70600a, false, 80422, new Class[0], Void.TYPE);
        } else {
            ai.d("VideoPublish finishPrepareEffectPlatform:" + videoPublishFragment.t);
            if (videoPublishFragment.t != null) {
                videoPublishFragment.t.dismiss();
                videoPublishFragment.t = null;
            }
        }
        return null;
    }
}
