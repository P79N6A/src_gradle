package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class ar extends k implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static ArrayList<aq> f79452f;
    private static Map<String, String> g;

    /* renamed from: a  reason: collision with root package name */
    public byte f79453a;

    /* renamed from: b  reason: collision with root package name */
    public String f79454b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f79455c = "";

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<aq> f79456d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f79457e;

    public final void a(StringBuilder sb, int i) {
    }

    public final void a(j jVar) {
        jVar.a(this.f79453a, 0);
        if (this.f79454b != null) {
            jVar.a(this.f79454b, 1);
        }
        if (this.f79455c != null) {
            jVar.a(this.f79455c, 2);
        }
        if (this.f79456d != null) {
            jVar.a((Collection<T>) this.f79456d, 3);
        }
        if (this.f79457e != null) {
            jVar.a(this.f79457e, 4);
        }
    }

    public final void a(i iVar) {
        this.f79453a = iVar.a(this.f79453a, 0, true);
        this.f79454b = iVar.b(1, false);
        this.f79455c = iVar.b(2, false);
        if (f79452f == null) {
            f79452f = new ArrayList<>();
            f79452f.add(new aq());
        }
        this.f79456d = (ArrayList) iVar.a(f79452f, 3, false);
        if (g == null) {
            g = new HashMap();
            g.put("", "");
        }
        this.f79457e = (Map) iVar.a(g, 4, false);
    }
}
