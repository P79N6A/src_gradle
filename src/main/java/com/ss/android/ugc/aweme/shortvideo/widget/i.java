package com.ss.android.ugc.aweme.shortvideo.widget;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71461a;

    /* renamed from: b  reason: collision with root package name */
    private final h f71462b;

    i(h hVar) {
        this.f71462b = hVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71461a, false, 81470, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71461a, false, 81470, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        h hVar = this.f71462b;
        r.a("publish_retry", (Map) d.a().a("action_type", "cancel").a("creation_id", hVar.f71454d.p()).f34114b);
        hVar.dismiss();
    }
}
