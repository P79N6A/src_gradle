package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.bytedance.android.livesdk.chatroom.model.a.f;
import com.bytedance.android.livesdk.chatroom.model.a.i;
import com.bytedance.android.livesdk.utils.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;

public final /* synthetic */ class dx implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10590a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10591b;

    dx(cy cyVar) {
        this.f10591b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10590a, false, 4848, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10590a, false, 4848, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10591b;
        b bVar = (b) obj;
        cyVar.f10532c = false;
        if (bVar.f7872c == null) {
            ((cy.b) cyVar.b()).b((Throwable) new Exception());
            return;
        }
        List<i> list = ((f) bVar.f7872c).f11037a;
        String str = ((f) bVar.f7872c).f11038b;
        if (PatchProxy.isSupport(new Object[]{(byte) 0, list, str}, cyVar, cy.f10530a, false, 4821, new Class[]{Boolean.TYPE, List.class, String.class}, Void.TYPE)) {
            cy cyVar2 = cyVar;
            PatchProxy.accessDispatch(new Object[]{(byte) 0, list, str}, cyVar2, cy.f10530a, false, 4821, new Class[]{Boolean.TYPE, List.class, String.class}, Void.TYPE);
            return;
        }
        if (!cyVar.f10533d) {
            cyVar.f10533d = true;
            e a2 = e.a();
            a2.l = false;
            a2.m = 0;
            a2.n = 0;
            HashMap hashMap = new HashMap();
            hashMap.put("link_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            hashMap.put("guest_supported_vendor", String.valueOf(com.bytedance.android.livesdk.chatroom.interact.data.b.f10870f));
            hashMap.put("guest_supported_layout", "15");
            hashMap.put("payed_money", PushConstants.PUSH_TYPE_NOTIFY);
            hashMap.put("link_duration", PushConstants.PUSH_TYPE_NOTIFY);
            ((ab) cyVar.u.apply(cyVar.p.getId(), hashMap).as(cyVar.p())).a(new dp(cyVar), new dq(cyVar));
            aa.a(cyVar.p, false, "");
        }
    }
}
