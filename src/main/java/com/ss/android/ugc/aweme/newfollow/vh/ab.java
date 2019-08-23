package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.newfollow.e.f;
import com.ss.android.ugc.aweme.shortvideo.f.d;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57696a;

    /* renamed from: b  reason: collision with root package name */
    private final f f57697b;

    public ab(f fVar) {
        this.f57697b = fVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57696a, false, 62671, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57696a, false, 62671, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        f fVar = this.f57697b;
        bg.a(new d(false));
        r.a("publish_retry", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "cancel").a("creation_id", fVar.f57113a.p()).f34114b);
    }
}
