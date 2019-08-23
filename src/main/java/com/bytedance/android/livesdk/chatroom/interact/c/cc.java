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

public final /* synthetic */ class cc implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10477a;

    /* renamed from: b  reason: collision with root package name */
    private final am f10478b;

    cc(am amVar) {
        this.f10478b = amVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10477a, false, 4744, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10477a, false, 4744, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        am amVar = this.f10478b;
        d dVar = (d) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(PushConstants.CONTENT, 6);
        hashMap.put("accesskey", ((l) dVar.f7871b).f11057a);
        hashMap.put("link_mic_id", Integer.valueOf(((l) dVar.f7871b).f11058b));
        hashMap.put("channel_id", Long.valueOf(amVar.g));
        c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }
}
