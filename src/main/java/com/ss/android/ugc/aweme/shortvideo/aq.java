package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import org.json.JSONObject;

public final class aq implements k<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65657a;

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        at atVar = (at) obj;
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f65657a, false, 74043, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f65657a, false, 74043, new Class[]{at.class}, Void.TYPE);
            return;
        }
        n.a("aweme_movie_publish_error_rate", 0, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f65657a, false, 74044, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f65657a, false, 74044, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        n.a("aweme_movie_publish_error_rate", cu.a(13, th2), c.a().a("exception", com.facebook.common.internal.k.c(th)).b());
    }
}
