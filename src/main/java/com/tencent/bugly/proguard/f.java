package com.tencent.bugly.proguard;

import com.google.a.a.a.a.a.a;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public final class f extends k {
    private static byte[] k = null;
    private static Map<String, String> l = null;
    private static /* synthetic */ boolean m = (!f.class.desiredAssertionStatus());

    /* renamed from: a  reason: collision with root package name */
    public short f79464a;

    /* renamed from: b  reason: collision with root package name */
    public int f79465b;

    /* renamed from: c  reason: collision with root package name */
    public String f79466c;

    /* renamed from: d  reason: collision with root package name */
    public String f79467d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f79468e;

    /* renamed from: f  reason: collision with root package name */
    private byte f79469f;
    private int g;
    private int h;
    private Map<String, String> i;
    private Map<String, String> j;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final void a(j jVar) {
        jVar.a(this.f79464a, 1);
        jVar.a(this.f79469f, 2);
        jVar.a(this.g, 3);
        jVar.a(this.f79465b, 4);
        jVar.a(this.f79466c, 5);
        jVar.a(this.f79467d, 6);
        jVar.a(this.f79468e, 7);
        jVar.a(this.h, 8);
        jVar.a(this.i, 9);
        jVar.a(this.j, 10);
    }

    public final boolean equals(Object obj) {
        f fVar = (f) obj;
        if (!l.a(1, (int) fVar.f79464a) || !l.a(1, (int) fVar.f79469f) || !l.a(1, fVar.g) || !l.a(1, fVar.f79465b) || !l.a((Object) 1, (Object) fVar.f79466c) || !l.a((Object) 1, (Object) fVar.f79467d) || !l.a((Object) 1, (Object) fVar.f79468e) || !l.a(1, fVar.h) || !l.a((Object) 1, (Object) fVar.i) || !l.a((Object) 1, (Object) fVar.j)) {
            return false;
        }
        return true;
    }

    public final void a(i iVar) {
        try {
            this.f79464a = iVar.a(this.f79464a, 1, true);
            this.f79469f = iVar.a(this.f79469f, 2, true);
            this.g = iVar.a(this.g, 3, true);
            this.f79465b = iVar.a(this.f79465b, 4, true);
            this.f79466c = iVar.b(5, true);
            this.f79467d = iVar.b(6, true);
            if (k == null) {
                k = new byte[]{0};
            }
            this.f79468e = iVar.c(7, true);
            this.h = iVar.a(this.h, 8, true);
            if (l == null) {
                HashMap hashMap = new HashMap();
                l = hashMap;
                hashMap.put("", "");
            }
            this.i = (Map) iVar.a(l, 9, true);
            if (l == null) {
                HashMap hashMap2 = new HashMap();
                l = hashMap2;
                hashMap2.put("", "");
            }
            this.j = (Map) iVar.a(l, 10, true);
        } catch (Exception e2) {
            a.b(e2);
            PrintStream printStream = System.out;
            printStream.println("RequestPacket decode error " + e.a(this.f79468e));
            throw new RuntimeException(e2);
        }
    }

    public final void a(StringBuilder sb, int i2) {
        h hVar = new h(sb, i2);
        hVar.a(this.f79464a, "iVersion");
        hVar.a(this.f79469f, "cPacketType");
        hVar.a(this.g, "iMessageType");
        hVar.a(this.f79465b, "iRequestId");
        hVar.a(this.f79466c, "sServantName");
        hVar.a(this.f79467d, "sFuncName");
        hVar.a(this.f79468e, "sBuffer");
        hVar.a(this.h, "iTimeout");
        hVar.a(this.i, "context");
        hVar.a(this.j, "status");
    }
}
