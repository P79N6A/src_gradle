package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;
import java.io.IOException;
import java.util.Collection;
import org.json.JSONException;

public class n extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f82587a;

    /* renamed from: a  reason: collision with other field name */
    private String f999a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f1000a;

    /* renamed from: b  reason: collision with root package name */
    private String f82588b;

    /* renamed from: c  reason: collision with root package name */
    private String f82589c;

    public n(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f82587a = xMPushService;
        this.f999a = str;
        this.f1000a = bArr;
        this.f82588b = str2;
        this.f82589c = str3;
    }

    public String a() {
        return "register app";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m644a() {
        al.b bVar;
        k a2 = l.a((Context) this.f82587a);
        if (a2 == null) {
            try {
                a2 = l.a(this.f82587a, this.f999a, this.f82588b, this.f82589c);
            } catch (IOException | JSONException e2) {
                b.a(e2);
            }
        }
        if (a2 == null) {
            b.d("no account for mipush");
            o.a(this.f82587a, 70000002, "no account.");
        } else {
            Collection a3 = al.a().a("5");
            if (a3.isEmpty()) {
                bVar = a2.a(this.f82587a);
                w.a(this.f82587a, bVar);
                al.a().a(bVar);
            } else {
                bVar = (al.b) a3.iterator().next();
            }
            if (this.f82587a.c()) {
                try {
                    if (bVar.f937a == al.c.binded) {
                        w.a(this.f82587a, this.f999a, this.f1000a);
                    } else if (bVar.f937a == al.c.unbind) {
                        XMPushService xMPushService = this.f82587a;
                        XMPushService xMPushService2 = this.f82587a;
                        xMPushService2.getClass();
                        xMPushService.a((XMPushService.i) new XMPushService.a(bVar));
                    }
                } catch (hb e3) {
                    b.a((Throwable) e3);
                    this.f82587a.a(10, (Exception) e3);
                }
            } else {
                this.f82587a.a(true);
            }
        }
    }
}
