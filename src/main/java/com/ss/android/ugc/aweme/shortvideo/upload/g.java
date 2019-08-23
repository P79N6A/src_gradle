package com.ss.android.ugc.aweme.shortvideo.upload;

import com.google.common.a.u;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.cu;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import javax.annotation.Nullable;
import org.json.JSONObject;

public final class g implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71018a;

    public g() {
        n.a("aweme_movie_publish_error_rate_parallel", -1, (JSONObject) null);
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f71018a, false, 80779, new Class[]{VideoCreation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f71018a, false, 80779, new Class[]{VideoCreation.class}, Void.TYPE);
            return;
        }
        n.a("fetch_upload_parameters_error_parallel", 0, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f71018a, false, 80780, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f71018a, false, 80780, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        int a2 = cu.a(11, th2);
        String b2 = u.b(th);
        n.a("fetch_upload_parameters_error_parallel", 1, bi.a().a("exception", b2).b());
        n.a("aweme_movie_publish_error_rate_parallel", a2, bi.a().a("exception", b2).b());
    }
}
