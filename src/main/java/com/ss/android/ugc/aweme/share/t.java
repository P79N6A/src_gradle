package com.ss.android.ugc.aweme.share;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.model.g;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65304a;

    /* renamed from: b  reason: collision with root package name */
    private final g f65305b;

    public t(g gVar) {
        this.f65305b = gVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65304a, false, 72984, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65304a, false, 72984, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        g gVar = this.f65305b;
        if (!TextUtils.isEmpty(gVar.getOpenUrl())) {
            com.ss.android.ugc.aweme.commercialize.utils.g.a(view.getContext(), gVar.getOpenUrl(), false);
        } else if (!TextUtils.isEmpty(gVar.getWebUrl())) {
            com.ss.android.ugc.aweme.commercialize.utils.g.a(view.getContext(), gVar.getWebUrl(), gVar.getWebUrlTitle());
        }
        r.a("click_link", (Map) d.a().a("prop_id", gVar.getCommerceStickerId()).a("enter_from", "release").a("link_type", "web_link").f34114b);
    }
}
