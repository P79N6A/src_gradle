package com.vivo.push.b;

import com.vivo.push.a;
import java.io.Serializable;
import java.util.ArrayList;

public final class ab extends c {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f81492a;

    public final String toString() {
        return "TagCommand";
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a("tags", (Serializable) this.f81492a);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81492a = aVar.b("tags");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ab(boolean r1, java.lang.String r2, java.lang.String r3, java.util.ArrayList<java.lang.String> r4) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0005
            r1 = 2004(0x7d4, float:2.808E-42)
            goto L_0x0007
        L_0x0005:
            r1 = 2005(0x7d5, float:2.81E-42)
        L_0x0007:
            r0.<init>(r1, r2, r3)
            r0.f81492a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.b.ab.<init>(boolean, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }
}
