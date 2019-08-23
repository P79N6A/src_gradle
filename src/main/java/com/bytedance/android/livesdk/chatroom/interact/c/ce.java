package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.a.l;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.message.model.am;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class ce implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10481a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10482b;

    /* renamed from: c  reason: collision with root package name */
    private final am f10483c;

    ce(int i, am amVar) {
        this.f10482b = i;
        this.f10483c = amVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10481a, false, 4746, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10481a, false, 4746, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        int i = this.f10482b;
        am amVar = this.f10483c;
        d dVar = (d) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(PushConstants.CONTENT, Integer.valueOf(i));
        hashMap.put("accesskey", ((l) dVar.f7871b).f11057a);
        hashMap.put("link_mic_id", Integer.valueOf(((l) dVar.f7871b).f11058b));
        hashMap.put("channel_id", Long.valueOf(amVar.g));
        c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }
}
