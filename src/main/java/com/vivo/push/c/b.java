package com.vivo.push.c;

import com.google.a.a.a.a.a.a;
import com.vivo.push.b.aa;
import com.vivo.push.b.d;
import com.vivo.push.b.f;
import com.vivo.push.util.r;
import com.vivo.push.v;
import com.vivo.push.y;

public final class b extends v {
    b(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        boolean z;
        com.vivo.push.model.b a2 = r.a(this.f81705a);
        if (((d) yVar).d()) {
            try {
                z = f.a(this.f81705a);
            } catch (Exception e2) {
                a.b(e2);
                return;
            }
        } else {
            z = f.b(this.f81705a);
        }
        if (z) {
            com.vivo.push.model.b a3 = r.a(this.f81705a);
            if (a2 == null || a3 == null || a3.a() == null || !a3.a().equals(a2.a())) {
                if (!(a2 == null || a2.a() == null)) {
                    com.vivo.push.a.a.a(this.f81705a, a2.a(), (y) new aa(a2.a()));
                }
                if (!(a3 == null || a3.a() == null)) {
                    com.vivo.push.a.a.a(this.f81705a, a3.a(), (y) new f());
                }
            }
        }
    }
}
