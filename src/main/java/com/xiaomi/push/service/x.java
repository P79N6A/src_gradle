package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ik;
import com.xiaomi.push.iu;
import com.xiaomi.push.j;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import com.xiaomi.push.service.bc;
import java.util.HashMap;
import java.util.Map;

public final class x extends bc.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82602a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ k f1015a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x(String str, long j, XMPushService xMPushService, k kVar) {
        super(str, j);
        this.f82602a = xMPushService;
        this.f1015a = kVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(bc bcVar) {
        String a2 = bcVar.a("GAID", "gaid");
        String b2 = j.b((Context) this.f82602a);
        b.c("gaid :" + b2);
        if (!TextUtils.isEmpty(b2) && !TextUtils.equals(a2, b2)) {
            bcVar.a("GAID", "gaid", b2);
            jj jjVar = new jj();
            jjVar.b(this.f1015a.f82580d);
            jjVar.c(iu.ClientInfoUpdate.f570a);
            jjVar.a(aj.a());
            jjVar.a((Map<String, String>) new HashMap<String,String>());
            jjVar.a().put("gaid", b2);
            this.f82602a.a(this.f82602a.getPackageName(), ju.a(w.a(this.f82602a.getPackageName(), this.f1015a.f82580d, jjVar, ik.Notification)), true);
        }
    }
}
