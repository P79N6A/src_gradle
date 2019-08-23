package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.u;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import javax.annotation.Nullable;
import org.json.JSONObject;

public final class bl implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65811a;

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f65811a, false, 74112, new Class[]{VideoCreation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f65811a, false, 74112, new Class[]{VideoCreation.class}, Void.TYPE);
            return;
        }
        n.a("fetch_upload_parameters_error", 0, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f65811a, false, 74113, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f65811a, false, 74113, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        n.a("fetch_upload_parameters_error", 1, bi.a().a("exception", u.b(th)).b());
    }
}
