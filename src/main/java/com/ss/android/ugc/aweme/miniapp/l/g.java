package com.ss.android.ugc.aweme.miniapp.l;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.miniapp.views.a;
import com.ss.android.ugc.aweme.miniapp_api.model.e;
import com.tt.miniapphost.hostmethod.HostMethodManager;
import com.tt.miniapphost.process.HostProcessBridge;
import org.json.JSONObject;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55830a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f55831b;

    /* renamed from: c  reason: collision with root package name */
    private final long f55832c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f55833d;

    /* renamed from: e  reason: collision with root package name */
    private final HostMethodManager.ResponseCallBack f55834e;

    g(Activity activity, long j, JSONObject jSONObject, HostMethodManager.ResponseCallBack responseCallBack) {
        this.f55831b = activity;
        this.f55832c = j;
        this.f55833d = jSONObject;
        this.f55834e = responseCallBack;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f55830a, false, 59552, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f55830a, false, 59552, new Class[]{i.class}, Object.class);
        }
        Activity activity = this.f55831b;
        long j = this.f55832c;
        JSONObject jSONObject = this.f55833d;
        HostMethodManager.ResponseCallBack responseCallBack = this.f55834e;
        if (iVar.e() != null) {
            e eVar = (e) iVar.e();
            if (eVar == null || eVar.status_code != 0 || eVar.f56030b || iVar.d()) {
                e.a(jSONObject, 1, "already_friends");
                responseCallBack.callResponse(jSONObject.toString());
            } else {
                if (PatchProxy.isSupport(new Object[]{activity, eVar, new Long(j)}, null, e.f55824a, true, 59549, new Class[]{Activity.class, e.class, Long.TYPE}, a.class)) {
                    a aVar = (a) PatchProxy.accessDispatch(new Object[]{activity, eVar, new Long(j)}, null, e.f55824a, true, 59549, new Class[]{Activity.class, e.class, Long.TYPE}, a.class);
                } else {
                    a.b bVar = new a.b(true, -1, -1);
                    a.C0641a d2 = new a.C0641a().a(activity.getString(C0906R.string.ag4), bVar).b(activity.getString(C0906R.string.lq), new a.b(false, -1, Color.parseColor("#c0161823"))).c(activity.getString(C0906R.string.pm), a.b.f55958d).d(activity.getString(C0906R.string.cgm), bVar);
                    d2.o = false;
                    a a2 = d2.a((Context) activity);
                    a2.b(new h(a2));
                    a2.a(new i(eVar, j, a2));
                    a2.setCancelable(false);
                    a2.show();
                    HostProcessBridge.logEvent("show_mp_follow_dialog", new JSONObject(d.a().f34114b));
                }
            }
        }
        return null;
    }
}
