package com.ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.sticker.model.a;
import java.util.Map;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71729a;

    /* renamed from: b  reason: collision with root package name */
    private final a f71730b;

    f(a aVar) {
        this.f71730b = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71729a, false, 82048, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71729a, false, 82048, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        a aVar = this.f71730b;
        r.a("click_aduser_head", (Map) new d().a("enter_from", "prop_page").a("to_user_id", aVar.getAdOwnerId()).a("prop_id", aVar.getId()).f34114b);
        r.a("enter_personal_detail", (Map) new d().a("enter_from", "prop_page").a("to_user_id", aVar.getAdOwnerId()).a("prop_id", aVar.getId()).f34114b);
        h a2 = h.a();
        a2.a("aweme://user/profile/" + aVar.getAdOwnerId());
    }
}
