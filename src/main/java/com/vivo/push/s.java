package com.vivo.push;

public final class s implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p f81633a;

    s(p pVar) {
        this.f81633a = pVar;
    }

    public final void onStateChanged(int i) {
        if (i == 0) {
            String unused = this.f81633a.l = "";
            this.f81633a.k.a("APP_TOKEN", "");
            this.f81633a.u();
            this.f81633a.k.c("APP_TAGS");
            return;
        }
        String unused2 = this.f81633a.l = null;
        this.f81633a.k.c("APP_TOKEN");
    }
}
