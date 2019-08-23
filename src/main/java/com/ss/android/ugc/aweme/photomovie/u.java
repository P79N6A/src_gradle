package com.ss.android.ugc.aweme.photomovie;

import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.gq;
import org.json.JSONObject;

public final class u implements k<SynthetiseResult> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59052a;

    u() {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f59052a, false, 64042, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f59052a, false, 64042, new Class[]{SynthetiseResult.class}, Void.TYPE);
            return;
        }
        n.a("aweme_photo_movie_synthesis_error_rate", 0, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f59052a, false, 64043, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f59052a, false, 64043, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (th2 instanceof gq) {
            i = ((gq) th2).getCode();
        }
        n.a("aweme_photo_movie_synthesis_error_rate", i, (JSONObject) null);
        n.b("aweme_movie_publish_log", "aweme_photo_movie_synthesis_error_rate", c.a().a("exception", com.google.common.a.u.b(th)).b());
    }
}
