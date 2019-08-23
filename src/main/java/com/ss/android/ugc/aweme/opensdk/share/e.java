package com.ss.android.ugc.aweme.opensdk.share;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.openauthorize.c.a;
import com.ss.android.ugc.aweme.openauthorize.c.b;
import com.ss.android.ugc.aweme.opensdk.share.share.Share;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58395a;

    /* renamed from: b  reason: collision with root package name */
    public a f58396b;

    /* renamed from: c  reason: collision with root package name */
    public Share.Request f58397c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f58398d;

    public e(Activity activity, c cVar) {
        Share.Request request;
        c cVar2 = cVar;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.mClientKey)) {
            this.f58398d = activity;
            this.f58396b = b.a(activity);
            Bundle shareRequestBundle = cVar.getShareRequestBundle();
            if (PatchProxy.isSupport(new Object[]{shareRequestBundle}, null, com.ss.android.ugc.aweme.opensdk.share.share.a.f58423a, true, 63455, new Class[]{Bundle.class}, Share.Request.class)) {
                request = (Share.Request) PatchProxy.accessDispatch(new Object[]{shareRequestBundle}, null, com.ss.android.ugc.aweme.opensdk.share.share.a.f58423a, true, 63455, new Class[]{Bundle.class}, Share.Request.class);
            } else if (shareRequestBundle == null) {
                request = null;
            } else {
                Share.Request request2 = new Share.Request();
                request2.fromBundle(shareRequestBundle);
                request = request2;
            }
            this.f58397c = request;
        }
    }

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f58395a, false, 63406, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f58395a, false, 63406, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f58397c != null) {
            Share.Response response = new Share.Response();
            response.errorCode = a.a(i);
            response.state = this.f58397c.mState;
            response.errorMsg = str;
            this.f58396b.a((com.bytedance.sdk.account.b.c.a) this.f58397c, (com.bytedance.sdk.account.b.c.b) response);
            r.a("share_error_status", (Map) d.a().a("launch_from", this.f58397c.mClientKey).a("error_code", i).f34114b);
        }
    }
}
