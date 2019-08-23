package com.vivo.push.b;

import com.vivo.push.a;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private String f81493a;

    /* renamed from: b  reason: collision with root package name */
    private String f81494b;

    /* renamed from: c  reason: collision with root package name */
    private String f81495c;

    /* renamed from: d  reason: collision with root package name */
    private String f81496d;

    public final void d() {
        this.f81495c = null;
    }

    public final void e() {
        this.f81494b = null;
    }

    public final String toString() {
        return "AppCommand:" + b();
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a("sdk_clients", this.f81493a);
        aVar.a("sdk_version", 270);
        aVar.a("BaseAppCommand.EXTRA_APPID", this.f81495c);
        aVar.a("BaseAppCommand.EXTRA_APPKEY", this.f81494b);
        aVar.a("PUSH_REGID", this.f81496d);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81493a = aVar.a("sdk_clients");
        this.f81495c = aVar.a("BaseAppCommand.EXTRA_APPID");
        this.f81494b = aVar.a("BaseAppCommand.EXTRA_APPKEY");
        this.f81496d = aVar.a("PUSH_REGID");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(boolean r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0005
            r2 = 2006(0x7d6, float:2.811E-42)
            goto L_0x0007
        L_0x0005:
            r2 = 2007(0x7d7, float:2.812E-42)
        L_0x0007:
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.b.b.<init>(boolean, java.lang.String):void");
    }
}
