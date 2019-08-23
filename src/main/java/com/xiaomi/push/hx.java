package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;

public class hx implements al.b.a {

    /* renamed from: a  reason: collision with root package name */
    private int f82209a;

    /* renamed from: a  reason: collision with other field name */
    private gq f511a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f512a;

    /* renamed from: a  reason: collision with other field name */
    private al.b f513a;

    /* renamed from: a  reason: collision with other field name */
    private al.c f514a = al.c.binding;

    /* renamed from: a  reason: collision with other field name */
    private boolean f515a;

    hx(XMPushService xMPushService, al.b bVar) {
        this.f512a = xMPushService;
        this.f513a = bVar;
    }

    private void b() {
        this.f513a.b(this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r3 = this;
            r3.b()
            boolean r0 = r3.f515a
            if (r0 != 0) goto L_0x0009
            goto L_0x0083
        L_0x0009:
            int r0 = r3.f82209a
            r1 = 11
            if (r0 == r1) goto L_0x0083
            com.xiaomi.push.ic r0 = com.xiaomi.push.ic.a()
            com.xiaomi.push.gg r0 = r0.a()
            int[] r1 = com.xiaomi.push.hz.f82211a
            com.xiaomi.push.service.al$c r2 = r3.f514a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L_0x002e;
                case 2: goto L_0x005b;
                case 3: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x005b
        L_0x0025:
            com.xiaomi.push.gf r1 = com.xiaomi.push.gf.BIND_SUCCESS
        L_0x0027:
            int r1 = r1.a()
            r0.f418a = r1
            goto L_0x005b
        L_0x002e:
            int r1 = r3.f82209a
            r2 = 17
            if (r1 != r2) goto L_0x0037
            com.xiaomi.push.gf r1 = com.xiaomi.push.gf.BIND_TCP_READ_TIMEOUT
            goto L_0x0027
        L_0x0037:
            int r1 = r3.f82209a
            r2 = 21
            if (r1 != r2) goto L_0x0040
            com.xiaomi.push.gf r1 = com.xiaomi.push.gf.BIND_TIMEOUT
            goto L_0x0027
        L_0x0040:
            com.xiaomi.push.ib r1 = com.xiaomi.push.ic.a()     // Catch:{ NullPointerException -> 0x005a }
            java.lang.Exception r1 = r1.a()     // Catch:{ NullPointerException -> 0x005a }
            com.xiaomi.push.ia$a r1 = com.xiaomi.push.ia.c(r1)     // Catch:{ NullPointerException -> 0x005a }
            com.xiaomi.push.gf r2 = r1.f82213a     // Catch:{ NullPointerException -> 0x005a }
            int r2 = r2.a()     // Catch:{ NullPointerException -> 0x005a }
            r0.f418a = r2     // Catch:{ NullPointerException -> 0x005a }
            java.lang.String r1 = r1.f516a     // Catch:{ NullPointerException -> 0x005a }
            r0.c((java.lang.String) r1)     // Catch:{ NullPointerException -> 0x005a }
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x0083
            com.xiaomi.push.gq r1 = r3.f511a
            java.lang.String r1 = r1.a()
            r0.b((java.lang.String) r1)
            com.xiaomi.push.service.al$b r1 = r3.f513a
            java.lang.String r1 = r1.f942b
            r0.d((java.lang.String) r1)
            r1 = 1
            r0.f421b = r1
            com.xiaomi.push.service.al$b r1 = r3.f513a     // Catch:{ NumberFormatException -> 0x007c }
            java.lang.String r1 = r1.g     // Catch:{ NumberFormatException -> 0x007c }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x007c }
            byte r1 = (byte) r1     // Catch:{ NumberFormatException -> 0x007c }
            r0.a((byte) r1)     // Catch:{ NumberFormatException -> 0x007c }
        L_0x007c:
            com.xiaomi.push.ic r1 = com.xiaomi.push.ic.a()
            r1.a((com.xiaomi.push.gg) r0)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hx.c():void");
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f513a.a((al.b.a) this);
        this.f511a = this.f512a.a();
    }

    public void a(al.c cVar, al.c cVar2, int i) {
        if (!this.f515a && cVar == al.c.binding) {
            this.f514a = cVar2;
            this.f82209a = i;
            this.f515a = true;
        }
        this.f512a.a((XMPushService.i) new hy(this, 4));
    }
}
