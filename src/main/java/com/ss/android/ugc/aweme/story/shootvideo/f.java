package com.ss.android.ugc.aweme.story.shootvideo;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fb;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73513a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoStoryEditPublishActivity f73514b;

    f(VideoStoryEditPublishActivity videoStoryEditPublishActivity) {
        this.f73514b = videoStoryEditPublishActivity;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73513a, false, 85149, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f73513a, false, 85149, new Class[]{Object.class}, Object.class);
        }
        VideoStoryEditPublishActivity videoStoryEditPublishActivity = this.f73514b;
        fb.a((View) videoStoryEditPublishActivity.c(), (Context) videoStoryEditPublishActivity.d(), videoStoryEditPublishActivity.f73387e.D.d(), videoStoryEditPublishActivity.f73387e.D.e());
        videoStoryEditPublishActivity.a();
        return null;
    }
}
