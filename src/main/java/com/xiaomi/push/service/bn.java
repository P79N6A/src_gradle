package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fi;
import com.xiaomi.push.gr;
import com.xiaomi.push.gu;
import java.util.Map;

public class bn extends gr {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82551a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bn(XMPushService xMPushService, Map map, int i, String str, gu guVar) {
        super(map, i, str, guVar);
        this.f82551a = xMPushService;
    }

    public byte[] a() {
        try {
            fi.b bVar = new fi.b();
            bVar.a(ba.a().a());
            return bVar.a();
        } catch (Exception e2) {
            b.a("getOBBString err: " + e2.toString());
            return null;
        }
    }
}
