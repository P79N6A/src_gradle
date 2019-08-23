package com.vivo.push.b;

import com.vivo.push.a;
import java.io.Serializable;
import java.util.HashMap;

public final class y extends com.vivo.push.y {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, String> f81529a;

    /* renamed from: b  reason: collision with root package name */
    private long f81530b;

    public y() {
        super(2012);
    }

    public final String toString() {
        return "ReporterCommand（" + this.f81530b + ")";
    }

    public final void a(HashMap<String, String> hashMap) {
        this.f81529a = hashMap;
    }

    public y(long j) {
        this();
        this.f81530b = j;
    }

    public final void c(a aVar) {
        aVar.a("ReporterCommand.EXTRA_PARAMS", (Serializable) this.f81529a);
        aVar.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.f81530b);
    }

    public final void d(a aVar) {
        this.f81529a = (HashMap) aVar.c("ReporterCommand.EXTRA_PARAMS");
        this.f81530b = aVar.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.f81530b);
    }
}
