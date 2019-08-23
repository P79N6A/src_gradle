package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.listener.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.e.a;
import java.util.Map;
import org.json.JSONObject;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45556a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45557b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45558c;

    j(d dVar, Aweme aweme) {
        this.f45557b = dVar;
        this.f45558c = aweme;
    }

    public final void onEvent(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45556a, false, 40026, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45556a, false, 40026, new Class[]{String.class}, Void.TYPE);
            return;
        }
        d dVar = this.f45557b;
        Aweme aweme = this.f45558c;
        if (!"homepage_follow".equals(dVar.r)) {
            String str2 = dVar.r;
            JSONObject g = dVar.g(aweme);
            String a2 = a.a();
            if (PatchProxy.isSupport(new Object[]{str2, aweme, g, (byte) 0, a2}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27379, new Class[]{String.class, Aweme.class, JSONObject.class, Boolean.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, aweme, g, (byte) 0, a2}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27379, new Class[]{String.class, Aweme.class, JSONObject.class, Boolean.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (str2.equals("opus")) {
                str2 = "others_homepage";
            }
            String str3 = str2;
            r.a(d.a(), "comment", str3, aweme.getAid(), 0, a.a(g, aweme, a2));
            r.a("comment", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str2).a("group_id", aweme.getAid()).f34114b);
        }
    }
}
