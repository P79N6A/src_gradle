package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.u;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import javax.annotation.Nullable;
import org.json.JSONObject;

public final class bk implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65810a;

    public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Object obj) {
    }

    public bk() {
        n.a("aweme_movie_publish_error_rate_sdk", -1, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f65810a, false, 74111, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f65810a, false, 74111, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        n.a("aweme_movie_publish_error_rate_sdk", cu.a(11, th2), bi.a().a("exception", u.b(th)).b());
    }
}
