package com.xiaomi.push.service;

import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ij;
import com.xiaomi.push.io;
import com.xiaomi.push.service.XMPushService;
import java.util.List;

public class i implements ij {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final XMPushService f82574a;

    public i(XMPushService xMPushService) {
        this.f82574a = xMPushService;
    }

    /* access modifiers changed from: private */
    public String a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : c.a(this.f82574a, "pref_registered_pkg_names", 0).getString(str, null);
    }

    public void a(List<io> list, String str, String str2) {
        b.a("TinyData LongConnUploader.upload items size:" + list.size() + "  ts:" + System.currentTimeMillis());
        XMPushService xMPushService = this.f82574a;
        j jVar = new j(this, 4, str, list, str2);
        xMPushService.a((XMPushService.i) jVar);
    }
}
