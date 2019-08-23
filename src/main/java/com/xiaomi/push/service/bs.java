package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ac;
import com.xiaomi.push.gr;
import com.xiaomi.push.service.XMPushService;

public class bs extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82556a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f978a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ byte[] f979a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f82557b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bs(XMPushService xMPushService, int i, int i2, byte[] bArr, String str) {
        super(i);
        this.f82556a = xMPushService;
        this.f82557b = i2;
        this.f979a = bArr;
        this.f978a = str;
    }

    public String a() {
        return "clear account cache.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m625a() {
        l.a((Context) this.f82556a);
        al.a().a("5");
        ac.a(this.f82557b);
        XMPushService.a(this.f82556a).c(gr.a());
        this.f82556a.a(this.f979a, this.f978a);
    }
}
