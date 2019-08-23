package com.tencent.bugly.proguard;

public final class ah extends k implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public String f79406a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f79407b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f79408c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f79409d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f79410e = "";

    public final void a(StringBuilder sb, int i) {
    }

    public final void a(i iVar) {
        this.f79406a = iVar.b(0, true);
        this.f79407b = iVar.b(1, false);
        this.f79408c = iVar.b(2, false);
        this.f79410e = iVar.b(3, false);
        this.f79409d = iVar.b(4, false);
    }

    public final void a(j jVar) {
        jVar.a(this.f79406a, 0);
        if (this.f79407b != null) {
            jVar.a(this.f79407b, 1);
        }
        if (this.f79408c != null) {
            jVar.a(this.f79408c, 2);
        }
        if (this.f79410e != null) {
            jVar.a(this.f79410e, 3);
        }
        if (this.f79409d != null) {
            jVar.a(this.f79409d, 4);
        }
    }
}
