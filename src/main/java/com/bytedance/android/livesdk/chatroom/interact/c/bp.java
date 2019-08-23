package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.bytedance.android.livesdk.chatroom.model.a.m;
import com.bytedance.android.livesdk.j.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class bp implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10448a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10449b;

    public bp(bl blVar) {
        this.f10449b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10448a, false, 4731, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10448a, false, 4731, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10449b;
        d dVar = (d) obj;
        m mVar = (m) dVar.f7871b;
        blVar.f10436b.m = mVar.f11059a;
        blVar.f10436b.n = mVar.f11060b;
        blVar.f10436b.h = true;
        ((bl.a) blVar.b()).d();
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TURN_ON_SUCCEED");
        hashMap.put("accesskey", ((m) dVar.f7871b).f11059a);
        hashMap.put("link_mic_id", Integer.valueOf(((m) dVar.f7871b).f11060b));
        hashMap.put("channel_id", Long.valueOf(blVar.f10436b.f9030d));
        c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }
}
