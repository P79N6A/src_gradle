package com.vivo.push.b;

import com.vivo.push.a;
import java.util.ArrayList;

public final class m extends s {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f81510a;

    public final String toString() {
        return "OnListTagCommand";
    }

    public final ArrayList<String> d() {
        return this.f81510a;
    }

    public m() {
        super(8);
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a("tags_list", this.f81510a);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81510a = aVar.b("tags_list");
    }
}
