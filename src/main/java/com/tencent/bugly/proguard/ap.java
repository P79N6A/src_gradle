package com.tencent.bugly.proguard;

import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public final class ap extends k implements Cloneable {
    private static ao m = new ao();
    private static Map<String, String> n = new HashMap();
    private static /* synthetic */ boolean o = (!ap.class.desiredAssertionStatus());

    /* renamed from: a  reason: collision with root package name */
    public boolean f79440a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f79441b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79442c = true;

    /* renamed from: d  reason: collision with root package name */
    public String f79443d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f79444e = "";

    /* renamed from: f  reason: collision with root package name */
    public ao f79445f;
    public Map<String, String> g;
    public long h;
    public int i;
    private String j = "";
    private String k = "";
    private int l;

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e2) {
            a.b(e2);
            return 0;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    static {
        n.put("", "");
    }

    public final void a(i iVar) {
        this.f79440a = iVar.a(0, true);
        this.f79441b = iVar.a(1, true);
        this.f79442c = iVar.a(2, true);
        this.f79443d = iVar.b(3, false);
        this.f79444e = iVar.b(4, false);
        this.f79445f = (ao) iVar.a((k) m, 5, false);
        this.g = (Map) iVar.a(n, 6, false);
        this.h = iVar.a(this.h, 7, false);
        this.j = iVar.b(8, false);
        this.k = iVar.b(9, false);
        this.l = iVar.a(this.l, 10, false);
        this.i = iVar.a(this.i, 11, false);
    }

    public final void a(j jVar) {
        jVar.a(this.f79440a, 0);
        jVar.a(this.f79441b, 1);
        jVar.a(this.f79442c, 2);
        if (this.f79443d != null) {
            jVar.a(this.f79443d, 3);
        }
        if (this.f79444e != null) {
            jVar.a(this.f79444e, 4);
        }
        if (this.f79445f != null) {
            jVar.a((k) this.f79445f, 5);
        }
        if (this.g != null) {
            jVar.a(this.g, 6);
        }
        jVar.a(this.h, 7);
        if (this.j != null) {
            jVar.a(this.j, 8);
        }
        if (this.k != null) {
            jVar.a(this.k, 9);
        }
        jVar.a(this.l, 10);
        jVar.a(this.i, 11);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ap apVar = (ap) obj;
        if (!l.a(this.f79440a, apVar.f79440a) || !l.a(this.f79441b, apVar.f79441b) || !l.a(this.f79442c, apVar.f79442c) || !l.a((Object) this.f79443d, (Object) apVar.f79443d) || !l.a((Object) this.f79444e, (Object) apVar.f79444e) || !l.a((Object) this.f79445f, (Object) apVar.f79445f) || !l.a((Object) this.g, (Object) apVar.g) || !l.a(this.h, apVar.h) || !l.a((Object) this.j, (Object) apVar.j) || !l.a((Object) this.k, (Object) apVar.k) || !l.a(this.l, apVar.l) || !l.a(this.i, apVar.i)) {
            return false;
        }
        return true;
    }

    public final void a(StringBuilder sb, int i2) {
        h hVar = new h(sb, i2);
        hVar.a(this.f79440a, "enable");
        hVar.a(this.f79441b, "enableUserInfo");
        hVar.a(this.f79442c, "enableQuery");
        hVar.a(this.f79443d, PushConstants.WEB_URL);
        hVar.a(this.f79444e, "expUrl");
        hVar.a((k) this.f79445f, "security");
        hVar.a(this.g, "valueMap");
        hVar.a(this.h, "strategylastUpdateTime");
        hVar.a(this.j, "httpsUrl");
        hVar.a(this.k, "httpsExpUrl");
        hVar.a(this.l, "eventRecordCount");
        hVar.a(this.i, "eventTimeInterval");
    }
}
