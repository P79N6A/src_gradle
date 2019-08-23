package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.u;
import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public final /* synthetic */ class bh implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11287a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11288b;

    /* renamed from: c  reason: collision with root package name */
    private final au.c f11289c;

    public bh(au auVar, au.c cVar) {
        this.f11288b = auVar;
        this.f11289c = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11287a, false, 5277, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11287a, false, 5277, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        au auVar = this.f11288b;
        au.c cVar = this.f11289c;
        d dVar = (d) obj;
        cVar.f11248a.q = (u) dVar.f7871b;
        auVar.b(cVar.f11248a);
        ((au.b) auVar.b()).c();
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", ((u) dVar.f7871b).f11168a ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        hashMap.put("money", String.valueOf(((u) dVar.f7871b).f11171d));
        hashMap.put("redpackage_type", cVar.f11248a.f16480e > 0 ? "countdown_five" : "immediate");
        if (cVar.f11248a.f16481f <= 1) {
            hashMap.put("redpackage_content", cVar.f11248a.f16481f == 1 ? "gift_redpackage" : "lucky_redpackage");
        }
        if (!(auVar.f11242b.getOwner() == null || cVar.f11248a.f16477b == null)) {
            hashMap.put("is_anchor", auVar.f11242b.getOwner().getId() == cVar.f11248a.f16477b.getId() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        }
        a a2 = a.a();
        Object[] objArr = new Object[3];
        objArr[0] = new j().a(auVar.f11243c ? "live_take_detail" : "live_detail").e(auVar.f11244d).f("other").b("live_function").c("popup");
        objArr[1] = new k();
        objArr[2] = Room.class;
        a2.a("redpackage_grab", hashMap, objArr);
    }
}
