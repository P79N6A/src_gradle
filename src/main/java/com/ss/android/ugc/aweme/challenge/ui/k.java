package com.ss.android.ugc.aweme.challenge.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35693a;

    /* renamed from: b  reason: collision with root package name */
    private final User f35694b;

    /* renamed from: c  reason: collision with root package name */
    private final Challenge f35695c;

    k(User user, Challenge challenge) {
        this.f35694b = user;
        this.f35695c = challenge;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35693a, false, 26169, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35693a, false, 26169, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        User user = this.f35694b;
        r.a("enter_personal_detail", (Map) d.a().a("enter_from", "challenge").a("to_user_id", user.getUid()).a("enter_method", "click_name").a("tag_id", this.f35695c.getCid()).b().f34114b);
        h a2 = h.a();
        a2.a(j.a("aweme://user/profile/" + user.getUid()).a("sec_user_id", user.getSecUid()).a());
    }
}
