package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public final class hg implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68134a;

    public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Object obj) {
    }

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f68134a, false, 74837, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f68134a, false, 74837, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        n.a("aweme_movie_publish_error_rate_sdk", cu.a(13, th2), bi.a().a("exception", com.facebook.common.internal.k.c(th)).b());
    }
}
