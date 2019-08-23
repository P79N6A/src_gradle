package com.ss.android.ugc.aweme.photo;

import android.support.annotation.NonNull;
import com.google.common.a.u;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.cu;
import org.json.JSONObject;

public final class b implements k<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58480a;

    public final /* synthetic */ void onSuccess(Object obj) {
        at atVar = (at) obj;
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f58480a, false, 63537, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f58480a, false, 63537, new Class[]{at.class}, Void.TYPE);
            return;
        }
        n.a("aweme_photo_publish_error_rate", 0, (JSONObject) null);
    }

    public final void onFailure(@NonNull Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f58480a, false, 63538, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f58480a, false, 63538, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        String b2 = u.b(th);
        int a2 = cu.a(13, th2);
        n.b("aweme_photo_publish_log", "publish_error", c.a().a("exception", b2).b());
        n.a("aweme_photo_publish_error_rate", a2, c.a().a("exception", b2).b());
    }
}
