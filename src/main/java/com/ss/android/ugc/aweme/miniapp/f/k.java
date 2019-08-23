package com.ss.android.ugc.aweme.miniapp.f;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.commerce.c.f;
import com.ss.android.ugc.aweme.commerce.service.a.c;
import com.ss.android.ugc.aweme.miniapp_api.a.e;
import com.ss.android.ugc.aweme.miniapp_api.b.b;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3589a;

    public final void a(Context context, b bVar) {
        IWXAPI iwxapi;
        Context context2 = context;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2}, this, f3589a, false, 59451, new Class[]{Context.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bVar2}, this, f3589a, false, 59451, new Class[]{Context.class, b.class}, Void.TYPE);
            return;
        }
        BaseAppData a2 = BaseAppData.a();
        if (PatchProxy.isSupport(new Object[]{context2}, a2, BaseAppData.f2496a, false, 18349, new Class[]{Context.class}, IWXAPI.class)) {
            iwxapi = (IWXAPI) PatchProxy.accessDispatch(new Object[]{context2}, a2, BaseAppData.f2496a, false, 18349, new Class[]{Context.class}, IWXAPI.class);
        } else if (!StringUtils.isEmpty(a2.O)) {
            iwxapi = WXAPIFactory.createWXAPI(context2, a2.O, true);
        } else {
            iwxapi = null;
        }
        if (iwxapi != null) {
            iwxapi.registerApp(BaseAppData.a().O);
        }
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = bVar2.f55993a;
        req.path = bVar2.f55994b;
        req.miniprogramType = bVar2.f55996d;
        iwxapi.sendReq(req);
    }

    public final void a(Activity activity, JSONObject jSONObject, c cVar) throws Exception {
        f fVar;
        Activity activity2 = activity;
        JSONObject jSONObject2 = jSONObject;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{activity2, jSONObject2, cVar2}, this, f3589a, false, 59452, new Class[]{Activity.class, JSONObject.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, jSONObject2, cVar2}, this, f3589a, false, 59452, new Class[]{Activity.class, JSONObject.class, c.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2, cVar2}, null, com.ss.android.ugc.aweme.commerce.c.e.f36775a, true, 28291, new Class[]{Context.class, c.class}, f.class)) {
            fVar = (f) PatchProxy.accessDispatch(new Object[]{activity2, cVar2}, null, com.ss.android.ugc.aweme.commerce.c.e.f36775a, true, 28291, new Class[]{Context.class, c.class}, f.class);
        } else {
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(cVar2, "payCallback");
            fVar = new f(new WeakReference(activity2), new com.ss.android.ugc.aweme.commerce.c.c(cVar2));
        }
        fVar.a(jSONObject2);
    }
}
