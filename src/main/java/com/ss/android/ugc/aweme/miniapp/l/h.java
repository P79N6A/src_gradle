package com.ss.android.ugc.aweme.miniapp.l;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.miniapp.views.a;
import com.tt.miniapphost.process.HostProcessBridge;
import org.json.JSONObject;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55835a;

    /* renamed from: b  reason: collision with root package name */
    private final a f55836b;

    h(a aVar) {
        this.f55836b = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55835a, false, 59553, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55835a, false, 59553, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f55836b.dismiss();
        HostProcessBridge.logEvent("click_mp_follow_dialog", new JSONObject(d.a().a("final_status", "cancel").f34114b));
    }
}
