package com.bytedance.android.livesdk.player;

import android.content.Context;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.a.a;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.c.a.c;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16804a;

    public final ITTLivePlayer a(Context context, a aVar) throws Exception {
        Context context2 = context;
        a aVar2 = aVar;
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, this, f16804a, false, 12714, new Class[]{Context.class, a.class}, ITTLivePlayer.class)) {
            return (ITTLivePlayer) PatchProxy.accessDispatch(new Object[]{context2, aVar2}, this, f16804a, false, 12714, new Class[]{Context.class, a.class}, ITTLivePlayer.class);
        }
        k kVar = new k(context2);
        kVar.f16832c = false;
        kVar.f16834e = aVar2;
        if (PatchProxy.isSupport(new Object[0], kVar, k.f16830a, false, 12753, new Class[0], ITTLivePlayer.class)) {
            return (ITTLivePlayer) PatchProxy.accessDispatch(new Object[0], kVar, k.f16830a, false, 12753, new Class[0], ITTLivePlayer.class);
        }
        kVar.g = new l(kVar.f16834e);
        c.a aVar3 = new c.a(kVar.f16831b.getApplicationContext(), (byte) 0);
        aVar3.g = 300000;
        aVar3.f78327d = new m();
        aVar3.f78328e = false;
        aVar3.f78329f = false;
        if (!kVar.f16832c) {
            i = 1;
        }
        aVar3.h = i;
        aVar3.f78325b = kVar.g;
        if (aVar3.f78324a == null) {
            throw new IllegalArgumentException("mContext should not be null");
        } else if (aVar3.f78325b == null) {
            throw new IllegalArgumentException("mListener should not be null");
        } else if (aVar3.f78327d != null) {
            kVar.f16835f = new c(aVar3, (byte) 0);
            if (((Boolean) LiveSettingKeys.PLAYER_ENABLE_UPLOAD_TIME_LINE.a()).booleanValue()) {
                c cVar = kVar.f16835f;
                cVar.I = true;
                cVar.f78306c.Z = true;
            }
            if (((Integer) LiveSettingKeys.DNS_OPT_METHOD.a()).intValue() == 1) {
                c cVar2 = kVar.f16835f;
                com.ss.optimizer.live.sdk.dns.a a2 = j.q().e().a();
                cVar2.e("setDns");
                cVar2.F = a2;
                cVar2.f78306c.v = true;
            }
            return new j(kVar);
        } else {
            throw new IllegalArgumentException("mNetworkClient should not be null");
        }
    }
}
