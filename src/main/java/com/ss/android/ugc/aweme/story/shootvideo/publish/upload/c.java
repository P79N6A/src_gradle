package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import android.support.annotation.NonNull;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.cu;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import javax.annotation.Nullable;

public final class c implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73728a;

    public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Object obj) {
    }

    public final void onFailure(@NonNull Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f73728a, false, 85464, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f73728a, false, 85464, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        int a2 = cu.a(11, th2);
        String c2 = com.facebook.common.internal.k.c(th);
        n.b("story_photo_publish_log", "fetch_upload_parameters_error", com.ss.android.ugc.aweme.app.d.c.a().a("exception", c2).b());
        n.a("story_photo_publish_error_rate", a2, com.ss.android.ugc.aweme.app.d.c.a().a("exception", c2).b());
    }
}
