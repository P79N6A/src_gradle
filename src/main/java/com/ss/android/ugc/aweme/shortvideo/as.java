package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.property.f;

public final class as implements k<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65746a;

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f65746a, false, 74048, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f65746a, false, 74048, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        n.a("aweme_movie_publish_error_rate_sdk", cu.a(13, th2), c.a().a("exception", com.facebook.common.internal.k.c(th)).b());
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        at atVar = (at) obj;
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f65746a, false, 74047, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f65746a, false, 74047, new Class[]{at.class}, Void.TYPE);
            return;
        }
        t tVar = new t();
        t a2 = tVar.a("enableHardRecord", f.a());
        n.a("aweme_movie_publish_error_rate_sdk", 0, a2.a("enableHardSynthetic", f.b()).a());
    }
}
