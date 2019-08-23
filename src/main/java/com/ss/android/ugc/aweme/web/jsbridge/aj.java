package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.session.a;
import org.json.JSONObject;

public final class aj implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76706a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76706a, false, 90037, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76706a, false, 90037, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        ((com.ss.android.ugc.aweme.notification.c.d) c.a(GlobalContext.getContext(), com.ss.android.ugc.aweme.notification.c.d.class)).b(true);
        a noticeSession = b.a().getNoticeSession("game_helper");
        if (noticeSession != null) {
            noticeSession.o = 1;
            b.a().updateNoticeSession(noticeSession);
        }
    }
}
