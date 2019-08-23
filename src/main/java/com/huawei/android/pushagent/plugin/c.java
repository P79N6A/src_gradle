package com.huawei.android.pushagent.plugin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.android.pushagent.plugin.a.a;
import com.huawei.android.pushagent.plugin.a.d;
import com.huawei.android.pushagent.utils.a.a.h;
import com.huawei.android.pushagent.utils.a.b;
import com.huawei.android.pushagent.utils.a.e;
import java.util.Date;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f25144a;

    /* renamed from: b  reason: collision with root package name */
    private String f25145b;

    /* renamed from: c  reason: collision with root package name */
    private int f25146c;

    /* renamed from: d  reason: collision with root package name */
    private a f25147d;

    public c(Context context, String str) {
        this.f25144a = context;
        this.f25145b = str;
        this.f25147d = new a(context, str);
    }

    private String a(Context context, String str) {
        e.b("PushLogSC2815", "begin to fetch salt");
        String a2 = com.huawei.android.pushagent.plugin.c.b.a.a(context, str, this.f25147d.c());
        if (a2 == null) {
            return null;
        }
        com.huawei.android.pushagent.plugin.a.e eVar = new com.huawei.android.pushagent.plugin.a.e();
        eVar.a(a2);
        e.a("PushLogSC2815", " saltValue reponse");
        if (eVar.c() > 0) {
            this.f25147d.b(Long.valueOf(eVar.c()));
        }
        if (eVar.d() > 0) {
            this.f25147d.c(Long.valueOf(eVar.d()));
        }
        if (eVar.b() >= 0) {
            this.f25147d.a(eVar.b());
        }
        if (TextUtils.isEmpty(eVar.a())) {
            e.b("PushLogSC2815", "fetch salt fail");
            return null;
        }
        this.f25147d.b(eVar.a());
        return String.valueOf(eVar.a().hashCode());
    }

    private void a(int i, int i2, String str) {
        this.f25144a.sendBroadcast(new Intent("com.huawei.android.push.plugin.RESPONSE").putExtra("reportType", i).putExtra("reportRetCode", i2).putExtra("reportTagContent", str).putExtra("reportExtra", new Bundle()).setPackage(this.f25145b));
        e.a("PushLogSC2815", "send plugin report result to app");
    }

    private boolean a() {
        return !TextUtils.isEmpty(this.f25147d.a());
    }

    public int a(com.huawei.android.pushagent.plugin.b.a aVar) {
        String str;
        String a2 = aVar.a(this.f25144a);
        int a3 = aVar.a();
        int d2 = aVar.d();
        String c2 = aVar.c();
        String b2 = aVar.b();
        try {
            if (TextUtils.isEmpty(c2)) {
                e.b("PushLogSC2815", "plugin report token is empty.");
                a(a3, 907122004, a2);
                return 907122004;
            }
            int i = -1;
            if (-1 == b.a(this.f25144a)) {
                e.b("PushLogSC2815", "network unavailable");
                a(a3, 907122005, a2);
                return 907122005;
            }
            long b3 = this.f25147d.b();
            if (0 == b3 || b3 <= System.currentTimeMillis()) {
                this.f25147d.e();
                if (TextUtils.isEmpty(a2)) {
                    a(a3, 907122003, a2);
                    return 907122003;
                }
                if (!a()) {
                    e.b("PushLogSC2815", "salt is null, need to get salt");
                    str = a(this.f25144a, c2);
                } else {
                    str = String.valueOf(this.f25147d.a().hashCode());
                }
                String str2 = str;
                if (TextUtils.isEmpty(str2)) {
                    a(a3, 907122002, a2);
                    return 907122002;
                }
                com.huawei.android.pushagent.plugin.a.c cVar = new com.huawei.android.pushagent.plugin.a.c(h.a(c2), d2, str2, a2, b2, this.f25145b);
                String a4 = com.huawei.android.pushagent.plugin.c.b.a.a(this.f25144a, cVar, this.f25147d.c());
                d dVar = new d();
                if (a4 != null) {
                    dVar.a(a4);
                    i = dVar.a();
                    e.a("PushLogSC2815", "ReportRsp is " + dVar.toString());
                }
                if (1 != i || this.f25146c >= 3) {
                    this.f25146c = 0;
                    if (i == 0) {
                        if (com.huawei.android.pushagent.plugin.a.b.TAG.a() == a3) {
                            a(a3, 907122001, a2);
                        }
                        return 907122001;
                    } else if (3 == i) {
                        a(a3, 907122001, a2);
                        this.f25147d.a(Long.valueOf((((long) Integer.parseInt(dVar.b())) * 60000) + System.currentTimeMillis()));
                        e.a("PushLogSC2815", "please report after " + r1 + "min");
                        return 907122001;
                    } else {
                        a(a3, 907122002, a2);
                        return 907122002;
                    }
                } else {
                    e.b("PushLogSC2815", "salt has expired, need re-fetch");
                    this.f25146c++;
                    this.f25147d.d();
                    return a(aVar);
                }
            } else {
                e.b("PushLogSC2815", "you can not repotr before " + new Date(b3));
                a(a3, 907122006, a2);
                return 907122006;
            }
        } catch (Exception e2) {
            a(a3, 907122002, a2);
            e.c("PushLogSC2815", e2.getMessage(), e2);
            return 907122002;
        }
    }
}
