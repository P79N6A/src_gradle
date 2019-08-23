package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.cu;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public final class p implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73770a;

    public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Object obj) {
    }

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f73770a, false, 85509, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f73770a, false, 85509, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        n.a("story_movie_publish_error_rate_sdk", cu.a(13, th2), bi.a().a("exception", com.facebook.common.internal.k.c(th)).b());
    }
}
