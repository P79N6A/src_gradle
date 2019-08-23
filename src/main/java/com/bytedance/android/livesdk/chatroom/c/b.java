package com.bytedance.android.livesdk.chatroom.c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.chatroom.model.e;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9858a;

    public static void a(Context context, e eVar) {
        Context context2 = context;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{context2, eVar2}, null, f9858a, true, 4291, new Class[]{Context.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, eVar2}, null, f9858a, true, 4291, new Class[]{Context.class, e.class}, Void.TYPE);
            return;
        }
        switch (eVar2.f11113f) {
            case 2:
                j.q().f().a(context2, c.b(eVar2.f11111d).a(eVar2.f11109b));
                return;
            case 3:
                i iVar = new i(eVar2.f11111d);
                iVar.a("is_first_consume", String.valueOf(com.bytedance.android.livesdk.wallet.b.b.a(TTLiveSDKContext.getHostService().k().a())));
                a.a().a((Object) new aa(iVar.a(), "banner"));
                return;
            default:
                i iVar2 = new i(eVar2.f11111d);
                iVar2.a(PushConstants.TITLE, eVar2.f11109b);
                j.q().m().a(context2, Uri.parse(iVar2.a()));
                return;
        }
    }
}
