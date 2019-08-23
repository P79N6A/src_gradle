package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.cu;

public final class a implements k<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73725a;

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f73725a, false, 85461, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f73725a, false, 85461, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        n.a("story_movie_publish_error_rate_sdk", cu.a(13, th2), c.a().a("exception", com.facebook.common.internal.k.c(th)).b());
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        at atVar = (at) obj;
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f73725a, false, 85460, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f73725a, false, 85460, new Class[]{at.class}, Void.TYPE);
            return;
        }
        t tVar = new t();
        t a2 = tVar.a("enableHardRecord", f.a());
        n.a("story_movie_publish_error_rate_sdk", 0, a2.a("enableHardSynthetic", f.b()).a());
    }
}
