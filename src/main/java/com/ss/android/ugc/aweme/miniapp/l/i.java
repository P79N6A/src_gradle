package com.ss.android.ugc.aweme.miniapp.l;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.miniapp.views.a;
import com.ss.android.ugc.aweme.miniapp_api.model.e;
import com.tt.miniapphost.process.HostProcessBridge;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55837a;

    /* renamed from: b  reason: collision with root package name */
    private final e f55838b;

    /* renamed from: c  reason: collision with root package name */
    private final long f55839c;

    /* renamed from: d  reason: collision with root package name */
    private final a f55840d;

    i(e eVar, long j, a aVar) {
        this.f55838b = eVar;
        this.f55839c = j;
        this.f55840d = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55837a, false, 59554, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55837a, false, 59554, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        e eVar = this.f55838b;
        long j = this.f55839c;
        a aVar = this.f55840d;
        HostProcessBridge.logEvent("click_mp_follow_dialog", new JSONObject(d.a().a("final_status", "confirm").f34114b));
        long j2 = eVar.f56029a;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), new Long(j)}, null, e.f55824a, true, 59550, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), new Long(j)}, null, e.f55824a, true, 59550, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
        } else {
            a.i.a((Callable<TResult>) new j<TResult>(j2, j));
        }
        aVar.dismiss();
    }
}
