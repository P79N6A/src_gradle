package com.tencent.bugly.proguard;

public final class ao extends k implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public String f79438a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f79439b = "";

    public final void a(StringBuilder sb, int i) {
    }

    public final void a(i iVar) {
        this.f79438a = iVar.b(0, true);
        this.f79439b = iVar.b(1, true);
    }

    public final void a(j jVar) {
        jVar.a(this.f79438a, 0);
        jVar.a(this.f79439b, 1);
    }
}
